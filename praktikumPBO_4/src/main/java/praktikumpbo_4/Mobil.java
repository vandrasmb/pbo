/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo_4;

/**
 *
 * @author emyri
 */
public class Mobil extends Kendaraan {

    private int jumlahPintu;

    // Constructor
    public Mobil(String merek, String model, int tahun, int jumlahPintu) {
        super(merek, model, tahun);
        this.jumlahPintu = jumlahPintu;
    }

    // Menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        System.out.println("Merek: " + getMerek());
        System.out.println("Model: " + getModel());
        System.out.println("Tahun: " + getTahun());
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }
}