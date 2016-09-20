package mx.edu.utng.single;

/**
 * Created by Jose Antonio Enrique on 11/09/2016.
 */
public class Usuario {
    private String nombre;
    private String apellidos;
    private String email;
    private String contrasena;
    private static Usuario usuario;

    private Usuario(){
        this.nombre = "";
        this.apellidos = "";
        this.email = "";
        this.contrasena = "";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getApellidos() {
        return apellidos;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    public String getContrasena(){
        return contrasena;
    }

    public static Usuario getUsuario(){
        if (usuario == null) {
            usuario = new Usuario();
        }
        return usuario;
    }

}

