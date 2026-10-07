/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmanajemenprodukdanpegawai;

/**
 *
 * @author emyri
 */
public class Makanan extends Produk {
    private String tanggalKadaluarsa;
    
    public Makanan(String namaProduk, double harga, String tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    public String getTanggalKadaluarsa(){
        return tanggalKadaluarsa;
    }
    
    public void setTanggalKadaluarsa(){
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    //@Override metode tampilkaninfo
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa:" + tanggalKadaluarsa);
    }
    
}
