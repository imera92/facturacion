/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobasecaliza;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge García
 */
public class VPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VPrincipal
     */
    public VPrincipal() {
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jmiLogOut = new javax.swing.JMenuItem();
        jmCliente = new javax.swing.JMenu();
        jmiCrearCliente = new javax.swing.JMenuItem();
        jmiConsultarCliente = new javax.swing.JMenuItem();
        jmiModificarCliente = new javax.swing.JMenuItem();
        jmiEliminarCliente = new javax.swing.JMenuItem();
        jmFactura = new javax.swing.JMenu();
        jmiCrearFactura = new javax.swing.JMenuItem();
        jmiConsultarFactura = new javax.swing.JMenuItem();
        jmiModificarFactura = new javax.swing.JMenuItem();
        jmiEliminarFactura = new javax.swing.JMenuItem();
        jmRetencion = new javax.swing.JMenu();
        jmiCrearRetencion = new javax.swing.JMenuItem();
        jmiConsultarRetencion = new javax.swing.JMenuItem();
        jmiModificarRetencion = new javax.swing.JMenuItem();
        jmiEliminarRetencion = new javax.swing.JMenuItem();
        jmPago = new javax.swing.JMenu();
        jmCrear = new javax.swing.JMenu();
        jmiPagoCheque = new javax.swing.JMenuItem();
        jmiPagoDeposito = new javax.swing.JMenuItem();
        jmiConsultar = new javax.swing.JMenuItem();
        jmiModificar = new javax.swing.JMenuItem();
        jmiEliminar = new javax.swing.JMenuItem();
        jmProducto = new javax.swing.JMenu();
        jmiCrearProducto = new javax.swing.JMenuItem();
        jmiConsultarProducto = new javax.swing.JMenuItem();
        jmiModificarProducto = new javax.swing.JMenuItem();
        jmiEliminarProducto = new javax.swing.JMenuItem();
        jmAyuda = new javax.swing.JMenu();
        jmiAcercaDe = new javax.swing.JMenuItem();
        jmCxC = new javax.swing.JMenu();
        jmiConsultarCxC = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jmArchivo.setText("Cuenta");

        jmiLogOut.setText("Log out");
        jmiLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLogOutActionPerformed(evt);
            }
        });
        jmArchivo.add(jmiLogOut);

        jMenuBar1.add(jmArchivo);

        jmCliente.setText("Cliente");

        jmiCrearCliente.setText("Crear");
        jmiCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCrearClienteActionPerformed(evt);
            }
        });
        jmCliente.add(jmiCrearCliente);

        jmiConsultarCliente.setText("Consultar");
        jmiConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarClienteActionPerformed(evt);
            }
        });
        jmCliente.add(jmiConsultarCliente);

        jmiModificarCliente.setText("Modifcar");
        jmiModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarClienteActionPerformed(evt);
            }
        });
        jmCliente.add(jmiModificarCliente);

        jmiEliminarCliente.setText("Eliminar");
        jmiEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarClienteActionPerformed(evt);
            }
        });
        jmCliente.add(jmiEliminarCliente);

        jMenuBar1.add(jmCliente);

        jmFactura.setText("Factura");

        jmiCrearFactura.setText("Crear");
        jmiCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCrearFacturaActionPerformed(evt);
            }
        });
        jmFactura.add(jmiCrearFactura);

        jmiConsultarFactura.setText("Consultar");
        jmiConsultarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarFacturaActionPerformed(evt);
            }
        });
        jmFactura.add(jmiConsultarFactura);

        jmiModificarFactura.setText("Modificar");
        jmiModificarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarFacturaActionPerformed(evt);
            }
        });
        jmFactura.add(jmiModificarFactura);

        jmiEliminarFactura.setText("Eliminar");
        jmiEliminarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarFacturaActionPerformed(evt);
            }
        });
        jmFactura.add(jmiEliminarFactura);

        jMenuBar1.add(jmFactura);

        jmRetencion.setText("Retencion");

        jmiCrearRetencion.setText("Crear");
        jmiCrearRetencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCrearRetencionActionPerformed(evt);
            }
        });
        jmRetencion.add(jmiCrearRetencion);

        jmiConsultarRetencion.setText("Consultar");
        jmiConsultarRetencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarRetencionActionPerformed(evt);
            }
        });
        jmRetencion.add(jmiConsultarRetencion);

        jmiModificarRetencion.setText("Modificar");
        jmiModificarRetencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarRetencionActionPerformed(evt);
            }
        });
        jmRetencion.add(jmiModificarRetencion);

        jmiEliminarRetencion.setText("Eliminar");
        jmiEliminarRetencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarRetencionActionPerformed(evt);
            }
        });
        jmRetencion.add(jmiEliminarRetencion);

        jMenuBar1.add(jmRetencion);

        jmPago.setText("Pago");

        jmCrear.setText("Crear...");

        jmiPagoCheque.setText("Pago con cheque");
        jmiPagoCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPagoChequeActionPerformed(evt);
            }
        });
        jmCrear.add(jmiPagoCheque);

        jmiPagoDeposito.setText("Pago con deposito");
        jmiPagoDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPagoDepositoActionPerformed(evt);
            }
        });
        jmCrear.add(jmiPagoDeposito);

        jmPago.add(jmCrear);

        jmiConsultar.setText("Consultar");
        jmiConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarActionPerformed(evt);
            }
        });
        jmPago.add(jmiConsultar);

        jmiModificar.setText("Modificar");
        jmiModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarActionPerformed(evt);
            }
        });
        jmPago.add(jmiModificar);

        jmiEliminar.setText("Eliminar");
        jmiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarActionPerformed(evt);
            }
        });
        jmPago.add(jmiEliminar);

        jMenuBar1.add(jmPago);

        jmProducto.setText("Producto");

        jmiCrearProducto.setText("Crear");
        jmiCrearProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCrearProductoActionPerformed(evt);
            }
        });
        jmProducto.add(jmiCrearProducto);

        jmiConsultarProducto.setText("Consultar");
        jmiConsultarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarProductoActionPerformed(evt);
            }
        });
        jmProducto.add(jmiConsultarProducto);

        jmiModificarProducto.setText("Modificar");
        jmiModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarProductoActionPerformed(evt);
            }
        });
        jmProducto.add(jmiModificarProducto);

        jmiEliminarProducto.setText("Eliminar");
        jmiEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarProductoActionPerformed(evt);
            }
        });
        jmProducto.add(jmiEliminarProducto);

        jMenuBar1.add(jmProducto);

        jmAyuda.setText("Ayuda");

        jmiAcercaDe.setText("Acerca de...");
        jmiAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAcercaDeActionPerformed(evt);
            }
        });
        jmAyuda.add(jmiAcercaDe);

        jMenuBar1.add(jmAyuda);

        jmCxC.setText("Cuentas por Cobrar");

        jmiConsultarCxC.setText("Consultar");
        jmiConsultarCxC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultarCxCActionPerformed(evt);
            }
        });
        jmCxC.add(jmiConsultarCxC);

        jMenuBar1.add(jmCxC);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        setBounds(0, 0, 816, 489);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarActionPerformed
        VConsultarPago ventana =new VConsultarPago();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiConsultarActionPerformed

    private void jmiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarActionPerformed
        VModificarPago ventana =new VModificarPago();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiModificarActionPerformed

    private void jmiPagoDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPagoDepositoActionPerformed
        VCrearPagoDeposito ventana = new VCrearPagoDeposito();
        ventana.setLocationRelativeTo(null);
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiPagoDepositoActionPerformed

    private void jmiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarActionPerformed
        VEliminarPago ventana =new VEliminarPago();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiEliminarActionPerformed

    private void jmiLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLogOutActionPerformed
        Sistema.closeSession();
        VLogin ventana= new VLogin();
        ventana.setLocationRelativeTo(null);
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiLogOutActionPerformed

    private void jmiPagoChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPagoChequeActionPerformed
        VCrearPagoCheque ventana = new VCrearPagoCheque();
        ventana.setLocationRelativeTo(null);
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiPagoChequeActionPerformed

    private void jmiCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCrearClienteActionPerformed
        VCrearCliente ventana =new VCrearCliente();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiCrearClienteActionPerformed

    private void jmiConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarClienteActionPerformed
        VConsultarCliente ventana = null;
        try {
            ventana = new VConsultarCliente();
        } catch (SQLException ex) {
            Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiConsultarClienteActionPerformed

    private void jmiModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarClienteActionPerformed
        VModificarCliente ventana =new VModificarCliente();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiModificarClienteActionPerformed

    private void jmiEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarClienteActionPerformed
        VEliminarCliente ventana =new VEliminarCliente();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiEliminarClienteActionPerformed

    private void jmiCrearFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCrearFacturaActionPerformed
        VCrearFactura ventana =new VCrearFactura();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiCrearFacturaActionPerformed

    private void jmiConsultarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarFacturaActionPerformed
        VConsultarFactura ventana =new VConsultarFactura();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiConsultarFacturaActionPerformed

    private void jmiModificarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarFacturaActionPerformed
        VModificarFactura ventana =new VModificarFactura();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiModificarFacturaActionPerformed

    private void jmiEliminarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarFacturaActionPerformed
        VEliminarFactura ventana =new VEliminarFactura();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiEliminarFacturaActionPerformed

    private void jmiCrearRetencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCrearRetencionActionPerformed
        VCrearRetencion ventana =new VCrearRetencion();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiCrearRetencionActionPerformed

    private void jmiConsultarRetencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarRetencionActionPerformed
        VConsultarRetencion ventana =new VConsultarRetencion();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiConsultarRetencionActionPerformed

    private void jmiModificarRetencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarRetencionActionPerformed
        VModificarRetencion ventana =new VModificarRetencion();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiModificarRetencionActionPerformed

    private void jmiEliminarRetencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarRetencionActionPerformed
        VEliminarRetencion ventana =new VEliminarRetencion();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiEliminarRetencionActionPerformed

    private void jmiCrearProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCrearProductoActionPerformed
        VCrearProducto ventana =new VCrearProducto();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiCrearProductoActionPerformed

    private void jmiConsultarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarProductoActionPerformed
        VConsultarProducto ventana =new VConsultarProducto();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiConsultarProductoActionPerformed

    private void jmiModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarProductoActionPerformed
        VModificarProducto ventana =new VModificarProducto();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiModificarProductoActionPerformed

    private void jmiEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarProductoActionPerformed
        VEliminarProducto ventana =new VEliminarProducto();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiEliminarProductoActionPerformed

    private void jmiAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAcercaDeActionPerformed
        VAcercaDe ventana =new VAcercaDe();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiAcercaDeActionPerformed

    private void jmiConsultarCxCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultarCxCActionPerformed
        // TODO add your handling code here:
        VConsultarCxC ventana =new VConsultarCxC();
        ventana.setLocation(this.getLocation());
        this.dispose();
        ventana.setVisible(true);
    }//GEN-LAST:event_jmiConsultarCxCActionPerformed
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        Sistema.cerrar();
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
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmAyuda;
    private javax.swing.JMenu jmCliente;
    private javax.swing.JMenu jmCrear;
    private javax.swing.JMenu jmCxC;
    private javax.swing.JMenu jmFactura;
    private javax.swing.JMenu jmPago;
    private javax.swing.JMenu jmProducto;
    private javax.swing.JMenu jmRetencion;
    private javax.swing.JMenuItem jmiAcercaDe;
    private javax.swing.JMenuItem jmiConsultar;
    private javax.swing.JMenuItem jmiConsultarCliente;
    private javax.swing.JMenuItem jmiConsultarCxC;
    private javax.swing.JMenuItem jmiConsultarFactura;
    private javax.swing.JMenuItem jmiConsultarProducto;
    private javax.swing.JMenuItem jmiConsultarRetencion;
    private javax.swing.JMenuItem jmiCrearCliente;
    private javax.swing.JMenuItem jmiCrearFactura;
    private javax.swing.JMenuItem jmiCrearProducto;
    private javax.swing.JMenuItem jmiCrearRetencion;
    private javax.swing.JMenuItem jmiEliminar;
    private javax.swing.JMenuItem jmiEliminarCliente;
    private javax.swing.JMenuItem jmiEliminarFactura;
    private javax.swing.JMenuItem jmiEliminarProducto;
    private javax.swing.JMenuItem jmiEliminarRetencion;
    private javax.swing.JMenuItem jmiLogOut;
    private javax.swing.JMenuItem jmiModificar;
    private javax.swing.JMenuItem jmiModificarCliente;
    private javax.swing.JMenuItem jmiModificarFactura;
    private javax.swing.JMenuItem jmiModificarProducto;
    private javax.swing.JMenuItem jmiModificarRetencion;
    private javax.swing.JMenuItem jmiPagoCheque;
    private javax.swing.JMenuItem jmiPagoDeposito;
    // End of variables declaration//GEN-END:variables
}
