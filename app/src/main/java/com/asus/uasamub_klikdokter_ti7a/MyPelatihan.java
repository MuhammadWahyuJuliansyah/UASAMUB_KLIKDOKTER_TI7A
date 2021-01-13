package com.asus.uasamub_klikdokter_ti7a;

public class MyPelatihan {

    String nama_dokter, lokasi;
    String jumlah_pembelian;

    public MyPelatihan() {
    }

    public MyPelatihan(String nama_dokter, String lokasi, String jumlah_pembelian) {
        this.nama_dokter = nama_dokter;
        this.lokasi = lokasi;
        this.jumlah_pembelian = jumlah_pembelian;
    }

    public String getNama_dokter() {
        return nama_dokter;
    }

    public void setNama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getJumlah_pembelian() {
        return jumlah_pembelian;
    }

    public void setJumlah_pembelian(String jumlah_pembelian) {
        this.jumlah_pembelian = jumlah_pembelian;
    }
}
