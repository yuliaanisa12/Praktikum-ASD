package JobsheetCM1;

public class Buku {
    String kodeBuku;
    String judul;
    String tahunTerbit;

    public Buku(String kodeBuku, String judul, String tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;    
    }
    void tampil() {
        System.out.println("kode buku | " + kodeBuku);
        System.out.println("judul | " + judul);
        System.out.println("tahun terbit | " + tahunTerbit);
        
    }


    
}
