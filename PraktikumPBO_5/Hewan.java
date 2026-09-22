package praktikum5;

// Kelas Induk
class Hewan {
    String nama;
    String jenis;
    
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}

// Kelas Turunan Kucing
class Kucing extends Hewan {
    
    public void suaraKhas() {
        System.out.println("Suara Khas: Meow meow!");
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suaraKhas();
    }
}

// Kelas Turunan Anjing
class Anjing extends Hewan {
    
    public void suaraKhas() {
        System.out.println("Suara Khas: Guk guk!");
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suaraKhas();
    }
}