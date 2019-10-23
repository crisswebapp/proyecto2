/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import java.util.Calendar;

/**
 *
 * @author Orlando
 */
public class CortedeCaja extends javax.swing.JFrame {

    /**
     * Creates new form Usuario
     */
    public CortedeCaja() {
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

        jPanel1CortCaj = new javax.swing.JPanel();
        jlblCortCajIcono = new javax.swing.JLabel();
        jlblInicio = new javax.swing.JLabel();
        jlblMinimizar = new javax.swing.JLabel();
        jlblCortCaj = new javax.swing.JLabel();
        jlblNombreUsuario = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jlblNU = new javax.swing.JLabel();
        jlblFI = new javax.swing.JLabel();
        jlblFF = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jlblDMAFI = new javax.swing.JLabel();
        jlblDMAFF = new javax.swing.JLabel();
        jcmbUsuario = new javax.swing.JComboBox<>();
        dcFI = new com.toedter.calendar.JDateChooser();
        dcFF = new com.toedter.calendar.JDateChooser();
        jPanel2CortCaj = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnGuarCort = new javax.swing.JButton();
        jlblEfecCaja = new javax.swing.JLabel();
        jlblEI = new javax.swing.JLabel();
        jtxtTV = new javax.swing.JTextField();
        jlblB100 = new javax.swing.JLabel();
        jtxtB100 = new javax.swing.JTextField();
        jlblB50 = new javax.swing.JLabel();
        jtxtB50 = new javax.swing.JTextField();
        jlblB20 = new javax.swing.JLabel();
        jtxtB20 = new javax.swing.JTextField();
        jlblB10 = new javax.swing.JLabel();
        jtxtB10 = new javax.swing.JTextField();
        jlblB5 = new javax.swing.JLabel();
        jtxtB5 = new javax.swing.JTextField();
        jtxtB1 = new javax.swing.JTextField();
        jlblB1 = new javax.swing.JLabel();
        jtxtM1 = new javax.swing.JTextField();
        jlblM1 = new javax.swing.JLabel();
        jtxtM050 = new javax.swing.JTextField();
        jlblM050 = new javax.swing.JLabel();
        jlblM025 = new javax.swing.JLabel();
        jtxtM025 = new javax.swing.JTextField();
        jlblM010 = new javax.swing.JLabel();
        jtxtM010 = new javax.swing.JTextField();
        jtxtM005 = new javax.swing.JTextField();
        jlblTotCaj = new javax.swing.JLabel();
        jlblM005 = new javax.swing.JLabel();
        jlblQ = new javax.swing.JLabel();
        jlblDMAFI1 = new javax.swing.JLabel();
        jlblDMAFI2 = new javax.swing.JLabel();
        jlblTotal1 = new javax.swing.JLabel();
        jtxtTotalCaja = new javax.swing.JTextField();
        jtxtEI = new javax.swing.JTextField();
        jlblEI1 = new javax.swing.JLabel();
        jlblEI2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1CortCaj.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1CortCaj.setPreferredSize(new java.awt.Dimension(1000, 100));
        jPanel1CortCaj.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblCortCajIcono.setBackground(new java.awt.Color(255, 255, 255));
        jlblCortCajIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CorteCaja.png"))); // NOI18N
        jlblCortCajIcono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1CortCaj.add(jlblCortCajIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 110, 100));

