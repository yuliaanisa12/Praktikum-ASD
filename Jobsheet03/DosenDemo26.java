package Jobsheet03;

import java.util.Scanner;

public class DosenDemo26 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen26[] arrayDosen = new Dosen26[jumlah];

        for (int i = 0; i < arrayDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jK = sc.nextLine();
            boolean jenisKelamin;
            if (jK.equalsIgnoreCase("Pria")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------");

            arrayDosen[i] = new Dosen26(kode, nama, jenisKelamin, usia);
        }
        
        int i = 1;
        for (Dosen26 dosen : arrayDosen) {
            System.out.println("Data Dosen ke-" + i++);
            dosen.cetakData();
            System.out.println("-----------------------");
        }

        DataDosen26 data = new DataDosen26();

        System.out.println("\n===== Data Seluruh Dosen =====");
        data.dataSemuaDosen(arrayDosen);
        System.out.println("\n===== Jumlah Dosen Setiap Jenis Kelamin =====");
        data.jumlahDosenSetiapJenisKelamin(arrayDosen);
        System.out.println("\n===== Rata-rata Usia Setiap Jenis kelamin =====");
        data.rataRataUsiaDosen(arrayDosen);
        System.out.println("\n===== Dosen Paling Tua =====");
        data.dosenPalingTua(arrayDosen);
        System.out.println("\n===== Dosen Paling Muda =====");
        data.dosenPalingMuda(arrayDosen);
    }
}
    

  