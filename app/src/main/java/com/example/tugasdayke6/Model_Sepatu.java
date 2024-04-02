package com.example.tugasdayke6;

import java.io.Serializable;

public class Model_Sepatu implements Serializable {
    private String namaSepatu;
    private int gambarSepatu;
    private String deskripsiSepatu;
    private String hargaSepatu;

    public Model_Sepatu(String namaSepatu, int gambarSepatu, String deskripsiSepatu, String hargaSepatu) {
        this.namaSepatu = namaSepatu;
        this.gambarSepatu = gambarSepatu;
        this.deskripsiSepatu = deskripsiSepatu;
        this.hargaSepatu = hargaSepatu;
    }




    public String getNama_sepatu() {
        return namaSepatu;
    }

    public int getGambar_sepatu() {
        return gambarSepatu;
    }

    public String getDeskripsi_sepatu() {
        return deskripsiSepatu;
    }

    public String getHarga_sepatu() {
        return hargaSepatu;
    }

    public void setNamaSepatu(String namaSepatu) {
        this.namaSepatu = namaSepatu;
    }

    public void setGambarSepatu(int gambarSepatu) {
        this.gambarSepatu = gambarSepatu;
    }

    public void setDeskripsiSepatu(String deskripsiSepatu) {
        this.deskripsiSepatu = deskripsiSepatu;
    }

    public void setHargaSepatu(String hargaSepatu) {
        this.hargaSepatu = hargaSepatu;
    }


}
