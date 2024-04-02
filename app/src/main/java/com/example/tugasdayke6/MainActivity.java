package com.example.tugasdayke6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton tombolsepatu = findViewById(R.id.TombolSepatu);

        tombolsepatu.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.TombolSepatu) {
            Intent CardViewPertama = new Intent(MainActivity.this, SepatuActivity.class);
            startActivity(CardViewPertama);
        }
    }
}