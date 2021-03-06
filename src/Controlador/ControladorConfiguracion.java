/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Categoria;
import Modelo.ConsultasCategoria;
import Modelo.ConsultasMarca;
import Modelo.Marca;
import Modelo.Usuario;
import Vista.Administrador;
import Vista.Configuracion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Orlando
 */
public class ControladorConfiguracion implements ActionListener, MouseListener , 
        DocumentListener, KeyListener,WindowListener{
    private Configuracion vista;
    private Usuario modelo;
    private Administrador vistaAdmin = new Administrador();
    ConsultasCategoria consultasC = new ConsultasCategoria();
    ConsultasMarca consultasM=new ConsultasMarca();
    //variable que detecta modificacines
    boolean modificando = false;
    boolean modificandoM=false;
    
    Categoria categoriaModificar = new Categoria();
    Marca marcaModificar=new Marca();
    public ControladorConfiguracion(Configuracion vista, Usuario modelo){
        this.vista=vista;
        this.modelo= modelo;
        //
        vista.jtxtCategoria.getDocument().addDocumentListener(this);
        vista.jtxtMarca.getDocument().addDocumentListener(this);
        vista.jtxtCategoria.addKeyListener(this);
        vista.jtxtMarca.addKeyListener(this);
        vista.jlblInicio.addMouseListener(this);
        
        vista.btnGuardar.addActionListener(this);
        vista.btnGuardarM.addActionListener(this);
        vista.btnEliminarC.addActionListener(this);
        vista.btnEliminarLM.addActionListener(this);
        vista.btnNuevo.addActionListener(this);
        vista.btnNuevoM.addActionListener(this);
        vista.btnModificarC.addActionListener(this);
        vista.btnModificarLM.addActionListener(this);
        //consultasC.tablaCategorias(vista.jtableCategoria);
        consultasC.limpiarTabla(vista.jtableCategoria);
        consultasM.tablaMarca(vista.jtableMarca);
        vista.jtableCategoria.addMouseListener(this);
        vista.jtableMarca.addMouseListener(this);
        vista.jlblUsuario.setText(modelo.getNombreUsuario());
        vista.jPanel1.addMouseListener(this);
        vista.jPanel2.addMouseListener(this);
        vista.jPanel3.addMouseListener(this);
        vista.jPanel4.addMouseListener(this);
        vista.jPanel6.addMouseListener(this);
        
        
        vista.addWindowListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.btnGuardar){
            if(modificando==true){
                modificar();
                modificando = false;
            }else{
                registrar();
            }
            vista.btnGuardar.setEnabled(false);
        }
        if(e.getSource()==vista.btnGuardarM){
            if(modificandoM==true){
                modificarM();
                modificandoM=false;
            }
            else{
                registrarM();
            }
            vista.btnGuardarM.setEnabled(false);
        }
        else if(e.getSource()==vista.btnNuevo){
            desactivarBotones();
            vista.jtxtCategoria.setText("");
            vista.jtxtMarca.setText("");
            vista.jtxtCategoria.requestFocus();  
        }
        else if(e.getSource()==vista.btnNuevoM){
            desactivarBotones();
            vista.jtxtMarca.setText("");
            vista.jtxtCategoria.setText("");
            vista.jtxtMarca.requestFocus();
        }

        else if(e.getSource()==vista.btnEliminarC){
            Categoria cate= new Categoria();
            int row=vista.jtableCategoria.getSelectedRow();
            cate.setIdCategoria(Integer.parseInt((String)vista.jtableCategoria.getModel().getValueAt(row, 0) ));
            int result=JOptionPane.showConfirmDialog(null,"Desea eliminar la categoria? ","Exit",JOptionPane.YES_NO_OPTION);
            if(result==0){
                if(consultasC.eliminar(cate)){
                    ((DefaultTableModel)vista.jtableCategoria.getModel()).removeRow(row);
                    JOptionPane.showMessageDialog(null, "Categoria Eliminado");
                    desactivarBotones();
                }else{
                    JOptionPane.showMessageDialog(null,"Error");
                }
                
            }
        }
        else if(e.getSource()==vista.btnEliminarLM){
            Marca mar=new Marca();
            int row=vista.jtableMarca.getSelectedRow();
            mar.setIdMarca(Integer.parseInt((String)vista.jtableMarca.getModel().getValueAt(row, 0)));
            int resul=JOptionPane.showConfirmDialog(null,"Desea eliminar la marca?","Exit",JOptionPane.YES_NO_OPTION);
            if(resul==0){
                    if(consultasM.eliminar(mar)){
                       ((DefaultTableModel)vista.jtableMarca.getModel()).removeRow(row);
                       JOptionPane.showMessageDialog(null, "Marca Eliminado");
                       desactivarBotones();
                     }else{
                            JOptionPane.showMessageDialog(null, "Error");
                          }
            }
        }
        else if(e.getSource()==vista.btnModificarC){
            
            int row=vista.jtableCategoria.getSelectedRow();
            categoriaModificar.setIdCategoria(Integer.parseInt((String)vista.jtableCategoria.getModel().getValueAt(row, 0)));
            categoriaModificar.setNombre((String)vista.jtableCategoria.getModel().getValueAt(row, 1));
            vista.jtxtCategoria.setText(categoriaModificar.getNombre());
            desactivarBotones();
            verificarLabels();
            modificando = true;
        }
        else if(e.getSource()==vista.btnModificarLM){
            int row=vista.jtableMarca.getSelectedRow();
            marcaModificar.setIdMarca(Integer.parseInt((String)vista.jtableMarca.getModel().getValueAt(row, 0)));
            marcaModificar.setNombre((String)vista.jtableMarca.getModel().getValueAt(row, 1));
            vista.jtxtMarca.setText(marcaModificar.getNombre());
            desactivarBotones();
            verificarLabels();
            modificandoM=true;
        }
    }
    
    //Registrar Categoria
    public void registrar(){
        Categoria cat= new Categoria();
        cat.setNombre(vista.jtxtCategoria.getText());
        if(consultasC.registrar(cat)){
            JOptionPane.showMessageDialog(null,"Registro Exitoso");
            vista.jtxtCategoria.setText("");
            consultasC.limpiarTabla(vista.jtableCategoria);
        }
        else{
            JOptionPane.showMessageDialog(null,"Error al guardar");
        }
    }
    
    //Registrar Marca
    public void registrarM(){
        Marca marc=new Marca();
        marc.setNombre(vista.jtxtMarca.getText());
        if (consultasM.registrar(marc)){
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            vista.jtxtMarca.setText("");
            consultasM.tablaMarca(vista.jtableMarca);
        }
        else{
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
    }
    
    //Modificar Categoria
    public void modificar(){
        categoriaModificar.setNombre(vista.jtxtCategoria.getText());
        if (consultasC.modificar(categoriaModificar)){
            JOptionPane.showMessageDialog(null, "Categoria Modificado Exitosamente");
            vista.jtxtCategoria.setText("");
            consultasC.limpiarTabla(vista.jtableCategoria);
        }
        else{
            JOptionPane.showMessageDialog(null, "Error al modificar");
        }
    }
    
    //Modificar Marca
    public void modificarM(){
        marcaModificar.setNombre(vista.jtxtMarca.getText());
        if(consultasM.modificar(marcaModificar)){
            JOptionPane.showMessageDialog(null, "Marca Modificado Exitosamente");
            vista.jtxtMarca.setText("");
            consultasM.tablaMarca(vista.jtableMarca);
        }else{
            JOptionPane.showMessageDialog(null, "Error al modificar");
        }
        
    }
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==vista.jlblInicio){
           ControladorAdministrador controladorA = 
                   new ControladorAdministrador(vistaAdmin,modelo);
           controladorA.iniciar();
           vista.dispose();
        }
        else if (e.getSource()==vista.jtableCategoria){
            vista.btnModificarC.setEnabled(true);
            vista.btnEliminarC.setEnabled(true);  
            if (e.getClickCount()==2){
                desactivarBotones();
            }
        }
        else if(e.getSource()==vista.jtableMarca){
            vista.btnModificarLM.setEnabled(true);
            vista.btnEliminarLM.setEnabled(true);
            if(e.getClickCount()==2){
                desactivarBotones();
            }
        }
        else if(e.getSource()==vista.jPanel1){
            desactivarBotones();
        }
        else if(e.getSource()==vista.jPanel2){
            desactivarBotones();
        }
        else if(e.getSource()==vista.jPanel3){
            desactivarBotones();
        }
        else if(e.getSource()==vista.jPanel4){
            desactivarBotones();
        }
        else if(e.getSource()==vista.jPanel6){
            desactivarBotones();
        }
        
    }
    public void desactivarBotones(){
        vista.jtableCategoria.clearSelection();
        //vista.btnGuardar.setEnabled(false);
        //vista.btnGuardarM.setEnabled(false);
        vista.btnEliminarC.setEnabled(false);
        vista.btnModificarC.setEnabled(false);
        vista.jtableMarca.clearSelection();
        vista.btnEliminarLM.setEnabled(false);
        vista.btnModificarLM.setEnabled(false);
    }
    
     @Override
    public void windowOpened(WindowEvent e) {
        vista.btnGuardar.setEnabled(false);
        vista.btnModificarC.setEnabled(false);
        vista.btnEliminarC.setEnabled(false);
        vista.btnGuardarM.setEnabled(false);
        vista.btnModificarLM.setEnabled(false);
        vista.btnEliminarLM.setEnabled(false);
        
    }
    
    public void verificarLabels(){
        if(vista.jtxtCategoria.getText().length()>2){
             vista.btnGuardar.setEnabled(true);
            }
        else{
            desactivarBotones();
            vista.btnGuardar.setEnabled(false);
        }
        if(vista.jtxtMarca.getText().length()>=2){
            vista.btnGuardarM.setEnabled(true);
        }else{
            desactivarBotones();
            vista.btnGuardarM.setEnabled(false);
        }
    }
    
       @Override
    public void insertUpdate(DocumentEvent e) {
        verificarLabels();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        verificarLabels();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        verificarLabels();
    }
    
    
    
    
    
    
    
    
    
    
    
       @Override
    public void mouseExited(MouseEvent e) {

    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
      
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

   
    
    
    
}
