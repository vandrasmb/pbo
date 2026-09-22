package praktikum5;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("======== SOAL 1 & 2: PERWARISAN HEWAN ========\n");
        
        Kucing kucing = new Kucing();
        kucing.nama = "Kitty";
        kucing.jenis = "Kucing Persia";
        System.out.println("--- INFO KUCING ---");
        kucing.tampilkanInfo();
        
        System.out.println();
        
        Anjing anjing = new Anjing();
        anjing.nama = "Buddy";
        anjing.jenis = "Anjing Golden Retriever";
        System.out.println("--- INFO ANJING ---");
        anjing.tampilkanInfo();
        
        System.out.println("\n\n======== SOAL 3: HIERARKI KENDARAAN ========\n");
        
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota Avanza";
        mobil.kecepatan = 180;
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 5;
        System.out.println("--- INFO MOBIL ---");
        mobil.tampilkanInfo();
        
        System.out.println();
        
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha YZF-R15";
        motor.kecepatan = 160;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "4-tak";
        System.out.println("--- INFO SEPEDA MOTOR ---");
        motor.tampilkanInfo();
    }
}