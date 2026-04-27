public class Surat26 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    Character jenisIzin;
    int durasi;

    Surat26() {
    }

    Surat26(String idSurat, String namaMahasiswa, String kelas, Character jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    void tampil() {
        System.out.println("ID Surat        : " + idSurat);
        System.out.println("Nama Mahasiswa  : " + namaMahasiswa);
        System.out.println("Kelas           : " + kelas);
        System.out.println("Jenis Izin      : " + jenisIzin);
        System.out.println("Durasi Izin     : " + durasi + " hari");
    }
}
