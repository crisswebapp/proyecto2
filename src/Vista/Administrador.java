/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import AppPackage.AnimationClass;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Orlando
 */
public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();
         this.setLocationRelativeTo(null);
    }
     public Image getIconImage(){
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Image/LogFormu.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAdministrador = new javax.swing.JPanel();
        jlblMenu = new javax.swing.JLabel();
        jlblMinimizar = new javax.swing.JLabel();
        jlblFacturas = new javax.swing.JLabel();
        jlblCorteCaja = new javax.swing.JLabel();
        jlblUsuarios = new javax.swing.JLabel();
        jlblReportes = new javax.swing.JLabel();
        jlblProveedores = new javax.swing.JLabel();
        jlblEntradas = new javax.swing.JLabel();
        jlblInventario = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnEntradas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnFacturas = new javax.swing.JButton();
        btnCorteCaja = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jlblCalculadora = new javax.swing.JLabel();
        jlblAdministrador = new javax.swing.JLabel();
        jlblConfiguracion = new javax.swing.JLabel();
        btnConfiguracion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelAdministrador.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelAdministrador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Menu_32px_1.png"))); // NOI18N
        jlblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblMenuMouseClicked(evt);
            }
        });
        jPanelAdministrador.add(jlblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jlblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jlblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblMinimizarMouseClicked(evt);
            }
        });
        jPanelAdministrador.add(jlblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, -1, -1));

        jlblFacturas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/facturas.png"))); // NOI18N
        jlblFacturas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlblFacturasMouseMoved(evt);
            }
        });
        jlblFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblFacturasMouseExited(evt);
            }
        });
        jPanelAdministrador.add(jlblFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 150, 100));

        jlblCorteCaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCorteCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CorteCaja.png"))); // NOI18N
        jlblCorteCaja.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlblCorteCajaMouseMoved(evt);
            }
        });
        jlblCorteCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblCorteCajaMouseExited(evt);
            }
        });
        jPanelAdministrador.add(jlblCorteCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 150, 100));

        jlblUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_96px_2.png"))); // NOI18N
        jlblUsuarios.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlblUsuariosMouseMoved(evt);
            }
        });
        jlblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblUsuariosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblUsuariosMouseExited(evt);
            }
        });
        jPanelAdministrador.add(jlblUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 150, 100));

        jlblReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/reportes.png"))); // NOI18N
        jlblReportes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlblReportesMouseMoved(evt);
            }
        });
        jlblReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblReportesMouseExited(evt);
            }
        });
        jPanelAdministrador.add(jlblReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 150, 100));

        jlblProveedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Handshake_96px.png"))); // NOI18N
        jlblProveedores.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlblProveedoresMouseMoved(evt);
            }
        });
        jlblProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblProveedoresMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblProveedoresMouseExited(evt);
            }
        });
        jPanelAdministrador.add(jlblProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 150, 100));

        jlblEntradas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblEntradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconoCarrito.png"))); // NOI18N
        jlblEntradas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlblEntradasMouseMoved(evt);
            }
        });
        jlblEntradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblEntradasMouseExited(evt);
            }
        });
        jPanelAdministrador.add(jlblEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 150, 100));

        jlblInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Inventario.png"))); // NOI18N
        jlblInventario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlblInventarioMouseMoved(evt);
            }
        });
        jlblInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblInventarioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblInventarioMouseExited(evt);
            }
        });
        jPanelAdministrador.add(jlblInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 150, 100));

        btnUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setForeground(new java.awt.Color(255, 99, 71));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconoUsuarios.png"))); // NOI18N
        btnUsuarios.setBorder(null);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelAdministrador.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 70, 20));

        btnProveedores.setBackground(new java.awt.Color(255, 255, 255));
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconoProveedores.png"))); // NOI18N
        btnProveedores.setBorder(null);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelAdministrador.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        btnEntradas.setBackground(new java.awt.Color(255, 255, 255));
        btnEntradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconoEntradas.png"))); // NOI18N
        btnEntradas.setBorder(null);
        btnEntradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelAdministrador.add(btnEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        btnInventario.setBackground(new java.awt.Color(255, 255, 255));
        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconoInventario.png"))); // NOI18N
        btnInventario.setBorder(null);
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelAdministrador.add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, -1, -1));

        btnReportes.setBackground(new java.awt.Color(255, 255, 255));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconoReportes.png"))); // NOI18N
        btnReportes.setBorder(null);
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelAdministrador.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        btnFacturas.setBackground(new java.awt.Color(255, 255, 255));
        btnFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconoFacturas.png"))); // NOI18N
        btnFacturas.setBorder(null);
        btnFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelAdministrador.add(btnFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        btnCorteCaja.setBackground(new java.awt.Color(255, 255, 255));
        btnCorteCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconoCorteCaja.png"))); // NOI18N
        btnCorteCaja.setBorder(null);
        btnCorteCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelAdministrador.add(btnCorteCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        btnCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cerrarSesion.png"))); // NOI18N
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(29, 29));
        jPanelAdministrador.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 60, 30, -1));

        jlblCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Calculator_32px.png"))); // NOI18N
        jlblCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblCalculadoraMouseClicked(evt);
            }
        });
        jPanelAdministrador.add(jlblCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 100, -1, -1));

        jlblAdministrador.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jlblAdministrador.setForeground(new java.awt.Color(102, 102, 102));
        jlblAdministrador.setText("Administrador");
        jPanelAdministrador.add(jlblAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jlblConfiguracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CategoriaMarca.png"))); // NOI18N
        jlblConfiguracion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlblConfiguracionMouseMoved(evt);
            }
        });
        jlblConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblConfiguracionMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblConfiguracionMouseExited(evt);
            }
        });
        jPanelAdministrador.add(jlblConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 150, 100));

        btnConfiguracion.setBackground(new java.awt.Color(255, 255, 255));
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Configuracion.png"))); // NOI18N
        btnConfiguracion.setBorder(null);
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelAdministrador.add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, -1, -1));

        getContentPane().add(jPanelAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMinimizarMouseClicked
          this.setState(Login.ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblMinimizarMouseClicked

    private void jlblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMenuMouseClicked
        AnimationClass cerrar= new AnimationClass();
            cerrar.jButtonXRight(-40, 10, 10, 5, btnCerrarSesion);

             AnimationClass calculadora= new AnimationClass();
            calculadora.jLabelXRight(-40, 10, 10, 5, jlblCalculadora);
            //<------
            AnimationClass cerrarr= new AnimationClass();
            cerrarr.jButtonXLeft(10, -40, 10, 5, btnCerrarSesion);

            AnimationClass calculadoraa= new AnimationClass();
            calculadoraa.jLabelXLeft(10, -40, 10, 5, jlblCalculadora);
    }//GEN-LAST:event_jlblMenuMouseClicked

    private void jlblCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCalculadoraMouseClicked
    try{
          Runtime rt=Runtime.getRuntime(); 
          Process p= rt.exec("calc");
          p.waitFor();
       }catch(Exception e){
           
       }
    }//GEN-LAST:event_jlblCalculadoraMouseClicked

    private void jlblUsuariosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblUsuariosMouseMoved
        jlblUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblUsuariosMouseMoved

    private void jlblUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblUsuariosMouseExited
        jlblUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
