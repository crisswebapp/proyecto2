/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import AppPackage.AnimationClass;
import Modelo.Usuario;
import Vista.Administrador;
import Vista.VUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author criss
 */
public class ControladorAdministrador implements ActionListener, MouseListener {
    private Administrador vista;
    private Usuario modelo;
    private VUsuario vistaUsuario = new VUsuario();
    
    public ControladorAdministrador(Administrador vista, Usuario modelo){
        this.vista = vista;
        this.modelo = modelo;
        vista.jlblConfiguracion.addMouseListener(this);
        vista.jlblCorteCaja.addMouseListener(this);
        vista.jlblCorteCaja.addMouseListener(this);
        vista.jlblEntradas.addMouseListener(this);
        vista.jlblFacturas.addMouseListener(this);
        vista.jlblInventario.addMouseListener(this);
        vista.jlblProveedores.addMouseListener(this);
        vista.jlblReportes.addMouseListener(this);
        vista.jlblUsuarios.addMouseListener(this);
        vista.jlblMinimizar.addMouseListener(this);
        vista.btnCerrarSesion.addActionListener(this);
    
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==vista.btnCerrarSesion){
            int dialog =JOptionPane.YES_NO_OPTION;
            int result=JOptionPane.showConfirmDialog(null, "Desea cerrar el programa?","Exit",dialog);
            if (result==0){
                System.exit(0);
            }
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getSource()==vista.jlblUsuarios){
            ControladorUsuario controlador = new ControladorUsuario(vistaUsuario,modelo);
            controlador.iniciar();
            vista.dispose();
            
        }else if(me.getSource()==vista.jlblProveedores){
            
        }else if(me.getSource()==vista.jlblEntradas){
        
        }else if(me.getSource()==vista.jlblInventario){
        
        }else if(me.getSource()==vista.jlblReportes){
        
        }else if(me.getSource()==vista.jlblFacturas){
        
        }else if(me.getSource()==vista.jlblCorteCaja){
        
        }else if(me.getSource()==vista.jlblConfiguracion){
        
        }
        
        
    }
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
}