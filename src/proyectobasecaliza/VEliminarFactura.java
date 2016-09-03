/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasecaliza;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge García
 */
public class VEliminarFactura extends javax.swing.JFrame {

    String factId;
    
    public VEliminarFactura() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFactura = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliminar Factura");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Eliminar Factura");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione la factura a Eliminar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        ResultSet rs=null;
        try{
            rs=Sistema.getNewAccess().query2("{call allFact ()}");
        }catch(Exception e){

        }
        DefaultTableModel dfm = new DefaultTableModel();
        tbFactura.setModel(dfm);
        dfm.setColumnIdentifiers(new Object[]{"Num Factura","Fecha Emision","Fecha Vencimiento","Estado","Sacos Vendidos","Precio unitario","Precio total","Id Producto","Ruc Cliente","Cedula empleado"});
        try{
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getString("IdFactura"),rs.getDate("Fecha_Emision"),rs.getDate("Fecha_Vencimiento"),rs.getString("Estado"),rs.getInt("Sacos_Vendidos"),rs.getFloat("Precio_Unitario"),rs.getFloat("Precio_Total"),rs.getString("IdProducto"),rs.getString("RUC_Cliente"),rs.getString("Cedula_Empleados")});
            }
        }catch(Exception e){

        }
        tbFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFacturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbFactura);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 930, 320));

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, -1, -1));

        lbFondo.setForeground(new java.awt.Color(255, 255, 255));
        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobasecaliza/Fondo 1.jpg"))); // NOI18N
        lbFondo.setText("Eliminar Factura");
        getContentPane().add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 500));
        lbFondo.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        VPrincipal ventana= new VPrincipal();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void tbFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFacturaMouseClicked
        int fila = tbFactura.rowAtPoint(evt.getPoint());
        factId = tbFactura.getValueAt(fila,0).toString(); 
    }//GEN-LAST:event_tbFacturaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection cn= Sistema.getNewAccess().getConn();
        CallableStatement mycall;
        
        try{
            mycall =cn.prepareCall("{call EliminarFactura('"+factId+"')}");
            mycall.execute();
            JOptionPane notificacion = new JOptionPane();
            notificacion.showMessageDialog(rootPane, "Facttura eliminada exitosamente", "Eliminar factura", JOptionPane.INFORMATION_MESSAGE);
            VEliminarFactura ventana = new VEliminarFactura();
            ventana.setLocation(this.getLocation());
            this.dispose();
            ventana.setVisible(true);
        }catch(Exception e){
            System.out.println("se produjo una excepcion");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VEliminarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VEliminarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VEliminarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VEliminarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VEliminarFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JTable tbFactura;
    // End of variables declaration//GEN-END:variables
}
