package wems.org.miartecostarricense.backend;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by will on 10/18/15.
 */
class LinkDB extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "artesaniasdb";


    public LinkDB(Context context)
    {

        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("PRAGMA encoding = \"UTF-8\"");


    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        /*db.execSQL(usuarios.crear_tabla());
        db.execSQL(palabras.crear_tabla());
        db.execSQL(T_estadisticas.crear_tabla());*/

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        /*db.execSQL(usuarios.eliminar_tabla());
        db.execSQL(palabras.eliminar_tabla());
        db.execSQL(T_estadisticas.eliminar_tabla());
        onCreate(db);*/

    }

    public void mantenimiento(String sql, Object[] valores)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        //db.insert(tabla,null,valores);
        db.execSQL(sql,valores);

        //db.close();

    }


    public Cursor select(String sql, String[] valores)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cr = db.rawQuery(sql,valores);

        //db.close();
        return cr;

    }
}
