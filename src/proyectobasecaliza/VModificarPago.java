/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasecaliza;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Monica
 */
public class VModificarPago extends javax.swing.JFrame {

    DefaultTableModel dfm = new DefaultTableModel();
    public VModificarPago() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPago = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tfNumComprobante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfFechaEmi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfNumCheque = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfBancoCheque = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfBancoDeposito = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfCuentaDeposito = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfValorCancelado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfNumFactura = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfIDFormaPago = new javax.swing.JTextField();
        tfFilter = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modificar Pago");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccione el pago a modificar:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        ResultSet rs=null;
        try{
            rs=Sistema.getNewAccess().query2("{call allPayme ()}");
        }catch(Exception e){

        }
        tbPago.setModel(dfm);
        dfm.setColumnIdentifiers(new Object[]{"Num comprobante","Feccha Pago","Num Cheque","Banco Cheque","Banco Deposito","Cuenta Deposito","Valor Cancelado","Id factura", "Id Forma pago"});
        try{
            while(rs.next()){
                dfm.addRow(new Object[]{rs.getString(1),rs.getDate(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getFloat(7),rs.getString(8),rs.getInt(9)});
            }
        }catch(Exception e){

        }
        tbPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPagoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPago);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 630, 320));

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, -1, -1));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 430, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Numero Comprobante:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));
        jPanel1.add(tfNumComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 120, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de pago:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, -1, -1));
        jPanel1.add(tfFechaEmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 120, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Num Cheque");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, -1, -1));

        tfNumCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumChequeActionPerformed(evt);
            }
        });
        jPanel1.add(tfNumCheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 120, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Banco Cheque");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, -1));
        jPanel1.add(tfBancoCheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Banco deposito");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, -1, -1));
        jPanel1.add(tfBancoDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 120, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cuenta deposito");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, -1, -1));
        jPanel1.add(tfCuentaDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 120, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Valor cancelado");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, -1, -1));
        jPanel1.add(tfValorCancelado, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 320, 120, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Num Factura");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, -1, -1));
        jPanel1.add(tfNumFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, 120, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Id forma de pago");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, -1, -1));
        jPanel1.add(tfIDFormaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, 120, -1));

        tfFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFilterKeyReleased(evt);
            }
        });
        jPanel1.add(tfFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 110, 150, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 1036, 539);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        VPrincipal ventana= new VPrincipal();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void tfNumChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumChequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumChequeActionPerformed

    private void tbPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPagoMouseClicked
        int fila = tbPago.rowAtPoint(evt.getPoint());
        
        tfNumComprobante.setText(tbPago.getValueAt(fila,0).toString());
        tfNumComprobante.setEnabled(false);
        tfFechaEmi.setText(tbPago.getValueAt(fila,1).toString());
        if(tbPago.getValueAt(fila, 2)==null){
         
            tfNumCheque.setText("");
            tfBancoCheque.setText("");
        }else{
            tfNumCheque.setText(tbPago.getValueAt(fila,2).toString());
            tfBancoCheque.setText(tbPago.getValueAt(fila,3).toString());
        }
        if(tbPago.getValueAt(fila,4)==null){
            tfBancoDeposito.setText("");
            tfCuentaDeposito.setText("");
        }else{
            tfBancoDeposito.setText(tbPago.getValueAt(fila,4).toString());
            tfCuentaDeposito.setText(tbPago.getValueAt(fila,5).toString());
        }
        
        
        tfValorCancelado.setText(tbPago.getValueAt(fila,6).toString());
        tfNumFactura.setText(tbPago.getValueAt(fila,7).toString());
        tfIDFormaPago.setText(tbPago.getValueAt(fila,8).toString());
    }//GEN-LAST:event_tbPagoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Sistema.getNewAccess().write2("{call ModificarPago('"+tfNumComprobante.getText()+"', '"+tfFechaEmi.getText()+"', '"+tfNumCheque.getText()+"', '"+tfBancoCheque.getText()+"', '"+tfBancoDeposito.getText()+"', '"+tfCuentaDeposito.getText()+"', "+tfValorCancelado.getText()+", '"+tfNumFactura.getText()+"', "+tfIDFormaPago.getText()+")}");
            JOptionPane notificacion = new JOptionPane();
            notificacion.showMessageDialog(rootPane, "Pago modificado exitosamente", "Modificar Pago", JOptionPane.INFORMATION_MESSAGE);
            VModificarPago ventana = new VModificarPago();
            ventana.setLocation(this.getLocation());
            this.dispose();
            ventana.setVisible(true);
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFilterKeyReleased
        String query=tfFilter.getText();
        Sistema.filter(query, tbPago, dfm);
    }//GEN-LAST:event_tfFilterKeyReleased

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
            java.util.logging.Logger.getLogger(VModificarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VModificarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VModificarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VModificarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VModificarPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPago;
    private javax.swing.JTextField tfBancoCheque;
    private javax.swing.JTextField tfBancoDeposito;
    private javax.swing.JTextField tfCuentaDeposito;
    private javax.swing.JTextField tfFechaEmi;
    private javax.swing.JTextField tfFilter;
    private javax.swing.JTextField tfIDFormaPago;
    private javax.swing.JTextField tfNumCheque;
    private javax.swing.JTextField tfNumComprobante;
    private javax.swing.JTextField tfNumFactura;
    private javax.swing.JTextField tfValorCancelado;
    // End of variables declaration//GEN-END:variables
}
