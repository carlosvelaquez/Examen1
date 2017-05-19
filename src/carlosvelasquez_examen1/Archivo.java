package carlosvelasquez_examen1;

public class Archivo {
    
    String nombre;
    private float tamaño;

    public Archivo(String nombre, float tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
    
}
