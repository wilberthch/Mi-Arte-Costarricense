package wems.org.miartecostarricense.backend.tablas;

import wems.org.miartecostarricense.backend.LinkDBHelper;

/**
 * Created by will on 10/18/15.
 */
public abstract class Tabla {
    protected LinkDBHelper linkDBHelper;
    public Tabla()
    {
        linkDBHelper = LinkDBHelper.getInstance();
    }
    public abstract void save();
}
