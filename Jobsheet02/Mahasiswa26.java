package Jobsheet02;

class Mahasiswa26 {
    String nim;
    String nama;
    String kelas;
    double ipk;

public Mahasiswa26(){
}

public Mahasiswa26(String nm, String nim, double ipk, String kls) {
   nama = nm;
   this.nim = nim;
   this.ipk = ipk;
   kelas = kls;

}

    void tampilInfomasi() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
    void UbahKelas(String KelasBaru) {
        kelas = KelasBaru;
    }
    void updateIPK(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antra 0.0 dan 4.0");
        }
    }
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.5) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        } 
    }
}

