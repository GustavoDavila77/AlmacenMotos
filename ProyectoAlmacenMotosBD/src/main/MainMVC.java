package main;

import controlador.Controlador;
//import modelo.Conexion;
import vista.ViewLogin;
import vista.ViewMenuAdmin;
import vista.ViewModificar;
import vista.ViewRegistro;
import vista.ViewVenta;

/**
 *
 * @author Gustavo Davila
 */
public class MainMVC {
    
    
    public static void main(String arg[]){
     
       //Conexion conec = new Conexion();
       ViewLogin view_login = new ViewLogin();
       ViewRegistro view_reg = new ViewRegistro();
       ViewVenta view_venta = new ViewVenta();
       ViewMenuAdmin view_menu_admin = new ViewMenuAdmin();
       ViewModificar view_modidicar = new ViewModificar(); 
       Controlador control = new Controlador(view_login, view_reg,view_menu_admin,
                                            view_venta, view_modidicar);   
       
       control.iniciar();
       view_login.setVisible(true);  
    }
}
