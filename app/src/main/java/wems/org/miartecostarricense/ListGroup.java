package wems.org.miartecostarricense;

/**
 * Created by will on 10/19/15.
 */
public class ListGroup {

    private String nombre;

    private int icono;

    public ListGroup(String nombre, int icono) {
        this.nombre = nombre;
        this.icono = icono;
    }

    public ListGroup(String nombre) {
        this.nombre = nombre;
        this.icono = 0;
    }

    public int getIcono() {
        return icono;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
