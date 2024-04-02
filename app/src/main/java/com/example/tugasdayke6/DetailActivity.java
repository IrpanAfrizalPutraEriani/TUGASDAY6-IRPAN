package com.example.tugasdayke6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Menerima data dari Intent
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("SEPATU_EXTRA")) {
            Model_Sepatu sepatu = (Model_Sepatu) intent.getSerializableExtra("SEPATU_EXTRA");

            // Gunakan data objek Model_Sepatu untuk menampilkan detail sepatu
            TextView namaTextView = findViewById(R.id.Nama);
            ImageView imageView = findViewById(R.id.imageView);
            TextView deskripsiTextView = findViewById(R.id.Deskripsi);
            TextView hargaTextView = findViewById(R.id.Harga);
            ImageButton tombolkirim = findViewById(R.id.TombolKirim);

            namaTextView.setText(sepatu.getNama_sepatu());
            imageView.setImageResource(sepatu.getGambar_sepatu());
            deskripsiTextView.setText(sepatu.getDeskripsi_sepatu());
            hargaTextView.setText(sepatu.getHarga_sepatu());

            tombolkirim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String text ="Nama Barang :\n\n" + sepatu.getNama_sepatu() + "\n\n" + "Deskripsi Barang :\n\n" + sepatu.getDeskripsi_sepatu() +  "\n\n" + "Harga Barang : " + sepatu.getHarga_sepatu();
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_TEXT, text);
                    startActivity(Intent.createChooser(shareIntent, "Bagikan With"));
                }
            });
        }
    }
}
