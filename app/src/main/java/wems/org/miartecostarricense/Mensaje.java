package wems.org.miartecostarricense;

/**
 * Created by will on 10/25/15.
 */
public class Mensaje {
    private String nombre;
    private String texto;

    public Mensaje() {}

    public Mensaje(String nombre, String texto) {
        this.setNombre(nombre);
        this.setTexto(texto);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
