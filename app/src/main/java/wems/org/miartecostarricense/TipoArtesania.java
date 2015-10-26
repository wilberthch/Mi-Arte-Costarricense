package wems.org.miartecostarricense;

/**
 * Created by will on 10/26/15.
 */
public class TipoArtesania {
    private String nombre;
    private boolean checked;

    public TipoArtesania(String nombre, boolean checked) {
        this.setNombre(nombre);
        this.setChecked(checked);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
