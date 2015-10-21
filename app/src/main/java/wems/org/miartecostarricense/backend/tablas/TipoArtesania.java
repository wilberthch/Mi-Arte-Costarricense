package wems.org.miartecostarricense.backend.tablas;

import java.util.LinkedList;

/**
 * Created by will on 10/18/15.
 */
public class TipoArtesania extends Tabla {

    private static int tipoArtesaniaCount = 0;
    private String nombre;
    private int tipoArtesaniaId;
    private int imgId;
    private LinkedList<Artesano> artesanos;
    private static final String nombre_tabla = "artesaniasdb.TipoArtesania";
    private static final String tipoArtesaniaIdColName = "TipoArtesaniaId";
    private static final String nombreColName = "Nombre";
    private static final String ImgIdColName = "ImgId";

    public TipoArtesania()
    {
        tipoArtesaniaCount++;
        tipoArtesaniaId = tipoArtesaniaCount;
    }

    public static String crear_tabla()
    {
        return "CREATE TABLE "+ nombre_tabla +" " +
                "( "+ tipoArtesaniaIdColName +"  INTEGER PRIMARY KEY, "+ nombreColName +" TEXT, "+ ImgIdColName +"  INTEGER);";
    }

    public static String eliminar_tabla()
    {
        return "DROP TABLE IF EXISTS " + nombre_tabla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoArtesaniaId() {
        return tipoArtesaniaId;
    }

    public void setTipoArtesaniaId(int tipoArtesaniaId) {
        this.tipoArtesaniaId = tipoArtesaniaId;
    }

    public void insertarArtesano(Artesano pArtesano)
    {
        artesanos.add(pArtesano);
    }

    public LinkedList<Artesano> getArtesanos() {
        return artesanos;
    }

    @Override
    public void save() {

        Object[] datos = { tipoArtesaniaId, nombre, imgId };

        linkDBHelper.mantenimiento("insert into "+nombre_tabla+"("+ tipoArtesaniaId +","+ nombre +", "+ imgId +") " +
                "values (?,?,?);",datos);

    }
}
