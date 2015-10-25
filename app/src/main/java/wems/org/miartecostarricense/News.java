package wems.org.miartecostarricense;

/**
 * Created by will on 10/25/15.
 */
public class News {
    private String tituloNoticia;
    private String fecha;
    private String hora;

    public News(){
        
    }

    public News(String tituloNoticia, String fecha, String hora, String descripcion) {
        this.tituloNoticia = tituloNoticia;
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;
    }

    private String descripcion;


    public String getTituloNoticia() {
        return tituloNoticia;
    }

    public void setTituloNoticia(String tituloNoticia) {
        this.tituloNoticia = tituloNoticia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
