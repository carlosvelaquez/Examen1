package carlosvelasquez_examen1;

import java.util.ArrayList;

public class Carpeta extends Archivo{
    ArrayList<Archivo> archivos = new ArrayList();

    public Carpeta(String nombre, float tamaño) {
        super(nombre, tamaño);
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }

    @Override
    public String toString() {
        return "📂 " + nombre;
    }
    
    
}
