/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugaspraktikumPBO_6;

/**
 *
 * @author emyri
 */
public class Buku extends Produk {
    
    public Buku(String nama, double harga) {
        super(nama, harga); //mengirimkan nama dan harga ke kelas induk
    }
    
    //setelah itu kita meng-override(mengisi) metode htiungdiskon khusus untuk buku
    @Override
    public double hitungDiskon() {
        return harga * 0.10; //diskon buku sebesar 10 %
    }
    
    
}
