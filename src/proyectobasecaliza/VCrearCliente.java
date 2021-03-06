/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasecaliza;

import java.sql.CallableStatement;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge García
 */
public class VCrearCliente extends javax.swing.JFrame {

    /**
     * Creates new form VCrearCliente
     */
    public VCrearCliente() {
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
        lbTituloCrear = new javax.swing.JLabel();
        lbRUC = new javax.swing.JLabel();
        tfRUC = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        lbDirección = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        lbTelefono = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Cliente");
        setIconImage(getIconImage());
        setResizable(false);
        setSize(new java.awt.Dimension(1020, 500));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(370, 525));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 525));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTituloCrear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTituloCrear.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloCrear.setText("Crear Cliente");
        jPanel1.add(lbTituloCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 220, 50));

        lbRUC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbRUC.setForeground(new java.awt.Color(255, 255, 255));
        lbRUC.setText("RUC:");
        jPanel1.add(lbRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        tfRUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRUCActionPerformed(evt);
            }
        });
        jPanel1.add(tfRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 190, -1));

        lbNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(255, 255, 255));
        lbNombre.setText("Nombre:");
        jPanel1.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });
        jPanel1.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 190, -1));

        lbDirección.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbDirección.setForeground(new java.awt.Color(255, 255, 255));
        lbDirección.setText("Dirección:");
        jPanel1.add(lbDirección, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel1.add(tfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 190, -1));

        lbTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lbTelefono.setText("Teléfono:");
        jPanel1.add(lbTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        jPanel1.add(tfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 190, -1));

        lbEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(255, 255, 255));
        lbEmail.setText("E-mail:");
        jPanel1.add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        jPanel1.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 190, -1));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 376, 314);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfRUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRUCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRUCActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        try{
            Sistema.getNewAccess().write2("{call insertClient('"+tfRUC.getText()+"', '"+tfNombre.getText()+"', '"+tfDireccion.getText()+"', '"+tfTelefono.getText()+"', '"+tfEmail.getText()+"')}");
            Sistema.getClientes().clear();
            Sistema.cargarClientes();
            this.tfRUC.setText("");
            this.tfNombre.setText("");
            this.tfDireccion.setText("");
            this.tfTelefono.setText("");
            this.tfEmail.setText("");
            JOptionPane notificacion = new JOptionPane();
            notificacion.showMessageDialog(rootPane, "Cliente creado exitosamente", "Crear cliente", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            System.out.println("se produjo una excepcion");
        }
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
         VPrincipal ventana= new VPrincipal();
         ventana.setLocation(this.getLocation());
         this.dispose();
         ventana.setVisible(true);  
    }//GEN-LAST:event_btnAtrasActionPerformed
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("proyectobasecaliza/icono.png"));
        return retValue;
    }
    
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
            java.util.logging.Logger.getLogger(VCrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCrearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCrearCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCrear;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDirección;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbRUC;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTituloCrear;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfRUC;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
