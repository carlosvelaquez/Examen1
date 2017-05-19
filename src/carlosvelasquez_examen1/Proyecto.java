package carlosvelasquez_examen1;

import java.util.ArrayList;

public class Proyecto {
    private String nombre;
    private ArrayList<Archivo> archivos = new ArrayList();
    private ArrayList<Usuario> colaboradores = new ArrayList();
    private int commits;

    public Proyecto(String nombre, int commits) {
        this.nombre = nombre;
        this.commits = commits;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivo> archivos) {
        this.archivos = archivos;
    }

    public ArrayList<Usuario> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ArrayList<Usuario> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public int getCommits() {
        return commits;
    }

    public void setCommits(int commits) {
        this.commits = commits;
    }

    @Override
    public String toString() {
        return nombre + ", " + commits + " Commits, " + archivos.size() + " Archivos y Carpetas";
    }
    
    
}
