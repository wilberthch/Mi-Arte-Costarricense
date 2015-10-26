package wems.org.miartecostarricense;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class AccountActivity extends AppCompatActivity {

    private boolean esArtesano = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        ListView listView = (ListView) findViewById(R.id.ltTipoArtesanias);

        ArrayList<TipoArtesania> artesanias = getTipoArtesaniaData();

        CheckedListViewAdapter adapter = new CheckedListViewAdapter
                (
                        getApplicationContext(),
                        R.layout.list_item_checked,
                        artesanias
                );
        listView.setAdapter(adapter);



    }

    private ArrayList<TipoArtesania> getTipoArtesaniaData(                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ) {
        final ArrayList<TipoArtesania> artesaniasArray = new ArrayList<>();
        TypedArray tipos_artesanias = getResources().obtainTypedArray(R.array.tipos_artesanias);
        for (int i = 0; i < tipos_artesanias.length(); i++) {
            String nombreArtesania = tipos_artesanias.getString(i);

            artesaniasArray.add(new TipoArtesania(nombreArtesania, esArtesano));
            esArtesano = !esArtesano;
        }
        return artesaniasArray;
    }
}
