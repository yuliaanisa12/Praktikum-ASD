package Jobsheet02;

public class Dosen26Main {
    public static void main(String[] args) {
        Dosen26 dsn1 = new Dosen26();
        dsn1.idDosen = "D001";
        dsn1.nama = "Vit Zuraida ";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian ="Pemrograman";
        dsn1.tampilInformasi();

        System.out.println();

        Dosen26 dsn2 = new Dosen26("D002","Erfan Rohadi",true, 2018, "Basis Data");
        
        dsn2.tampilInformasi();
        System.out.println();

        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("Pemrograman Java");

        System.out.println("setelah perubahan data dosen 1:");
        dsn1.tampilInformasi();
        System.out.println();

        System.out.println("Masa Kerja Dosen 1: " + dsn1.hitungMasaKerja(2026) + " tahun");
        System.out.println("Masa Kerja Dosen2: "+ dsn2.hitungMasaKerja(2026));
        
    }

}
