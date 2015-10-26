package wems.org.miartecostarricense;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by will on 10/26/15.
 */
public class NavHeaderMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_header_main);

        LinearLayout nav = (LinearLayout) findViewById(R.id.btn_nav);

        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NavHeaderMain.this, AccountActivity.class);
                startActivity(intent);
            }
        });
    }
}
