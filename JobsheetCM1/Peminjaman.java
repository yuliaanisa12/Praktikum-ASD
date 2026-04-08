package JobsheetCM1;

public class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int denda;

    public Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        this.denda = 0;
    }
    void hitungDenda() {
        int batas = 5;
        int dendaPerHari = 2000;

        if(lamaPinjam > batas) {
            denda = (lamaPinjam - batas) * dendaPerHari;
        } else {
            denda = 0 ;
        }
    }
    void tampil() {
        System.out.println(mhs.nim + "|" + mhs.nama + "|"+ buku.judul + "|" + lamaPinjam + " hari |Denda: " + denda);
    }
}

