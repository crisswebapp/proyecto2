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
public class ListaProducto extends javax.swing.JFrame {

    /**
     * Creates new form Usuario
     */
    public ListaProducto() {
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

        jPanelListaInventario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableListaInventario = new javax.swing.JTable();
        jtxtBuscar = new javax.swing.JTextField();
        jspBuscar = new javax.swing.JSeparator();
        jlblBuscarIcono = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jlblListaProductoIcono = new javax.swing.JLabel();
        jlblListaProducto = new javax.swing.JLabel();
        jspListaProducto = new javax.swing.JSeparator();
        jlblCerrar = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelListaInventario.setBackground(new java.awt.Color(255, 255, 255));
        jPanelListaInventario.setPreferredSize(new java.awt.Dimension(1000, 400));
        jPanelListaInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtableListaInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Codigo", "Nombre", "Descripcion", "Categoria", "Marca", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableListaInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtableListaInventario.setPreferredSize(new java.awt.Dimension(300, 200));
        jScrollPane1.setViewportView(jtableListaInventario);
        if (jtableListaInventario.getColumnModel().getColumnCount() > 0) {
            jtableListaInventario.getColumnModel().getColumn(0).setMinWidth(50);
            jtableListaInventario.getColumnModel().getColumn(0).setMaxWidth(60);
            jtableListaInventario.getColumnModel().getColumn(1).setMinWidth(100);
            jtableListaInventario.getColumnModel().getColumn(1).setMaxWidth(110);
            jtableListaInventario.getColumnModel().getColumn(5).setMinWidth(100);
            jtableListaInventario.getColumnModel().getColumn(5).setMaxWidth(110);
            jtableListaInventario.getColumnModel().getColumn(6).setMinWidth(60);
            jtableListaInventario.getColumnModel().getColumn(6).setMaxWidth(70);
        }

        jPanelListaInventario.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 760, 230));

        jtxtBuscar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtBuscar.setForeground(new java.awt.Color(153, 153, 153));
        jtxtBuscar.setText("Buscar por Nombre o Descripcion");
        jtxtBuscar.setBorder(null);
        jtxtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBuscarActionPerformed(evt);
            }
        });
        jPanelListaInventario.add(jtxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 200, 20));

        jspBuscar.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanelListaInventario.add(jspBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 240, -1));

        jlblBuscarIcono.setBackground(new java.awt.Color(255, 255, 255));
        jlblBuscarIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Search_32px.png"))); // NOI18N
        jPanelListaInventario.add(jlblBuscarIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaBuscarb.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaBuscar.png"))); // NOI18N
        btnBuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaBuscar.png"))); // NOI18N
        btnBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaBuscar.png"))); // NOI18N
        jPanelListaInventario.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 75, 25));

        jlblListaProductoIcono.setBackground(new java.awt.Color(255, 255, 255));
        jlblListaProductoIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/categoria.png"))); // NOI18N
        jPanelListaInventario.add(jlblListaProductoIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jlblListaProducto.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlblListaProducto.setForeground(new java.awt.Color(102, 102, 102));
        jlblListaProducto.setText("Lista de Productos");
        jPanelListaInventario.add(jlblListaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 17, -1, -1));
        jPanelListaInventario.add(jspListaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 860, -1));

        jlblCerrar.setBackground(new java.awt.Color(255, 255, 255));
        jlblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jlblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblCerrarMouseClicked(evt);
            }
        });
        jPanelListaInventario.add(jlblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        btnSeleccionar.setBackground(new java.awt.Color(255, 255, 255));
        btnSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaSeleccionarb.png"))); // NOI18N
        btnSeleccionar.setBorder(null);
        btnSeleccionar.setBorderPainted(false);
        btnSeleccionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeleccionar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaSeleccionar.png"))); // NOI18N
        btnSeleccionar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaSeleccionar.png"))); // NOI18N
        btnSeleccionar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaSeleccionar.png"))); // NOI18N
        jPanelListaInventario.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 362, 85, 25));

        getContentPane().add(jPanelListaInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBuscarActionPerformed

    private void jlblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCerrarMouseClicked
        this.dispose();
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
            java.util.logging.Logger.getLogger(ListaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new ListaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnSeleccionar;
    private javax.swing.JPanel jPanelListaInventario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlblBuscarIcono;
    public javax.swing.JLabel jlblCerrar;
    private javax.swing.JLabel jlblListaProducto;
    private javax.swing.JLabel jlblListaProductoIcono;
    private javax.swing.JSeparator jspBuscar;
    public javax.swing.JSeparator jspListaProducto;
    public javax.swing.JTable jtableListaInventario;
    public javax.swing.JTextField jtxtBuscar;
    // End of variables declaration//GEN-END:variables
}
