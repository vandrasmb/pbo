/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmanajemenprodukdanpegawai;

/**
 *
 * @author emyri
 */
public class Main {
    public static void main(String[] args) {
        // --- 1. Output Produk ---
        System.out.println("1. Output Produk");
        Elektronik laptop = new Elektronik("Laptop", 15000000, 2);
        laptop.tampilkanInfo();
        System.out.println();

        // --- 2. Output Pegawai ---
        System.out.println("2. Output Pegawai");
        PegawaiTetap angger = new PegawaiTetap("angger", 5000000, 1000000);
        angger.tampilkanInfo();
        System.out.println();

        // --- 3.   Bagian Polimorfime--
        System.out.println("3.Polimorfisme");
        
        // Referensi kelas induk (Produk) memegang objek dari kelas turunan (Makanan)
        Produk produkPolimorfisme = new Makanan("Snack", 15000, "2023-12-30");
        produkPolimorfisme.tampilkanInfo();
        
        //4.
        
        System.out.println("4.Polimorfisme");
        // Referensi kelas induk (Pegawai) memegang objek dari kelas turunan (PegawaiKontrak)
        Pegawai pegawaiPolimorfisme = new PegawaiKontrak("Dimas", 3000000, 12);
        pegawaiPolimorfisme.tampilkanInfo();
    }
    
}
