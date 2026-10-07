/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmanajemenprodukdanpegawai;

/**
 *
 * @author emyri
 */
public class Elektronik extends Produk {
    private int garansi; //dalam tahun
    
    public Elektronik(String namaProduk, double harga, int garansi) {
        super(namaProduk, harga); //Memanggil konstruktor kelas induk (produk)
        this.garansi = garansi;
    }
    
    public int getGaransi() {
        return garansi;
    }
    
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
    
    //Override metode tampilkanInfo
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo(); //menampilkan namaProduk dan harga dari induk
        System.out.println("Garansi: "+ garansi + "tahun");
    }
}