        jlblInicio.setBackground(new java.awt.Color(255, 255, 255));
        jlblInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Inicio.png"))); // NOI18N
        jlblInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblInicioMouseClicked(evt);
            }
        });
        jPanel1CortCaj.add(jlblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 30, 30));

        jlblMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        jlblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jlblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblMinimizarMouseClicked(evt);
            }
        });
        jPanel1CortCaj.add(jlblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, -1, -1));

        jlblCortCaj.setBackground(new java.awt.Color(255, 255, 255));
        jlblCortCaj.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlblCortCaj.setForeground(new java.awt.Color(238, 112, 85));
        jlblCortCaj.setText("Corte Caja");
        jPanel1CortCaj.add(jlblCortCaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jlblNombreUsuario.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jlblNombreUsuario.setForeground(new java.awt.Color(105, 105, 105));
        jlblNombreUsuario.setText("Nombre del Usuario");
        jPanel1CortCaj.add(jlblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 65, 350, -1));

        jSeparator3.setPreferredSize(new java.awt.Dimension(1000, 10));
        jPanel1CortCaj.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jlblNU.setBackground(new java.awt.Color(255, 255, 255));
        jlblNU.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlblNU.setForeground(new java.awt.Color(225, 99, 71));
        jlblNU.setText("Seleccione usuario");
        jPanel1CortCaj.add(jlblNU, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jlblFI.setBackground(new java.awt.Color(255, 255, 255));
        jlblFI.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlblFI.setForeground(new java.awt.Color(225, 99, 71));
        jlblFI.setText("Fecha Inicial");
        jPanel1CortCaj.add(jlblFI, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        jlblFF.setBackground(new java.awt.Color(255, 255, 255));
        jlblFF.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlblFF.setForeground(new java.awt.Color(225, 99, 71));
        jlblFF.setText("Fecha Final");
        jPanel1CortCaj.add(jlblFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 110, -1, -1));

        btnGenerar.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaGenerarb.png"))); // NOI18N
        btnGenerar.setBorder(null);
        btnGenerar.setBorderPainted(false);
        btnGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaGenerar.png"))); // NOI18N
        btnGenerar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaGenerar.png"))); // NOI18N
        btnGenerar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaGenerar.png"))); // NOI18N
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel1CortCaj.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 75, 25));

        jlblDMAFI.setBackground(new java.awt.Color(255, 255, 255));
        jlblDMAFI.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jlblDMAFI.setForeground(new java.awt.Color(153, 153, 153));
        jlblDMAFI.setText("DD/MM/AAAA");
        jPanel1CortCaj.add(jlblDMAFI, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 80, -1));

        jlblDMAFF.setBackground(new java.awt.Color(255, 255, 255));
        jlblDMAFF.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jlblDMAFF.setForeground(new java.awt.Color(153, 153, 153));
        jlblDMAFF.setText("DD/MM/AAAA");
        jPanel1CortCaj.add(jlblDMAFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 70, -1));

        jPanel1CortCaj.add(jcmbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 180, -1));

        dcFI.setBackground(new java.awt.Color(36, 33, 33));
        dcFI.setForeground(new java.awt.Color(207, 207, 207));
        dcFI.setDateFormatString("dd-MM-yyyy");
        dcFI.setFont(new java.awt.Font("Verdana", 1, 12));
        jPanel1CortCaj.add(dcFI, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 150, -1));

        dcFF.setBackground(new java.awt.Color(36, 33, 33));
        dcFF.setForeground(new java.awt.Color(207, 207, 207));
        dcFF.setDateFormatString("dd-MM-yyyy");
        dcFF.setFont(new java.awt.Font("Verdana", 1, 12));
        jPanel1CortCaj.add(dcFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 120, -1));

        getContentPane().add(jPanel1CortCaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 180));

        jPanel2CortCaj.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2CortCaj.setPreferredSize(new java.awt.Dimension(1000, 400));
        jPanel2CortCaj.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel2CortCaj.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 150, 10));

        jSeparator2.setPreferredSize(new java.awt.Dimension(1000, 10));
        jPanel2CortCaj.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnGuarCort.setBackground(new java.awt.Color(255, 255, 255));
        btnGuarCort.setForeground(new java.awt.Color(255, 255, 255));
        btnGuarCort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaGuardarCorteb.png"))); // NOI18N
        btnGuarCort.setBorderPainted(false);
        btnGuarCort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuarCort.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaGuardarCorte.png"))); // NOI18N
        btnGuarCort.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaGuardarCorte.png"))); // NOI18N
        btnGuarCort.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaGuardarCorte.png"))); // NOI18N
        jPanel2CortCaj.add(btnGuarCort, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 90, 25));

        jlblEfecCaja.setBackground(new java.awt.Color(255, 255, 255));
        jlblEfecCaja.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlblEfecCaja.setForeground(new java.awt.Color(153, 153, 153));
        jlblEfecCaja.setText("Efectivo en Caja");
        jPanel2CortCaj.add(jlblEfecCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 130, 20));

        jlblEI.setBackground(new java.awt.Color(255, 255, 255));
        jlblEI.setForeground(new java.awt.Color(225, 99, 71));
        jlblEI.setText("Total en Caja");
        jPanel2CortCaj.add(jlblEI, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        jtxtTV.setEditable(false);
        jtxtTV.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtTV.setForeground(new java.awt.Color(103, 103, 103));
        jtxtTV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTVActionPerformed(evt);
            }
        });
        jPanel2CortCaj.add(jtxtTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 120, 30));

        jlblB100.setBackground(new java.awt.Color(255, 255, 255));
        jlblB100.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jlblB100.setForeground(new java.awt.Color(153, 153, 153));
        jlblB100.setText("Billete(s) Q.100");
        jPanel2CortCaj.add(jlblB100, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jtxtB100.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtB100.setForeground(new java.awt.Color(103, 103, 103));
        jtxtB100.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtB100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtB100ActionPerformed(evt);
            }
        });
        jPanel2CortCaj.add(jtxtB100, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 120, -1));

        jlblB50.setBackground(new java.awt.Color(255, 255, 255));
        jlblB50.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jlblB50.setForeground(new java.awt.Color(153, 153, 153));
        jlblB50.setText("Billete(s) Q.50");
        jPanel2CortCaj.add(jlblB50, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jtxtB50.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtB50.setForeground(new java.awt.Color(103, 103, 103));
        jtxtB50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtB50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtB50ActionPerformed(evt);
            }
        });
        jPanel2CortCaj.add(jtxtB50, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 120, -1));

        jlblB20.setBackground(new java.awt.Color(255, 255, 255));
        jlblB20.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jlblB20.setForeground(new java.awt.Color(153, 153, 153));
        jlblB20.setText("Billete(s) Q.20");
        jPanel2CortCaj.add(jlblB20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jtxtB20.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtB20.setForeground(new java.awt.Color(103, 103, 103));
        jtxtB20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtB20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtB20ActionPerformed(evt);
            }
        });
        jPanel2CortCaj.add(jtxtB20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 120, -1));

        jlblB10.setBackground(new java.awt.Color(255, 255, 255));
        jlblB10.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jlblB10.setForeground(new java.awt.Color(153, 153, 153));
        jlblB10.setText("Billete(s) Q.10");
        jPanel2CortCaj.add(jlblB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jtxtB10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtB10.setForeground(new java.awt.Color(103, 103, 103));
        jtxtB10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtB10ActionPerformed(evt);
            }
        });
        jPanel2CortCaj.add(jtxtB10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 120, -1));

        jlblB5.setBackground(new java.awt.Color(255, 255, 255));
        jlblB5.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jlblB5.setForeground(new java.awt.Color(153, 153, 153));
        jlblB5.setText("Billete(s) Q.5");
        jPanel2CortCaj.add(jlblB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jtxtB5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtB5.setForeground(new java.awt.Color(103, 103, 103));
        jtxtB5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtB5ActionPerformed(evt);
            }
        });
        jPanel2CortCaj.add(jtxtB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 120, -1));

        jtxtB1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtB1.setForeground(new java.awt.Color(103, 103, 103));
        jtxtB1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtB1ActionPerformed(evt);
            }
        });
        jPanel2CortCaj.add(jtxtB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 120, -1));

        jlblB1.setBackground(new java.awt.Color(255, 255, 255));
        jlblB1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jlblB1.setForeground(new java.awt.Color(153, 153, 153));
        jlblB1.setText("Billete(s) Q.1");
        jPanel2CortCaj.add(jlblB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jtxtM1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtM1.setForeground(new java.awt.Color(103, 103, 103));
        jtxtM1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtM1ActionPerformed(evt);
            }
        });
        jPanel2CortCaj.add(jtxtM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 120, -1));

        jlblM1.setBackground(new java.awt.Color(255, 255, 255));
        jlblM1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jlblM1.setForeground(new java.awt.Color(153, 153, 153));
        jlblM1.setText("Moneda(s) Q.1");
        jPanel2CortCaj.add(jlblM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jtxtM050.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtM050.setForeground(new java.awt.Color(103, 103, 103));
        jtxtM050.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtM050.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtM050ActionPerformed(evt);
            }
        });
        jPanel2CortCaj.add(jtxtM050, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 120, -1));

        jlblM050.setBackground(new java.awt.Color(255, 255, 255));
        jlblM050.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jlblM050.setForeground(new java.awt.Color(153, 153, 153));
        jlblM050.setText("Moneda(s) Q.0.50");
        jPanel2CortCaj.add(jlblM050, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jlblM025.setBackground(new java.awt.Color(255, 255, 255));
        jlblM025.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jlblM025.setForeground(new java.awt.Color(153, 153, 153));
        jlblM025.setText("Moneda(s) Q.0.25");
        jPanel2CortCaj.add(jlblM025, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jtxtM025.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtM025.setForeground(new java.awt.Color(103, 103, 103));
        jtxtM025.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtM025.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtM025ActionPerformed(evt);
            }
        });
        jPanel2CortCaj.add(jtxtM025, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 120, -1));

        jlblM010.setBackground(new java.awt.Color(255, 255, 255));
        jlblM010.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jlblM010.setForeground(new java.awt.Color(153, 153, 153));
        jlblM010.setText("Moneda(s) Q.0.10");
        jPanel2CortCaj.add(jlblM010, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jtxtM010.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtM010.setForeground(new java.awt.Color(103, 103, 103));
        jtxtM010.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtM010.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtM010ActionPerformed(evt);
            }
        });
        jPanel2CortCaj.add(jtxtM010, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 120, -1));

        jtxtM005.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtM005.setForeground(new java.awt.Color(103, 103, 103));
        jtxtM005.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtM005.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtM005ActionPerformed(evt);
            }
        });
        jPanel2CortCaj.add(jtxtM005, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 120, -1));

        jlblTotCaj.setBackground(new java.awt.Color(255, 255, 255));
        jlblTotCaj.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jlblTotCaj.setForeground(new java.awt.Color(225, 99, 71));
        jlblTotCaj.setText("Subtotal");
        jPanel2CortCaj.add(jlblTotCaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        jlblM005.setBackground(new java.awt.Color(255, 255, 255));
        jlblM005.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jlblM005.setForeground(new java.awt.Color(153, 153, 153));
        jlblM005.setText("Moneda(s) Q.0.05");
        jPanel2CortCaj.add(jlblM005, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jlblQ.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jlblQ.setForeground(new java.awt.Color(103, 103, 103));
        jlblQ.setText("Q.");
        jPanel2CortCaj.add(jlblQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 282, 20, 30));

        jlblDMAFI1.setBackground(new java.awt.Color(255, 255, 255));
        jlblDMAFI1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jlblDMAFI1.setForeground(new java.awt.Color(102, 103, 103));
        jlblDMAFI1.setText("Precione TAB para ir bajando");
        jPanel2CortCaj.add(jlblDMAFI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 150, -1));

        jlblDMAFI2.setBackground(new java.awt.Color(255, 255, 255));
        jlblDMAFI2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jlblDMAFI2.setForeground(new java.awt.Color(102, 103, 103));
        jlblDMAFI2.setText("Por favor Verifique todos los campos");
        jPanel2CortCaj.add(jlblDMAFI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 220, 30));

        jlblTotal1.setBackground(new java.awt.Color(255, 255, 255));
        jlblTotal1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jlblTotal1.setForeground(new java.awt.Color(103, 103, 103));
        jlblTotal1.setText("000.0");
        jPanel2CortCaj.add(jlblTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 285, 100, -1));

        jtxtTotalCaja.setEditable(false);
        jtxtTotalCaja.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtTotalCaja.setForeground(new java.awt.Color(103, 103, 103));
        jtxtTotalCaja.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtTotalCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTotalCajaActionPerformed(evt);
            }
        });
        jPanel2CortCaj.add(jtxtTotalCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 120, 30));

        jtxtEI.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtEI.setForeground(new java.awt.Color(103, 103, 103));
        jtxtEI.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtxtEI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEIActionPerformed(evt);
            }
        });
        jPanel2CortCaj.add(jtxtEI, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 120, 30));

        jlblEI1.setBackground(new java.awt.Color(255, 255, 255));
        jlblEI1.setForeground(new java.awt.Color(225, 99, 71));
        jlblEI1.setText("Efectivo Inicial");
        jPanel2CortCaj.add(jlblEI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, -1, -1));

        jlblEI2.setBackground(new java.awt.Color(255, 255, 255));
        jlblEI2.setForeground(new java.awt.Color(225, 99, 71));
        jlblEI2.setText("Total en Caja");
        jPanel2CortCaj.add(jlblEI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, -1, -1));

        getContentPane().add(jPanel2CortCaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMinimizarMouseClicked
         this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jlblMinimizarMouseClicked

    private void jlblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblInicioMouseClicked

    }//GEN-LAST:event_jlblInicioMouseClicked

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void jtxtB100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtB100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtB100ActionPerformed

    private void jtxtB50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtB50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtB50ActionPerformed

    private void jtxtB20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtB20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtB20ActionPerformed

    private void jtxtB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtB10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtB10ActionPerformed

    private void jtxtB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtB5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtB5ActionPerformed

    private void jtxtB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtB1ActionPerformed

    private void jtxtM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtM1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtM1ActionPerformed

    private void jtxtM050ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtM050ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtM050ActionPerformed

    private void jtxtM025ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtM025ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtM025ActionPerformed

    private void jtxtM010ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtM010ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtM010ActionPerformed

    private void jtxtM005ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtM005ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtM005ActionPerformed

    private void jtxtTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTVActionPerformed

    private void jtxtTotalCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTotalCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTotalCajaActionPerformed

    private void jtxtEIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtEIActionPerformed

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
            java.util.logging.Logger.getLogger(CortedeCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CortedeCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CortedeCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CortedeCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CortedeCaja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGenerar;
    public javax.swing.JButton btnGuarCort;
    public com.toedter.calendar.JDateChooser dcFF;
    public com.toedter.calendar.JDateChooser dcFI;
    public javax.swing.JPanel jPanel1CortCaj;
    public javax.swing.JPanel jPanel2CortCaj;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JComboBox<String> jcmbUsuario;
    public javax.swing.JLabel jlblB1;
    public javax.swing.JLabel jlblB10;
    public javax.swing.JLabel jlblB100;
    public javax.swing.JLabel jlblB20;
    public javax.swing.JLabel jlblB5;
    public javax.swing.JLabel jlblB50;
    public javax.swing.JLabel jlblCortCaj;
    public javax.swing.JLabel jlblCortCajIcono;
    private javax.swing.JLabel jlblDMAFF;
    private javax.swing.JLabel jlblDMAFI;
    private javax.swing.JLabel jlblDMAFI1;
    private javax.swing.JLabel jlblDMAFI2;
    public javax.swing.JLabel jlblEI;
    public javax.swing.JLabel jlblEI1;
    public javax.swing.JLabel jlblEI2;
    private javax.swing.JLabel jlblEfecCaja;
    public javax.swing.JLabel jlblFF;
    public javax.swing.JLabel jlblFI;
    public javax.swing.JLabel jlblInicio;
    public javax.swing.JLabel jlblM005;
    public javax.swing.JLabel jlblM010;
    public javax.swing.JLabel jlblM025;
    public javax.swing.JLabel jlblM050;
    public javax.swing.JLabel jlblM1;
    public javax.swing.JLabel jlblMinimizar;
    public javax.swing.JLabel jlblNU;
    public javax.swing.JLabel jlblNombreUsuario;
    public javax.swing.JLabel jlblQ;
    public javax.swing.JLabel jlblTotCaj;
    public javax.swing.JLabel jlblTotal1;
    public javax.swing.JTextField jtxtB1;
    public javax.swing.JTextField jtxtB10;
    public javax.swing.JTextField jtxtB100;
    public javax.swing.JTextField jtxtB20;
    public javax.swing.JTextField jtxtB5;
    public javax.swing.JTextField jtxtB50;
    public javax.swing.JTextField jtxtEI;
    public javax.swing.JTextField jtxtM005;
    public javax.swing.JTextField jtxtM010;
    public javax.swing.JTextField jtxtM025;
    public javax.swing.JTextField jtxtM050;
    public javax.swing.JTextField jtxtM1;
    public javax.swing.JTextField jtxtTV;
    public javax.swing.JTextField jtxtTotalCaja;
    // End of variables declaration//GEN-END:variables
}
