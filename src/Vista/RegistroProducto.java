/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Orlando
 */
public class RegistroProducto extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUsuario
     */
    public RegistroProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRegistrarUsuario = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jlblRegistrarProducto = new javax.swing.JLabel();
        jlblCerrar = new javax.swing.JLabel();
        jlblIocono = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jtxtCodigo = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jtxtDescripcion = new javax.swing.JTextField();
        jlblNombre = new javax.swing.JLabel();
        jlblCategoria = new javax.swing.JLabel();
        jlblMarca = new javax.swing.JLabel();
        jlblDescripcion = new javax.swing.JLabel();
        jlblCodigo = new javax.swing.JLabel();
        jcmbCategoria = new javax.swing.JComboBox<>();
        jcmbMarca = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRegistrarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistrarUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setPreferredSize(new java.awt.Dimension(400, 10));
        jPanelRegistrarUsuario.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 400, 10));

        jlblRegistrarProducto.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jlblRegistrarProducto.setForeground(new java.awt.Color(102, 102, 102));
        jlblRegistrarProducto.setText("Registrar/Modificar Producto");
        jPanelRegistrarUsuario.add(jlblRegistrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jlblCerrar.setBackground(new java.awt.Color(255, 255, 255));
        jlblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jlblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblCerrarMouseClicked(evt);
            }
        });
        jPanelRegistrarUsuario.add(jlblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 5, -1, -1));

        jlblIocono.setBackground(new java.awt.Color(255, 255, 255));
        jlblIocono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconoRegistrar.png"))); // NOI18N
        jPanelRegistrarUsuario.add(jlblIocono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 7, -1, -1));

        jtxtNombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(153, 153, 153));
        jtxtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
            }
        });
        jPanelRegistrarUsuario.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 250, 20));

        jtxtCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtCodigo.setForeground(new java.awt.Color(153, 153, 153));
        jtxtCodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCodigoActionPerformed(evt);
            }
        });
        jPanelRegistrarUsuario.add(jtxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 250, 20));

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaRegistrarb.png"))); // NOI18N
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaRegistrar.png"))); // NOI18N
        btnRegistrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaRegistrar.png"))); // NOI18N
        btnRegistrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaRegistrar.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanelRegistrarUsuario.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 75, 25));

        jtxtDescripcion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        jtxtDescripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDescripcionActionPerformed(evt);
            }
        });
        jPanelRegistrarUsuario.add(jtxtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 250, 20));

        jlblNombre.setBackground(new java.awt.Color(255, 255, 255));
        jlblNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblNombre.setForeground(new java.awt.Color(225, 99, 71));
        jlblNombre.setText("Nombre:");
        jPanelRegistrarUsuario.add(jlblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jlblCategoria.setBackground(new java.awt.Color(255, 255, 255));
        jlblCategoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblCategoria.setForeground(new java.awt.Color(225, 99, 71));
        jlblCategoria.setText("Categoria:");
        jPanelRegistrarUsuario.add(jlblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jlblMarca.setBackground(new java.awt.Color(255, 255, 255));
        jlblMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblMarca.setForeground(new java.awt.Color(225, 99, 71));
        jlblMarca.setText("Marca:");
        jPanelRegistrarUsuario.add(jlblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jlblDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        jlblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblDescripcion.setForeground(new java.awt.Color(225, 99, 71));
        jlblDescripcion.setText("Descripcion:");
        jPanelRegistrarUsuario.add(jlblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jlblCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jlblCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblCodigo.setForeground(new java.awt.Color(225, 99, 71));
        jlblCodigo.setText("Codigo:");
        jPanelRegistrarUsuario.add(jlblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jcmbCategoria.setBorder(null);
        jPanelRegistrarUsuario.add(jcmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 130, -1));

        jcmbMarca.setBorder(null);
        jPanelRegistrarUsuario.add(jcmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 130, -1));

        getContentPane().add(jPanelRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreActionPerformed

    private void jtxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoActionPerformed

    private void jtxtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDescripcionActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jlblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCerrarMouseClicked
        
    }//GEN-LAST:event_jlblCerrarMouseClicked

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
            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JPanel jPanelRegistrarUsuario;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JComboBox<String> jcmbCategoria;
    public javax.swing.JComboBox<String> jcmbMarca;
    public javax.swing.JLabel jlblCategoria;
    public javax.swing.JLabel jlblCerrar;
    public javax.swing.JLabel jlblCodigo;
    public javax.swing.JLabel jlblDescripcion;
    public javax.swing.JLabel jlblIocono;
    public javax.swing.JLabel jlblMarca;
    public javax.swing.JLabel jlblNombre;
    public javax.swing.JLabel jlblRegistrarProducto;
    public javax.swing.JTextField jtxtCodigo;
    public javax.swing.JTextField jtxtDescripcion;
    public javax.swing.JTextField jtxtNombre;
    // End of variables declaration//GEN-END:variables
}
