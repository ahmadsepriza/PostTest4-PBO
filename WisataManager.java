/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest4.wisata;

import com.mycompany.posttest4.services.WisataServices;
import com.mycompany.posttest4.model.TempatWisata;

public class WisataManager {
    public void jalankan() {
        WisataServices ws = new WisataServices();
        ws.tampilkanWisata();
        ws.tambahWisata(new TempatWisata("Pantai Melawai", "Balikpapan", "Bahari"));
        System.out.println("\nSetelah penambahan:");
        ws.tampilkanWisata();
    }
}
