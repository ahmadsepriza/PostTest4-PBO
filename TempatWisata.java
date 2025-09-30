/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class TempatWisata {
    private String nama;
    private String lokasi;;

    private String kategori
    public TempatWisata(String nama, String lokasi, String kategori) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.kategori = kategori;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getLokasi() { return lokasi; }
    public void setLokasi(String lokasi) { this.lokasi = lokasi; }

    public String getKategori() { return kategori; }
    public void setKategori(String kategori) { this.kategori = kategori; }

    public String info() {
        return nama + " - " + lokasi + " (" + kategori + ")";
    }

    @Override
    public String toString() {
        return info();
    }
}
