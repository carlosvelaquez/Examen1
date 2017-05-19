package carlosvelasquez_examen1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    static ArrayList<Usuario> usuarios = new ArrayList();
    static ArrayList<Proyecto> proyectos = new ArrayList();
    static Usuario usuarioActual;
    static Proyecto proyectoActual;
    static Carpeta carpetaActual;
    static ArchivoTexto archivoActual;
    
    static MenuPrincipal mp = new MenuPrincipal();
    static MenuProyecto mpro = new MenuProyecto();
    static RegistrarUsuario ru = new RegistrarUsuario();
    static ModificarUsuario mu = new ModificarUsuario();
    static EliminarUsuario eu = new EliminarUsuario();

    public static void main(String[] args) {
        try{
            mp.main(args);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Debe ingresar un número en el campo de edad", "Error",0);
        }
    }
    
    static boolean iniciarSesion(String user, String pass) {
        for (Usuario u : usuarios) {
            if (u.getUsername().equals(user) && u.getPassword().equals(pass)) {
                usuarioActual = u;
                return true;
            }
        }
        return false;
    }
    
    static void push(){
        
    }

}
