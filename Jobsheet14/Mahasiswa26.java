public class Mahasiswa26 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa26() {
        // Konstruktor default
    }

    public Mahasiswa26(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public Void tampilInformasi() {
        System.out.println("NIM: "+this.nim+" "+
        "Nama: "+this.nama+" "+
        "Kelas: "+this.kelas+" "+
        "IPK: "+this.ipk);
        return null;
    }
}
