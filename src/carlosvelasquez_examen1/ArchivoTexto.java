package carlosvelasquez_examen1;

public class ArchivoTexto extends Archivo{
    private String contenido;

    public ArchivoTexto(String nombre, float tamaño) {
        super(nombre, tamaño);
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "📂 " + nombre;
    }
    
    
}
