/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Orlando
 */
public class Configuracion extends javax.swing.JFrame {

    /**
     * Creates new form Configuracion
     */
    public Configuracion() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblInicio = new javax.swing.JLabel();
        jlblMinimizar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlblUsuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtCategoria = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnModificarC = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableCategoria = new javax.swing.JTable();
        btnEliminarC = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtMarca = new javax.swing.JTextField();
        btnGuardarM = new javax.swing.JButton();
        btnNuevoM = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnModificarLM = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtableMarca = new javax.swing.JTable();
        btnEliminarLM = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CategoriaMarca.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 2, 96, 96));

        jlblInicio.setBackground(new java.awt.Color(255, 255, 255));
        jlblInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Inicio.png"))); // NOI18N
        jlblInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblInicioMouseClicked(evt);
            }
        });
        jPanel2.add(jlblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 30, 30));

        jlblMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        jlblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jlblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblMinimizarMouseClicked(evt);
            }
        });
        jPanel2.add(jlblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 112, 85));
        jLabel5.setText("Configuración");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jlblUsuario.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jlblUsuario.setForeground(new java.awt.Color(105, 105, 105));
        jlblUsuario.setText("Nombre del Usuario");
        jPanel2.add(jlblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 340, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setPreferredSize(new java.awt.Dimension(1000, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/categoria.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 500, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Categoría");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 17, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(225, 99, 71));
        jLabel4.setText("Categoría:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jtxtCategoria.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtCategoria.setForeground(new java.awt.Color(153, 153, 153));
        jtxtCategoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 250, 20));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaGuardarb.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaGuardar.png"))); // NOI18N
        btnGuardar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaGuardar.png"))); // NOI18N
        btnGuardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaGuardar.png"))); // NOI18N
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaNuevob.png"))); // NOI18N
        btnNuevo.setBorder(null);
        btnNuevo.setBorderPainted(false);
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaNuevo.png"))); // NOI18N
        btnNuevo.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaNuevo.png"))); // NOI18N
        btnNuevo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaNuevo.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 500, 175));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 500, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/categoria.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Lista de Categoría");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 17, -1, -1));

        btnModificarC.setBackground(new java.awt.Color(255, 255, 255));
        btnModificarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaModificarb.png"))); // NOI18N
        btnModificarC.setBorder(null);
        btnModificarC.setBorderPainted(false);
        btnModificarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaModificar.png"))); // NOI18N
        btnModificarC.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaModificar.png"))); // NOI18N
        btnModificarC.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaModificar.png"))); // NOI18N
        jPanel3.add(btnModificarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jtableCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtableCategoria);
        if (jtableCategoria.getColumnModel().getColumnCount() > 0) {
            jtableCategoria.getColumnModel().getColumn(0).setMinWidth(50);
            jtableCategoria.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 400, 110));

        btnEliminarC.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminarb.png"))); // NOI18N
        btnEliminarC.setBorder(null);
        btnEliminarC.setBorderPainted(false);
        btnEliminarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminar.png"))); // NOI18N
        btnEliminarC.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminar.png"))); // NOI18N
        btnEliminarC.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminar.png"))); // NOI18N
        jPanel3.add(btnEliminarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));
        jPanel5.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 500, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/categoria.png"))); // NOI18N
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Lista de Categoría");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 17, -1, -1));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaModificarb.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaModificar.png"))); // NOI18N
        jButton9.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaModificar.png"))); // NOI18N
        jButton9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaModificar.png"))); // NOI18N
        jPanel5.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setPreferredSize(new java.awt.Dimension(100, 50));
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setMinWidth(50);
            jTable4.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 400, 110));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminarb.png"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminar.png"))); // NOI18N
        jButton10.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminar.png"))); // NOI18N
        jButton10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminar.png"))); // NOI18N
        jPanel5.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 275, 500, 225));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 275, 500, 225));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setPreferredSize(new java.awt.Dimension(1000, 10));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/categoria.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 500, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Marca");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 17, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(225, 99, 71));
        jLabel12.setText("Marca:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jtxtMarca.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtMarca.setForeground(new java.awt.Color(153, 153, 153));
        jtxtMarca.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMarcaActionPerformed(evt);
            }
        });
        jPanel4.add(jtxtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 250, 20));

        btnGuardarM.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaGuardarb.png"))); // NOI18N
        btnGuardarM.setBorder(null);
        btnGuardarM.setBorderPainted(false);
        btnGuardarM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarM.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaGuardar.png"))); // NOI18N
        btnGuardarM.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaGuardar.png"))); // NOI18N
        btnGuardarM.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaGuardar.png"))); // NOI18N
        jPanel4.add(btnGuardarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        btnNuevoM.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevoM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaNuevob.png"))); // NOI18N
        btnNuevoM.setBorder(null);
        btnNuevoM.setBorderPainted(false);
        btnNuevoM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoM.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaNuevo.png"))); // NOI18N
        btnNuevoM.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaNuevo.png"))); // NOI18N
        btnNuevoM.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaNuevo.png"))); // NOI18N
        jPanel4.add(btnNuevoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 100));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 100, 500, 175));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));
        jPanel6.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 500, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/categoria.png"))); // NOI18N
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Lista de Marca");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 17, -1, -1));

        btnModificarLM.setBackground(new java.awt.Color(255, 255, 255));
        btnModificarLM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaModificarb.png"))); // NOI18N
        btnModificarLM.setBorder(null);
        btnModificarLM.setBorderPainted(false);
        btnModificarLM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarLM.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaModificar.png"))); // NOI18N
        btnModificarLM.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaModificar.png"))); // NOI18N
        btnModificarLM.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaModificar.png"))); // NOI18N
        jPanel6.add(btnModificarLM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jtableMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jtableMarca);
        if (jtableMarca.getColumnModel().getColumnCount() > 0) {
            jtableMarca.getColumnModel().getColumn(0).setMinWidth(50);
            jtableMarca.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        jPanel6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 400, 110));

        btnEliminarLM.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarLM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminarb.png"))); // NOI18N
        btnEliminarLM.setBorder(null);
        btnEliminarLM.setBorderPainted(false);
        btnEliminarLM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarLM.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminar.png"))); // NOI18N
        btnEliminarLM.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminar.png"))); // NOI18N
        btnEliminarLM.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminar.png"))); // NOI18N
        jPanel6.add(btnEliminarLM, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));
        jPanel7.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 500, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/categoria.png"))); // NOI18N
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Lista de Categoría");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 17, -1, -1));

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaModificarb.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaModificar.png"))); // NOI18N
        jButton13.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaModificar.png"))); // NOI18N
        jButton13.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaModificar.png"))); // NOI18N
        jPanel7.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setPreferredSize(new java.awt.Dimension(100, 50));
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setMinWidth(50);
            jTable6.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        jPanel7.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 400, 110));

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminarb.png"))); // NOI18N
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminar.png"))); // NOI18N
        jButton14.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminar.png"))); // NOI18N
        jButton14.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminar.png"))); // NOI18N
        jPanel7.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 275, 500, 225));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 275, 500, 225));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblInicioMouseClicked
       
    }//GEN-LAST:event_jlblInicioMouseClicked

    private void jlblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMinimizarMouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jlblMinimizarMouseClicked

    private void jtxtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCategoriaActionPerformed

    private void jtxtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtMarcaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEliminarC;
    public javax.swing.JButton btnEliminarLM;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnGuardarM;
    public javax.swing.JButton btnModificarC;
    public javax.swing.JButton btnModificarLM;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnNuevoM;
    public javax.swing.JButton jButton10;
    public javax.swing.JButton jButton13;
    public javax.swing.JButton jButton14;
    public javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable6;
    public javax.swing.JLabel jlblInicio;
    public javax.swing.JLabel jlblMinimizar;
    public javax.swing.JLabel jlblUsuario;
    public javax.swing.JTable jtableCategoria;
    public javax.swing.JTable jtableMarca;
    public javax.swing.JTextField jtxtCategoria;
    public javax.swing.JTextField jtxtMarca;
    // End of variables declaration//GEN-END:variables
}
