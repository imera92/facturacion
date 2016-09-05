/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasecaliza;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge García
 */
public class VCrearPagoCheque extends javax.swing.JFrame {

    /**
     * Creates new form VCrearPago
     */
    public VCrearPagoCheque() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfNumComprobante = new javax.swing.JTextField();
        tfFechaEmi = new javax.swing.JTextField();
        tfNumCheque = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfBancoCheque = new javax.swing.JTextField();
        tfValorCancelado = new javax.swing.JTextField();
        tfNumFactura = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        jcFormasPago = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(360, 330));
        setPreferredSize(new java.awt.Dimension(360, 330));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(360, 330));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 330));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Crear Pago");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero Comprobante:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de pago:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Num Cheque");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel1.add(tfNumComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 120, -1));
        jPanel1.add(tfFechaEmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 120, -1));

        tfNumCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumChequeActionPerformed(evt);
            }
        });
        jPanel1.add(tfNumCheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 120, -1));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Banco Cheque");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Valor cancelado");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Num Factura");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Id forma de pago");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
        jPanel1.add(tfBancoCheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 120, -1));
        jPanel1.add(tfValorCancelado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 120, -1));
        jPanel1.add(tfNumFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 120, -1));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jcFormasPago.setModel(new DefaultComboBoxModel(Sistema.getFormasPago().toArray()));
        jcFormasPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcFormasPagoActionPerformed(evt);
            }
        });
        jPanel1.add(jcFormasPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 120, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 376, 369);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNumChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumChequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumChequeActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        VPrincipal ventana= new VPrincipal();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        try {
            Sistema.getNewAccess().write2("{call insertPaymeCheque('"+tfNumComprobante.getText()+"', '"+tfFechaEmi.getText()+"', '"+tfNumCheque.getText()+"', '"+tfBancoCheque.getText()+"', "+tfValorCancelado.getText()+", '"+tfNumFactura.getText()+"','"+jcFormasPago.getSelectedIndex()+"')}");
            JOptionPane notificacion = new JOptionPane();
            this.tfNumComprobante.setText("");
            this.tfFechaEmi.setText("");
            this.tfNumCheque.setText("");
            this.tfBancoCheque.setText("");
            this.tfValorCancelado.setText("");
            this.tfNumFactura.setText("");
            this.jcFormasPago.setSelectedIndex(-1);
            notificacion.showMessageDialog(rootPane, "Pago ingresado exitosamente", "Pago con cheque", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void jcFormasPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcFormasPagoActionPerformed
        
    }//GEN-LAST:event_jcFormasPagoActionPerformed

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
            java.util.logging.Logger.getLogger(VCrearPagoCheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCrearPagoCheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCrearPagoCheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCrearPagoCheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCrearPagoCheque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcFormasPago;
    private javax.swing.JTextField tfBancoCheque;
    private javax.swing.JTextField tfFechaEmi;
    private javax.swing.JTextField tfNumCheque;
    private javax.swing.JTextField tfNumComprobante;
    private javax.swing.JTextField tfNumFactura;
    private javax.swing.JTextField tfValorCancelado;
    // End of variables declaration//GEN-END:variables
}
