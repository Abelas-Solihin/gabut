class Dosen10 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;
    
    public Dosen10(){

    }

    public Dosen10(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }
    
    public void tampil() {
        System.out.println("Kode : " + kode);  
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia : " + usia);
        System.out.println("");
    }
}
