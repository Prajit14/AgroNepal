package com.example.agronepal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.agronepal.Dashboard.Dashboard;

public class MainActivity extends AppCompatActivity {

    private  static int SPLASH_SCREEN =4000;
     // VAriables
    Animation tanim;
    ImageView imglogo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        // ANimation
        tanim = AnimationUtils.loadAnimation(this,R.anim.tanimation);

        // Hooks
        imglogo = findViewById(R.id.logoimage);
        imglogo.setAnimation(tanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Dashboard.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN) ;

    }
}