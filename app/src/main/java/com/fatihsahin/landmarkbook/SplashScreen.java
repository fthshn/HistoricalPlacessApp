package com.fatihsahin.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.*;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    private TextView textView;
    private ImageView imageView2;
    private static int GECIS_SURESI = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        textView = findViewById(R.id.textView);
        imageView2 = findViewById(R.id.imageView2);

        //Animasyon

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animation);
        textView.startAnimation(animation);
        imageView2.startAnimation(animation);

        //Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.animation2);
        //textView.startAnimation(animation2);
        //imageView2.startAnimation(animation2);

        //Geçiş
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gecis = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(gecis);
                SplashScreen.this.finish();

                overridePendingTransition(R.anim.animation,R.anim.animation2);
            }
        },GECIS_SURESI);
    }
}