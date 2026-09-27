/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugaspraktikumPBO_6;

import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    //Menyimpan daftar produk (Buku, Elektronik, Pakaian menggunakan polimorfisme
    private List<Produk> listProduk;
    
    //konstruktor
    public KeranjangBelanja(){
        listProduk = new ArrayList<>();
    }
    
    //Metode untuk menambahkan produk ke keranjang
    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
    }
    
    //Metode untuk menghitung harga semua produk setelah diskon
    public double hitungTotalHarga() {
        double total = 0;
        for (Produk p: listProduk) {
            total += p.getHargaSetelahDiskon();//untuk memnggil metodedari kelas produk
        }
        return total;
    }
    
    //metode untuk menalpikan ringkasan rincian kerangjang belanja
    public void tampilkanKeranjang(){
        System.out.println ("Daftar Belanjaan");
        for (Produk p : listProduk) {
            System.out.println("Nama Produk  : " + p.getNama());
            System.out.println("Harga Awal   : Rp " + p.getharga());
            System.out.println("Diskon       : Rp " + p.hitungDiskon());
            System.out.println("Harga Akhir  : Rp " + p.getHargaSetelahDiskon());
            System.out.println("-----------------------------------");
    }
        System.out.println("TOTAL BAYAR : Rp" + hitungTotalHarga());
    }
}

