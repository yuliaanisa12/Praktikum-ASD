package Jobsheet03;

public class MataKuliah26 {
    public String kode;
    public String nama;
    public int sks;
    public int JumlahJam;

    public MataKuliah26(String kode, String nama, int sks, int JumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.JumlahJam = JumlahJam;      
    }
    void tambahData(){
        System.out.println("kode    : " + kode);
        System.out.println("nama    : " + nama);
        System.out.println("sks     : " + sks);
        System.out.println("jumlah jam: " + JumlahJam);
    }
    void cetakInfo() {
        System.out.println("kode    : " + kode  );
        System.out.println("nama    : " + nama  );
        System.out.println("sks     : " + sks);
        System.out.println("jumlah jam: " + JumlahJam);
        System.out.println("________________________________________________");
    }
}
