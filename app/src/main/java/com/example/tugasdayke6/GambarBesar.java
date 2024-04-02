package com.example.tugasdayke6;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class GambarBesar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gambar_besar);

        ImageView gambarBesar = findViewById(R.id.imageView);

        // Menerima ID gambar yang dikirim dari intent
        int gambarId = getIntent().getIntExtra("GAMBAR_EXTRA", 0);

        // Mengatur gambar dalam tampilan besar
        gambarBesar.setImageResource(gambarId);
    }
}
