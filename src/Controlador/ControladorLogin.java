/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultasUsuario;
import Vista.Login;
import Modelo.Usuario;
import Vista.Administrador;
import Vista.Ventas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author criss
 */
public class ControladorLogin implements ActionListener, KeyListener, MouseListener {
    private Login vista;
    private Usuario modelo = new Usuario();
    private Administrador vistaAdmin = new Administrador();
    private ConsultasUsuario consulta = new ConsultasUsuario();
    private Ventas vistaVentas = new Ventas();
    //inicializa en controlador
    public ControladorLogin(Login vis){
        this.vista = vis;
        //lee el evento del boton
        vista.jPassword.addKeyListener(this);
        vista.jtxtUsuario.addKeyListener(this);
        vista.btnIniciarSesion.addActionListener(this);
        vista.jlblCerrar.addMouseListener(this);
        vista.jblbMinimizar.addMouseListener(this);
      
                
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        //evento al hacer clic boton aceptar 
        if(ae.getSource()==vista.btnIniciarSesion){
            session();
        }  
    }
    
    @Override
    public void keyPressed(KeyEvent ke) {
        //evento al precionar la tecla "Enter"
        //pasa focus al jpassword
        if(ke.getSource()==vista.jtxtUsuario){
            if(ke.getKeyCode()==KeyEvent.VK_ENTER){
                vista.jPassword.requestFocus();
            }
            
        }
        //evento al precionar la tecla "Enter"
        //ejecuta la funcion session
        if(ke.getSource()==vista.jPassword){
            if(ke.getKeyCode()==KeyEvent.VK_ENTER){
               session();
                                               
            }
        }
            
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        //salir del programa
        if(me.getSource()==vista.jlblCerrar){
            int dialog =JOptionPane.YES_NO_OPTION;
            int result=JOptionPane.showConfirmDialog(null, "Desea cerrar el programa?","Exit",dialog);
            if (result==0){
                System.exit(0);
            }
        }else if(me.getSource()==vista.jblbMinimizar){
            vista.setState(Login.ICONIFIED);
        }
    }
    //funcion para iniciar seccion
    private void session(){
        try{
            Usuario modelo = new Usuario();
            modelo.setNombreUsuario(vista.jtxtUsuario.getText());
            modelo.setContraseña(String.valueOf(vista.jPassword.getPassword()));

            //verifica existe el usuario
            if(consulta.iniciarSesion(modelo)){

                //ingreso exitoso       
                JOptionPane.showMessageDialog(null,"Ingreso Exitoso");
                if(modelo.getTipo().equals("Admin")){

                    ControladorAdministrador controladorA = 
                            new ControladorAdministrador(vistaAdmin,modelo);
                    vista.dispose();
                    controladorA.iniciar();

                }else if(modelo.getTipo().equals("Empleado")){
                    ControladorVentas ControlVentas = 
                            new ControladorVentas(vistaVentas,modelo);

                    ControlVentas.iniciar();
                    vista.dispose();


                }else{}

            }else{
                //usuario no existe
                JOptionPane.showMessageDialog(null,"Nombre de usuario o contraseña");
                vista.jtxtUsuario.setText("");
                vista.jPassword.setText("");
                vista.jtxtUsuario.requestFocus();
            }
            
        }catch(Exception e){}
        
    }
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
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
