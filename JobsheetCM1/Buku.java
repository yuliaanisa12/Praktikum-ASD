package JobsheetCM1;

public class Buku {
    String kodeBuku;
    String judul;
    int  tahunTerbit;

    public Buku(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;    
    }
    void tampil() {
        System.out.println(kodeBuku +"|" + judul + "|" + tahunTerbit);
       
    }


    
}
