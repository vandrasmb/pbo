/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author emyri
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Mimi",3);
        kucing.suara();
        kucing.info();
        
        Hewan anjing = new Hewan ("Rex", 2);
        anjing.berlari();
        
        //Kode Mobil (BARU)
        System.out.println("\n---Mobil---");
        Mobil mobil1 = new Mobil("toyota", "avanza", 2022, "Putih");
        mobil1.displayInfo();
        mobil1.startEngine();
        
        // Ubah warna mobil1
        System.out.println("\nMengubah warna mobil1 ke merah...");
        mobil1.setWarna("merah");
        mobil1.displayInfo();
        
        Mobil mobil2 = new Mobil ("Honda","Civic", 2023, "Hitam");
        mobil2.displayInfo();
        mobil2.startEngine();
    }
}
