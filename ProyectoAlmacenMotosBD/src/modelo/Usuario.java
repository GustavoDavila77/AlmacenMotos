
package modelo;

import javax.swing.JOptionPane;
import vista.ViewRegistro;

/**
 *
 * @author Gustavo Davila
 */
public class Usuario {
    
    private String id_emp;  // cedula 
    private String password;
    private String nombre; 
    private String apellido; 
    private String telefono; 
    private String correo; 
    private String ultima_seccion; 
    private int tipo_emp; 

    public String getId_emp() {
        return id_emp;
    }

    public void setId_emp(String id_emp) {
        this.id_emp = id_emp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUltima_seccion() {
        return ultima_seccion;
    }

    public void setUltima_seccion(String ultima_seccion) {
        this.ultima_seccion = ultima_seccion;
    }

    public int getTipo_emp() {
        return tipo_emp;
    }

    public void setTipo_emp(int tipo_emp) {
        this.tipo_emp = tipo_emp;
    } 

    public void registrarUser(ViewRegistro view_reg, String password){
        
        Usuario newuser = new Usuario();
        SqlUsuario sqluser = new SqlUsuario();
        // Hacer cifrado de contraseña
        this.setId_emp(view_reg.caja_codigo.getText()); 
        this.setPassword(password);
        this.setNombre(view_reg.caja_nombre.getText());
        this.setApellido(view_reg.caja_apellido.getText());
        this.setTelefono(view_reg.caja_telefono.getText());
        this.setCorreo(view_reg.caja_correo.getText());
        this.setId_emp(view_reg.caja_codigo.getText());
        this.setTipo_emp(Integer.parseInt(view_reg.caja_tipo_emp.getText())); // 1 es administrador, 2 es empleado

        if(sqluser.registrar(newuser)){
            JOptionPane.showMessageDialog(null,"El registro se ha guardado");
        }
        else{
            JOptionPane.showMessageDialog(null,"Error al guardar");
        }
            
        
    }
 }
 
