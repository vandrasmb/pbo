/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmanajemenprodukdanpegawai;


public class Produk {
    //Enkapsulasi: Atribut private
    private String namaProduk;
    private double harga;
    
    //konstruktor
    public Produk(String namaProduk, double harga) {
        this.namaProduk =namaProduk;
        this.harga = harga;
             
    }   
    
    //getter dan setter
    public String getNamaProduk() {
        return namaProduk;
    }
    
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void setHarga() {
        this.harga = harga;
    }
    
    //metode untuk menampilkan info 
    public void tampilkanInfo() {
        System.out.println("Nama produk:" + namaProduk);
        System.out.println("Harga: "+ (long)harga);
    }
   
}
