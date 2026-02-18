package Jobsheet02;

 class MataKuliah26 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahjam;

    public MataKuliah26(){
    }
    public MataKuliah26 (String kodeMK, String nama, int sks, int jumlahjam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahjam = jumlahjam;

    }

    void tampilnformasi(){
        System.out.println("kode MK:"+ kodeMK);
        System.out.println("nama MK:"+ nama);
        System.out.println("sks:"+ sks);
        System.out.println("jumlah jam:"+ jumlahjam);
    }

    void ubahSKS(int sksBaru){
        if (sksBaru > 0){
            sks = sksBaru;
            System.out.println("SKS berhasil diubah menjadi: " + sksBaru);
        } else {
            System.out.println("SKS tidak valid. harus lebih besar dari 0");
        }
    }

    void tambahJam(int jamTambahan){
        if (jamTambahan > 0) {
            jumlahjam +=jamTambahan;
            System.out.println("Jumlah jam berhasil ditambah. Total jam: "+ jumlahjam);
        } else {
            System.out.println("jumlah jam tidak valid. harus lebih dari 0");
        }
    }
    
    void kurangjam(int jamPengurangan) {
        if (jamPengurangan > 0 && jamPengurangan <= jumlahjam){
            jumlahjam -= jamPengurangan;
            System.out.println("jumlah jam berhasil dikurangi. total jam:"+ jumlahjam);
        } else {
            System.out.println("jumlah jam tidak valid.");
        }
    }
 }
    
    



