// class menyimpan data pesanan 
public class Pesanan {
    int kodePesanan; // atribut 
    String namaPesanan;
    String namaPembeli;
    int harga;
    // konstruktor dipanggil saat objek pesanan
    public Pesanan(int kodePesanan, String namaPesanan, String namaPembeli, int harga) {
        this.kodePesanan = kodePesanan; // mengisi kodePesanan dengan nilai parameter
        this.namaPesanan = namaPesanan;
        this.namaPembeli = namaPembeli;
        this.harga = harga;
    }
}