package me.wagner.sportappdemo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    private static final long SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i;
                i = new Intent(SplashActivity.this, LoginActivity.class);
                // Testa se já está logado.
//                if (ParseUser.getCurrentUser() != null) {
//                    // Se está, vai para Homepage
//                    i = new Intent(SplashActivity.this, HomepageActivity.class);
//                } else {
//                    // Se não estiver, vais para o Login/Registro
//                    i = new Intent(SplashActivity.this, LoginActivity.class);
//                }
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}
