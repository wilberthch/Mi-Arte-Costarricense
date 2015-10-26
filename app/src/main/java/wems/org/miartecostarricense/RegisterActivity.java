package wems.org.miartecostarricense;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {

    private final int SELECT_PHOTO = 1;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ListView listView = (ListView) findViewById(R.id.ltTipoArtesanias);

        ArrayList<TipoArtesania> artesanias = getTipoArtesaniaData();

        CheckedListViewAdapter adapter = new CheckedListViewAdapter
                                                (
                                                        getApplicationContext(),
                                                        R.layout.list_item_checked,
                                                        artesanias
                                                );
        listView.setAdapter(adapter);

        imageView = (ImageView)findViewById(R.id.imageView);

        LinearLayout pickImage = (LinearLayout) findViewById(R.id.btn_fotoPerfil);
        pickImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, SELECT_PHOTO);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent imageReturnedIntent) {
        super.onActivityResult(requestCode, resultCode, imageReturnedIntent);

        switch(requestCode) {
            case SELECT_PHOTO:
                if(resultCode == RESULT_OK){
                    try {
                        final Uri imageUri = imageReturnedIntent.getData();
                        final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                        imageView.setImageBitmap(selectedImage);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                }
        }
    }



    private ArrayList<TipoArtesania> getTipoArtesaniaData(                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ) {
        final ArrayList<TipoArtesania> artesaniasArray = new ArrayList<>();
        TypedArray tipos_artesanias = getResources().obtainTypedArray(R.array.tipos_artesanias);
        for (int i = 0; i < tipos_artesanias.length(); i++) {
            String nombreArtesania = tipos_artesanias.getString(i);

            artesaniasArray.add(new TipoArtesania(nombreArtesania, false));
        }
        return artesaniasArray;
    }
}
