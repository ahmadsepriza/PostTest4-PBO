/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.ArrayList;
import java.util.List;
import com.mycompany.posttest4.model.TempatWisata;
import model.TempatWisata;

public class WisataServices {
    private final List<TempatWisata> daftarWisata = new ArrayList<>();

    public void tambahWisata(TempatWisata wisata) {
        daftarWisata.add(wisata);
        System.out.println("Data berhasil ditambahkan!");
    }

    public void tampilkanWisata() {
        if (daftarWisata.isEmpty()) {
            System.out.println("Belum ada data wisata.");
        } else {
            for (int i = 0; i < daftarWisata.size(); i++) {
                System.out.println((i+1) + ". " + daftarWisata.get(i));
            }
        }
    }

    public void updateWisata(int index, TempatWisata wisataBaru) {
        if (index >= 0 && index < daftarWisata.size()) {
            daftarWisata.set(index, wisataBaru);
            System.out.println("Data berhasil diupdate!");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    public void hapusWisata(int index) {
        if (index >= 0 && index < daftarWisata.size()) {
            daftarWisata.remove(index);
            System.out.println("Data berhasil dihapus!");
        } else {
            System.out.println("Index tidak valid.");
        }
    }
}
