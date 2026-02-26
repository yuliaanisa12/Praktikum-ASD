package Jobsheet03;

import java.util.Scanner;

public class MataKuliahDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Masukkan Data  Mata Kuliah: ");
        int jumlah = sc.nextInt();

        MataKuliah26[] arrayMataKuliah05 = new MataKuliah26[jumlah];
        
        for (int i = 0; i < arrayMataKuliah05.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));

            arrayMataKuliah05[i] = new MataKuliah26("", "", 0, 0);
            arrayMataKuliah05[i].tambahData();
            System.out.println("--------------------------");
        }

        System.out.println("\nDATA MATA KULIAH");
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayMataKuliah05[i].cetakInfo();
            System.out.println("--------------------------");
        }
        sc.close();
    }
}

       
