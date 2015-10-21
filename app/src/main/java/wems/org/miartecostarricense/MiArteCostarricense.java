package wems.org.miartecostarricense;

import android.app.Application;
import android.content.Context;

/**
 * Created by will on 10/18/15.
 */
public class MiArteCostarricense extends Application {

    private static Context context;

    public void onCreate(){
        super.onCreate();
        MiArteCostarricense.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return MiArteCostarricense.context;
    }
}
