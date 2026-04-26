import java.util.Scanner;

public class AksesorisDemo26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aksesoris26[] daftar = new Aksesoris26[5];

        for (int i = 0; i < daftar.length; i++) {

            System.out.println("Data Aksesoris ke-" + (i + 1));

            System.out.print("Nama       : ");
            String nama = sc.nextLine();

            System.out.print("Kategori   : ");
            int kategori = sc.nextInt();

            System.out.print("Harga      : ");
            int harga = sc.nextInt();

            System.out.print("Terjual    : ");
            int terjual = sc.nextInt();

            System.out.print("Stock      : ");
            int stock = sc.nextInt();
            sc.nextLine(); // pembersih enter

            daftar[i] = new Aksesoris26(nama, kategori, harga, terjual, stock);

            System.out.println();
        }

        System.out.println("===== DATA SELURUH AKSESORIS =====");

        for (int i = 0; i < daftar.length; i++) {
            daftar[i].tampil();
            daftar[i].cekStok();
        }

        sc.close();
    }
}
