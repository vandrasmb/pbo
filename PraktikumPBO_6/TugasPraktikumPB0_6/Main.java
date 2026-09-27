/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugaspraktikumPBO_6;

/**
 *
 * @author emyri
 */
public class Main {
    public static void main (String[] args ) {
        //Pertama membuat objek keranjangBelanja
        KeranjangBelanja keranjang = new KeranjangBelanja();
        
        //Kedua menambahkan produk ke dalam keranjang
        //polimorfisme dimana objek buku, elektronik, dan pakaian yang diperlakukan sebagai produk
        keranjang.tambahProduk(new Buku("Buku pemrograman Java", 100000));
        keranjang.tambahProduk(new Elektronik ("Mouse Wireless", 200000));
        keranjang.tambahProduk(new Pakaian ("Kemeja Polos", 150000));
        
        //Ketiga menampilkan isi darai keranjang dan total bayar
        keranjang.tampilkanKeranjang();
     
    }
    
}
