/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class WisataBudaya extends TempatWisata {
    private String acaraAdat;

    public WisataBudaya(String nama, String lokasi, String acaraAdat) {
        super(nama, lokasi, "Budaya");
        this.acaraAdat = acaraAdat;
    }

    public String getAcaraAdat() { return acaraAdat; }
    public void setAcaraAdat(String acaraAdat) { this.acaraAdat = acaraAdat; }

    @Override
    public String info() {
        return super.info() + " | Acara Adat: " + acaraAdat;
    }
}
