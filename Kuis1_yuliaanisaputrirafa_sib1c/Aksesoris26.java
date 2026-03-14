public class Aksesoris26 {

    String nama;
    int kategori;
    int harga;
    int terjual;
    int stock;

    public Aksesoris26() {
    }

    public Aksesoris26(String nama, int kategori, int harga, int terjual, int stock) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.terjual = terjual;
        this.stock = stock;
    }

    void tampil() {
        System.out.println("Nama       : " + nama);
        System.out.println("Kategori   : " + kategori);
        System.out.println("Harga      : Rp" + harga);
        System.out.println("Terjual    : " + terjual);
        System.out.println("Stock      : " + stock);
        System.out.println("Total Jual : Rp" + (harga * terjual));
        System.out.println("---------------------------");
    }

    void cekStok() {
        if (stock == 0) {
            System.out.println(nama + " stok habis!");
        } else {
            System.out.println(nama + " stok tersedia : " + stock);
        }
    }
}