    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugaspraktikumPBO_6;

/**
 *
 * @author emyri
 */
public abstract class Produk {
    protected String nama;
    protected double harga;
    
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    //Metode abstrak tanpa bodi atau isi wajib override oleh kelas turunan
    public abstract double hitungDiskon();
    
    //Metode biasa untuk mengambil harga setelah diskon
    public double getHargaSetelahDiskon() {
        return harga - hitungDiskon();
        
    }
    public String getNama(){
        return nama;
    }
    
    public double getharga(){
        return harga;
    }
}
