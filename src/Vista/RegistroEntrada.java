/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.placeholder.PlaceHolder;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Orlando
 */
public class RegistroEntrada extends javax.swing.JFrame {

    /**
     * Creates new form Usuario
     */
    public RegistroEntrada() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Fecha del Sistema
        Date sistFecha = new Date();
        SimpleDateFormat formato=new SimpleDateFormat("YYYY-MM-dd");
        jlblFechaSistema.setText(formato.format(sistFecha));
        
        //Hora del Sistema;
        Timer tiempo = new Timer(100,new RegistroEntrada.jlblHora());
        tiempo.start();
        holders();
    }
    public void holders(){
      PlaceHolder holder;  
      holder=new PlaceHolder(jtxtCodigo,"Ingrese Codigo");
    }
    class jlblHora implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Date sistHora = new Date();
            String pmAm="hh:mm:ss a";
            SimpleDateFormat format = new SimpleDateFormat(pmAm);
            Calendar hoy=Calendar.getInstance();
            jlblHoraSistema.setText(String.format(format.format(sistHora),hoy));
            
        }
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

        jPanel1EntradaNuevo = new javax.swing.JPanel();
        jlblEntradaIcono = new javax.swing.JLabel();
        jlblMinimizar = new javax.swing.JLabel();
        jlblEntrada = new javax.swing.JLabel();
        jlblNombreUsuario = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jPanel2EntradaNuevo = new javax.swing.JPanel();
        jtxtCodigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jlblBuscarIcono = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jlblProveedor = new javax.swing.JLabel();
        jcmbProveedor = new javax.swing.JComboBox<>();
        jlblListaInventario = new javax.swing.JLabel();
        jlblRecibido2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        btnNuevoProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableNuevaEntrada = new javax.swing.JTable();
        jlblTotal = new javax.swing.JLabel();
        jlblRecibido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlblFecha1 = new javax.swing.JLabel();
        jlblFechaSistema = new javax.swing.JLabel();
        jlblHora = new javax.swing.JLabel();
        jlblNoEntrada = new javax.swing.JLabel();
        jlblNo = new javax.swing.JLabel();
        jlblHoraSistema = new javax.swing.JLabel();
        btnElimdeCarr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1EntradaNuevo.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1EntradaNuevo.setPreferredSize(new java.awt.Dimension(1000, 100));
        jPanel1EntradaNuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblEntradaIcono.setBackground(new java.awt.Color(255, 255, 255));
        jlblEntradaIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconoCarrito.png"))); // NOI18N
        jlblEntradaIcono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1EntradaNuevo.add(jlblEntradaIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 110, 97));

        jlblMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        jlblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jlblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblMinimizarMouseClicked(evt);
            }
        });
        jPanel1EntradaNuevo.add(jlblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, -1));

        jlblEntrada.setBackground(new java.awt.Color(255, 255, 255));
        jlblEntrada.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlblEntrada.setForeground(new java.awt.Color(238, 112, 85));
        jlblEntrada.setText("Nueva Entrada");
        jPanel1EntradaNuevo.add(jlblEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        jlblNombreUsuario.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jlblNombreUsuario.setForeground(new java.awt.Color(105, 105, 105));
        jlblNombreUsuario.setText("Nombre del Usuario");
        jPanel1EntradaNuevo.add(jlblNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 65, 340, -1));

        btnAtras.setBackground(new java.awt.Color(255, 255, 255));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaAtrasb.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaAtras.png"))); // NOI18N
        btnAtras.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaAtras.png"))); // NOI18N
        btnAtras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaAtras.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1EntradaNuevo.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        getContentPane().add(jPanel1EntradaNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2EntradaNuevo.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2EntradaNuevo.setPreferredSize(new java.awt.Dimension(1000, 400));
        jPanel2EntradaNuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jtxtCodigo.setForeground(new java.awt.Color(153, 153, 153));
        jtxtCodigo.setBorder(null);
        jtxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCodigoActionPerformed(evt);
            }
        });
        jPanel2EntradaNuevo.add(jtxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 120, 20));

        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel2EntradaNuevo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 160, -1));

        jSeparator2.setPreferredSize(new java.awt.Dimension(1000, 10));
        jPanel2EntradaNuevo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlblBuscarIcono.setBackground(new java.awt.Color(255, 255, 255));
        jlblBuscarIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Search_32px.png"))); // NOI18N
        jPanel2EntradaNuevo.add(jlblBuscarIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaBuscarb.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaBuscar.png"))); // NOI18N
        btnBuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaBuscar.png"))); // NOI18N
        btnBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaBuscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2EntradaNuevo.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 75, 25));

        jlblProveedor.setBackground(new java.awt.Color(255, 255, 255));
        jlblProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblProveedor.setForeground(new java.awt.Color(225, 99, 71));
        jlblProveedor.setText("Proveedor:");
        jPanel2EntradaNuevo.add(jlblProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jPanel2EntradaNuevo.add(jcmbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 130, -1));

        jlblListaInventario.setBackground(new java.awt.Color(255, 255, 255));
        jlblListaInventario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblListaInventario.setForeground(new java.awt.Color(105, 105, 105));
        jlblListaInventario.setText("Lista de Inventario");
        jPanel2EntradaNuevo.add(jlblListaInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 46, 130, -1));

        jlblRecibido2.setBackground(new java.awt.Color(255, 255, 255));
        jlblRecibido2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblRecibido2.setForeground(new java.awt.Color(225, 99, 71));
        jlblRecibido2.setText("Recibido por:");
        jPanel2EntradaNuevo.add(jlblRecibido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaAgregarb.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaAgregar.png"))); // NOI18N
        btnAgregar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaAgregar.png"))); // NOI18N
        btnAgregar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaAgregar.png"))); // NOI18N
        jPanel2EntradaNuevo.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        btnComprar.setBackground(new java.awt.Color(255, 255, 255));
        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaComprarb.png"))); // NOI18N
        btnComprar.setBorder(null);
        btnComprar.setBorderPainted(false);
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaComprar.png"))); // NOI18N
        btnComprar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaComprar.png"))); // NOI18N
        btnComprar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaComprar.png"))); // NOI18N
        jPanel2EntradaNuevo.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, -1, -1));

        btnNuevoProducto.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaNuevoProductob.png"))); // NOI18N
        btnNuevoProducto.setBorder(null);
        btnNuevoProducto.setBorderPainted(false);
        btnNuevoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaNuevoProducto.png"))); // NOI18N
        btnNuevoProducto.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaNuevoProducto.png"))); // NOI18N
        btnNuevoProducto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaNuevoProducto.png"))); // NOI18N
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });
        jPanel2EntradaNuevo.add(btnNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, -1, -1));

        jtableNuevaEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Codigo", "Nombre", "Descripcion", "Categoria", "Marca", "Cantidad", "P Compra", "P Venta", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableNuevaEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtableNuevaEntrada.setPreferredSize(new java.awt.Dimension(300, 200));
        jScrollPane1.setViewportView(jtableNuevaEntrada);
        if (jtableNuevaEntrada.getColumnModel().getColumnCount() > 0) {
            jtableNuevaEntrada.getColumnModel().getColumn(0).setMinWidth(0);
            jtableNuevaEntrada.getColumnModel().getColumn(0).setPreferredWidth(0);
            jtableNuevaEntrada.getColumnModel().getColumn(0).setMaxWidth(0);
            jtableNuevaEntrada.getColumnModel().getColumn(6).setPreferredWidth(15);
            jtableNuevaEntrada.getColumnModel().getColumn(7).setPreferredWidth(25);
            jtableNuevaEntrada.getColumnModel().getColumn(8).setPreferredWidth(25);
            jtableNuevaEntrada.getColumnModel().getColumn(9).setPreferredWidth(30);
        }

        jPanel2EntradaNuevo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 125, 900, 230));

        jlblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblTotal.setForeground(new java.awt.Color(102, 102, 102));
        jlblTotal.setText("000.00");
        jPanel2EntradaNuevo.add(jlblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(873, 360, 75, 25));

        jlblRecibido.setText("Nombre Usuario");
        jPanel2EntradaNuevo.add(jlblRecibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 130, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Q.");
        jPanel2EntradaNuevo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, -1, 25));

        jlblFecha1.setBackground(new java.awt.Color(255, 255, 255));
        jlblFecha1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblFecha1.setForeground(new java.awt.Color(225, 99, 71));
        jlblFecha1.setText("Fecha:");
        jPanel2EntradaNuevo.add(jlblFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        jlblFechaSistema.setForeground(new java.awt.Color(103, 103, 103));
        jlblFechaSistema.setText("Fecha Sistema");
        jPanel2EntradaNuevo.add(jlblFechaSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 130, 20));

        jlblHora.setBackground(new java.awt.Color(255, 255, 255));
        jlblHora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblHora.setForeground(new java.awt.Color(225, 99, 71));
        jlblHora.setText("Hora:");
        jPanel2EntradaNuevo.add(jlblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, -1, -1));

        jlblNoEntrada.setForeground(new java.awt.Color(103, 103, 103));
        jlblNoEntrada.setText("idCompra");
        jPanel2EntradaNuevo.add(jlblNoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 130, 20));

        jlblNo.setBackground(new java.awt.Color(255, 255, 255));
        jlblNo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblNo.setForeground(new java.awt.Color(225, 99, 71));
        jlblNo.setText("No:");
        jPanel2EntradaNuevo.add(jlblNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 52, -1, -1));

        jlblHoraSistema.setForeground(new java.awt.Color(103, 103, 103));
        jlblHoraSistema.setText("Hora Sistema");
        jPanel2EntradaNuevo.add(jlblHoraSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 130, 20));

        btnElimdeCarr.setBackground(new java.awt.Color(255, 255, 255));
        btnElimdeCarr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminarb.png"))); // NOI18N
        btnElimdeCarr.setBorder(null);
        btnElimdeCarr.setBorderPainted(false);
        btnElimdeCarr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElimdeCarr.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminar.png"))); // NOI18N
        btnElimdeCarr.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminar.png"))); // NOI18N
        btnElimdeCarr.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/CajaEliminar.png"))); // NOI18N
        jPanel2EntradaNuevo.add(btnElimdeCarr, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        getContentPane().add(jPanel2EntradaNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMinimizarMouseClicked
         this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jlblMinimizarMouseClicked

    private void jtxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
   
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
   
    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RegistroEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnAtras;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnComprar;
    public javax.swing.JButton btnElimdeCarr;
    public javax.swing.JButton btnNuevoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1EntradaNuevo;
    public javax.swing.JPanel jPanel2EntradaNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JComboBox<String> jcmbProveedor;
    public javax.swing.JLabel jlblBuscarIcono;
    public javax.swing.JLabel jlblEntrada;
    public javax.swing.JLabel jlblEntradaIcono;
    public javax.swing.JLabel jlblFecha1;
    public javax.swing.JLabel jlblFechaSistema;
    public javax.swing.JLabel jlblHora;
    public javax.swing.JLabel jlblHoraSistema;
    public javax.swing.JLabel jlblListaInventario;
    public javax.swing.JLabel jlblMinimizar;
    public javax.swing.JLabel jlblNo;
    public javax.swing.JLabel jlblNoEntrada;
    public javax.swing.JLabel jlblNombreUsuario;
    public javax.swing.JLabel jlblProveedor;
    public javax.swing.JLabel jlblRecibido;
    public javax.swing.JLabel jlblRecibido2;
    public javax.swing.JLabel jlblTotal;
    public javax.swing.JTable jtableNuevaEntrada;
    public javax.swing.JTextField jtxtCodigo;
    // End of variables declaration//GEN-END:variables
}