// TODO add your handling code here:
    }//GEN-LAST:event_jlblUsuariosMouseExited

    private void jlblProveedoresMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblProveedoresMouseMoved
        jlblProveedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblProveedoresMouseMoved

    private void jlblProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblProveedoresMouseExited
        jlblProveedores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));        // TODO add your handling code here:
    }//GEN-LAST:event_jlblProveedoresMouseExited

    private void jlblEntradasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblEntradasMouseMoved
        jlblEntradas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblEntradasMouseMoved

    private void jlblEntradasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblEntradasMouseExited
        jlblEntradas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblEntradasMouseExited

    private void jlblInventarioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblInventarioMouseMoved
        jlblInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
            // TODO add your handling code here:
    }//GEN-LAST:event_jlblInventarioMouseMoved

    private void jlblInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblInventarioMouseExited
        jlblInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblInventarioMouseExited

    private void jlblReportesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReportesMouseMoved
        jlblReportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblReportesMouseMoved

    private void jlblReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReportesMouseExited
        jlblReportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblReportesMouseExited

    private void jlblFacturasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblFacturasMouseMoved
        jlblFacturas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblFacturasMouseMoved

    private void jlblFacturasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblFacturasMouseExited
        jlblFacturas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jlblFacturasMouseExited

    private void jlblCorteCajaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCorteCajaMouseMoved
      jlblCorteCaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jlblCorteCajaMouseMoved

    private void jlblCorteCajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCorteCajaMouseExited
     jlblCorteCaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jlblCorteCajaMouseExited

    private void jlblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblUsuariosMouseClicked

    }//GEN-LAST:event_jlblUsuariosMouseClicked

    private void jlblProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblProveedoresMouseClicked
      
    }//GEN-LAST:event_jlblProveedoresMouseClicked

    private void jlblConfiguracionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblConfiguracionMouseMoved
        jlblConfiguracion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jlblConfiguracionMouseMoved

    private void jlblConfiguracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblConfiguracionMouseExited
        jlblConfiguracion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jlblConfiguracionMouseExited

    private void jlblConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblConfiguracionMouseClicked

    }//GEN-LAST:event_jlblConfiguracionMouseClicked

    private void jlblInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblInventarioMouseClicked

    }//GEN-LAST:event_jlblInventarioMouseClicked

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCerrarSesion;
    public javax.swing.JButton btnConfiguracion;
    public javax.swing.JButton btnCorteCaja;
    public javax.swing.JButton btnEntradas;
    public javax.swing.JButton btnFacturas;
    public javax.swing.JButton btnInventario;
    public javax.swing.JButton btnProveedores;
    public javax.swing.JButton btnReportes;
    public javax.swing.JButton btnUsuarios;
    public javax.swing.JPanel jPanelAdministrador;
    public javax.swing.JLabel jlblAdministrador;
    public javax.swing.JLabel jlblCalculadora;
    public javax.swing.JLabel jlblConfiguracion;
    public javax.swing.JLabel jlblCorteCaja;
    public javax.swing.JLabel jlblEntradas;
    public javax.swing.JLabel jlblFacturas;
    public javax.swing.JLabel jlblInventario;
    public javax.swing.JLabel jlblMenu;
    public javax.swing.JLabel jlblMinimizar;
    public javax.swing.JLabel jlblProveedores;
    public javax.swing.JLabel jlblReportes;
    public javax.swing.JLabel jlblUsuarios;
    // End of variables declaration//GEN-END:variables
}
