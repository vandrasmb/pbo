/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmanajemenprodukdanpegawai;

/**
 *
 * @author emyri
 */
public class Pegawai {
    //Enkapsulasi : Atribut private
    private String namaPegawai;
    private double gaji;
    
    //konstruktor
    public Pegawai(String namaPegawai, double gaji){
        this.namaPegawai =namaPegawai;
        this.gaji = gaji;
    }
    
    //Getter dan Setter
    public String getNamaPegawai(){
        return namaPegawai;
    }
    
    public void setNamaPegawai(String namaPegawai){
        this.namaPegawai = namaPegawai;
    }
    
    public double getGaji(){
        return gaji;
    }
    
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    //Metode untuk menampilkan info 
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai:" + namaPegawai);
        System.out.println("Gaji:" + (long)gaji);
        
       
    }
   
    
}
