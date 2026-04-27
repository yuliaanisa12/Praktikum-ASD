class Mahasiswa26 {
    String nim, nama, kelas;
    int nilai;

    Mahasiswa26(String nim, String nama, String kelas, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1;
    }
    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
