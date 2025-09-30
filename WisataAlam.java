/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class WisataAlam extends TempatWisata {
    private int ketinggian;

    public WisataAlam(String nama, String lokasi, int ketinggian) {
        super(nama, lokasi, "Alam");
        this.ketinggian = ketinggian;
    }

    public int getKetinggian() { return ketinggian; }
    public void setKetinggian(int ketinggian) { this.ketinggian = ketinggian; }

    @Override
    public String info() {
        return super.info() + " | Ketinggian: " + ketinggian + " mdpl";
    }
}

