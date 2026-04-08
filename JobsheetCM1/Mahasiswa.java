package JobsheetCM1;

public class Mahasiswa {
    String nim;
    String nama;
    String Prodi;

    public Mahasiswa(String nim,String nama,String Prodi) {
        this.nim = nim;
        this.nama = nama;
        this.Prodi = Prodi;
    }
    void tampil(){
        System.out.println("nim |);
        System.out.println("nama: " + nama);
        System.out.println("Program Studi: " + Prodi);
    }
}
