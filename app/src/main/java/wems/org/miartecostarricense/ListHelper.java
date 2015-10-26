package wems.org.miartecostarricense;

/**
 * Created by will on 10/25/15.
 */

import android.app.Activity;
import android.content.Context;

import java.util.ArrayList;

public class ListHelper {

    protected static ArrayList<Mensaje> buildData() {
        ArrayList<Mensaje> list = new ArrayList<Mensaje>();

        Mensaje obj = new Mensaje("Frank", "Hola");
        list.add(obj);

        Mensaje obj2 = new Mensaje("Lucía", "Buenas tardes");
        list.add(obj2);

        Mensaje obj3 = new Mensaje("Frank", "Necesito su ayuda");
        list.add(obj3);

        return list;
    }

    // -----------------------------------------------------------------------------------------------------------


    public static ViewHolderAdapter buildViewHolderAdapter(Context context,
                                                           int textViewResourceId) {

        ArrayList<Mensaje> list = buildData();
        ViewHolderAdapter viewHolder = new ViewHolderAdapter(context, textViewResourceId);
        viewHolder.addAll(list);
        return viewHolder;
    }

    // -----------------------------------------------------------------------------------------------------------

}
