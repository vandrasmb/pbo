/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

class Pesawat extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Pesawat terbang");
    }
}

public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();

        mobil.berjalan();
        mobil.info();

        sepeda.berjalan();
        sepeda.info();

        System.out.println("\nObjek lain");
        Kendaraan pesawat = new Pesawat();
        pesawat.berjalan();
        pesawat.info();
    }
}