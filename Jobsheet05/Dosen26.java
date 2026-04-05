package Jobsheet05;

public class Dosen26 {
    String kode;
    String nama;
    boolean jenisKelamin; // true = Laki-laki, false = Perempuan
    int usia;

    // Konstruktor
    Dosen26(String kd, String nm, boolean jk, int us) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = us;
    }

    // Method tampil
    void tampil() {
        System.out.println("Kode           : " + kode);
        System.out.println("Nama           : " + nama);
        System.out.println("Jenis Kelamin  : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia           : " + usia);
    }
}