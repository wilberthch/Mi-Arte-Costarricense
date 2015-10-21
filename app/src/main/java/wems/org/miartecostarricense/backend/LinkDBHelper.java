package wems.org.miartecostarricense.backend;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import wems.org.miartecostarricense.MiArteCostarricense;

/**
 * Created by will on 10/18/15.
 */
public class LinkDBHelper {

    private static LinkDBHelper instance = null;
    private static LinkDB linkDB;


    private LinkDBHelper() {
        Context context = MiArteCostarricense.getAppContext();
        linkDB = new LinkDB(context);
    }

    public static LinkDBHelper getInstance() {
        if(instance == null) {
            instance = new LinkDBHelper();

        }
        return instance;
    }

    public static void mantenimiento(String sql, Object[] valores)
    {
        SQLiteDatabase db = linkDB.getWritableDatabase();
        db.execSQL(sql,valores);

        //db.close();

    }


    public static Cursor select(String sql, String[] valores)
    {
        SQLiteDatabase db = linkDB.getReadableDatabase();
        Cursor cr = db.rawQuery(sql,valores);

        //db.close();
        return cr;

    }

}
