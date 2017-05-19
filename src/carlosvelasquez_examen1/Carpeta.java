package carlosvelasquez_examen1;

import java.util.ArrayList;

public class Carpeta extends Archivo{
    ArrayList<Archivo> archivos = new ArrayList();
    Carpeta carpetaPadre;

    public Carpeta(String nombre, float tamaño, Carpeta padre) {
        super(nombre, tamaño);
        carpetaPadre = padre;
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }

    public Carpeta getCarpetaPadre() {
        return carpetaPadre;
    }

    public void setCarpetaPadre(Carpeta carpetaPadre) {
        this.carpetaPadre = carpetaPadre;
    }

    
    

    @Override
    public String toString() {
        return "📂 " + nombre;
    }
    
    
}
