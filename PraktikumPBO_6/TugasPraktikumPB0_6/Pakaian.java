/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugaspraktikumPBO_6;

/**
 *
 * @author emyri
 */
public class Pakaian extends Produk {
    
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }
    
    @Override
    public double hitungDiskon(){
        return harga * 0.20; // Diskon pakaian sebesar 20%
    }
}
