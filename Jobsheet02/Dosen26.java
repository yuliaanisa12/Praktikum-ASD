package Jobsheet02;

class Dosen26 {
    String idDosen;
    String nama;
    Boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen26() {
    }

    public Dosen26(String idDosen, String nama, Boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen :"+ idDosen);
        System.out.println("Nama :"+ nama);
        System.out.println("Status Aktif :"+ (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung :"+ tahunBergabung);
        System.out.println("Bidang Keahlian :"+ bidangKeahlian);
    }

    void setStatusAktif(Boolean statusAktif) {
        this.statusAktif = statusAktif;
    }

    int hitungMasaKerja(int tahunSekarang){
        return tahunSekarang - tahunBergabung;

    }
    void ubahKeahlian(String keahlianBaru){
        bidangKeahlian = keahlianBaru;
    }
}
    




    

    

