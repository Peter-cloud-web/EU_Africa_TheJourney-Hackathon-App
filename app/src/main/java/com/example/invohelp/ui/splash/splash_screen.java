package com.example.invohelp.ui.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.invohelp.R;
import com.example.invohelp.ui.authentication.AuthActivity;
import com.example.invohelp.ui.authentication.authFragments.registrationOptions.OptionsActivity;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent  = new Intent(splash_screen.this, OptionsActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}