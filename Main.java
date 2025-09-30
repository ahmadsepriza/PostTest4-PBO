/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;
import service.WisataService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WisataService service = new WisataService();

        int pilihan;
        do {
            System.out.println("\n=== MENU WISATA KALIMANTAN TIMUR ===");
            System.out.println("1. Tambah Wisata");
            System.out.println("2. Tampil Wisata");
            System.out.println("3. Update Wisata");
            System.out.println("4. Hapus Wisata");
            System.out.println("5. Cari Wisata");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> service.tambahWisata();
                case 2 -> service.tampilWisata();
                case 3 -> service.updateWisata();
                case 4 -> service.hapusWisata();
                case 5 -> service.cariWisata();
                case 6 -> System.out.println("Keluar...");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);
    }
}

