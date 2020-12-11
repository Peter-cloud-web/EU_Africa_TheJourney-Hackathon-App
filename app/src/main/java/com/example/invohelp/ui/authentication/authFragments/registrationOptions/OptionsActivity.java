package com.example.invohelp.ui.authentication.authFragments.registrationOptions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.invohelp.MainActivity;
import com.example.invohelp.R;

public class OptionsActivity extends AppCompatActivity implements View.OnClickListener {
  ImageView donorRegisters,invoiceHolderRegisters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        invoiceHolderRegisters = findViewById(R.id.invoiceRegistration);
        invoiceHolderRegisters.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == invoiceHolderRegisters){
            openMainActivity();
        }
    }

    public void openMainActivity(){
        startActivity(new Intent(OptionsActivity.this, MainActivity.class));

    }
}