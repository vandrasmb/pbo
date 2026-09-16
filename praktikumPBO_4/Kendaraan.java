/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo_4;

/**
 *
 * @author emyri
 */
public class Kendaraan {

    private String merek;
    private String model;
    private int tahun;

    // Constructor
    public Kendaraan(String merek, String model, int tahun) {
        this.merek = merek;
        this.model = model;
        this.tahun = tahun;
    }

    // Getter merek
    public String getMerek() {
        return merek;
    }

    // Getter model
    public String getModel() {
        return model;
    }

    // Setter model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter tahun
    public int getTahun() {
        return tahun;
    }

    // Setter tahun
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    // Menampilkan informasi
    public void tampilkanInfoKendaraan() {
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
    }
}