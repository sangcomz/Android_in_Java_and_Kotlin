package xyz.sangcomz.android_in_java_and_kotlin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        System.out.println("SplashActivity");

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}