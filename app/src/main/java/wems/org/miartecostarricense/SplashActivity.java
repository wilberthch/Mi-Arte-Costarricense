package wems.org.miartecostarricense;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread sleepThread = new Thread(){

            public void run(){
                try {
                    sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {

                    Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            }

        };

        sleepThread.start();
    }
}
