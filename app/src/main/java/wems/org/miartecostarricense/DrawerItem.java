package wems.org.miartecostarricense;

/**
 * Created by will on 10/17/15.
 */
public class DrawerItem
{
    public DrawerItem(String nombre, int iconId) {
        this.nombre = nombre;
        this.iconId = iconId;
    }

    private String nombre;
    private int iconId;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }
}
