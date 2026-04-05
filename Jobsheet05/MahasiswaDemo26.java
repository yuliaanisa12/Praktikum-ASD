package Jobsheet05;

import java.util.Scanner;

public class MahasiswaDemo26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        MahasiswaBerprestasi26 list = new MahasiswaBerprestasi26(jumlah);

        for (int i = 0; i < jumlah; i++) {
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

        System.out.println("\nData Awal: ");
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan Bubble sort (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan Selection sort (ASC): ");
        list.selectionSort();
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan Insertion sort (DESC):");
        list.insertionSortDESC();
        list.tampil();

        sc.close();
    }

}
