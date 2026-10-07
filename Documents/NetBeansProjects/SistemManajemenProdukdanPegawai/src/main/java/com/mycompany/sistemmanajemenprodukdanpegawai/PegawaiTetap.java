/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmanajemenprodukdanpegawai;

/**
 *
 * @author emyri
 */
public class PegawaiTetap extends Pegawai {
    private int tunjangan;
    
    public PegawaiTetap(String namaPegawai, int gaji, int tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    public int getTunjangan() {
        return tunjangan;
    }
    
    public void setTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }
    
    @Override//bagian dari polimorfisme 
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.print("Tunjangan: " + tunjangan);
    }
}
