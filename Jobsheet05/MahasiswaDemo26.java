package Jobsheet05;

import java.util.Scanner;

public class MahasiswaDemo26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = Integer.parseInt(sc.nextLine());

        MahasiswaBerprestasi26 list = new MahasiswaBerprestasi26(n);

        for (int i = 0; i < n; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());

            Mahasiswa26 m = new Mahasiswa26(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.selectionSort();

        System.out.println("\nPencarian Data");
        System.out.print("Masukkan IPK yang dicari: ");
        double cari = Double.parseDouble(sc.nextLine());

        System.out.println("\nMenggunakan Binary Search");

        int posisi = list.findBinarySearch(cari, 0, n - 1);

        list.tampilPosisi(cari, posisi);
        list.tampilData(cari, posisi);

        sc.close();
    }
}
