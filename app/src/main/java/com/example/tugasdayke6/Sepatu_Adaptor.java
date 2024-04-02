package com.example.tugasdayke6;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Sepatu_Adaptor extends RecyclerView.Adapter<Sepatu_Adaptor.ViewHolder> {

    private ArrayList<Model_Sepatu> modelSepatu;
    private Context context;

    public interface OnItemClickListener {
        void onItemClick(Model_Sepatu sepatu);
    }

    private OnItemClickListener listener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }




    public Sepatu_Adaptor(ArrayList<Model_Sepatu> modelSepatu) {
        this.modelSepatu = modelSepatu;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model_Sepatu sepatu = modelSepatu.get(position);
        holder.nama_sepatu.setText(sepatu.getNama_sepatu());
        holder.gambar_sepatu.setImageResource(sepatu.getGambar_sepatu());
        holder.deskripsi_sepatu.setText(sepatu.getDeskripsi_sepatu());
        holder.harga_sepatu.setText(sepatu.getHarga_sepatu());
        holder.Teks_Scroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mengirim objek Model_Sepatu yang diklik ke DetailActivity
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("SEPATU_EXTRA", sepatu);
                context.startActivity(intent);
            }
        });


        holder.gambar_sepatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menampilkan gambar dalam tampilan besar
                Intent intent = new Intent(context, GambarBesar.class);
                intent.putExtra("GAMBAR_EXTRA", sepatu.getGambar_sepatu()); // Mengirim ID gambar
                context.startActivity(intent);
            }
        });

        holder.Kartu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mengirim objek Model_Sepatu yang diklik ke DetailActivity
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("SEPATU_EXTRA", sepatu);
                context.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return modelSepatu.size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView Kartu;
        TextView nama_sepatu;
        ImageButton gambar_sepatu;
        TextView deskripsi_sepatu;
        TextView harga_sepatu;
        ScrollView Teks_Scroll;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Kartu = itemView.findViewById(R.id.CardViewSepatu);
            Teks_Scroll = itemView.findViewById(R.id.scrolldeskripsi);
            nama_sepatu = itemView.findViewById(R.id.TeksNama);
            gambar_sepatu = itemView.findViewById(R.id.Gambar);
            deskripsi_sepatu = itemView.findViewById(R.id.textDeskripsi);
            harga_sepatu = itemView.findViewById(R.id.Rp1);
        }
    }
}
