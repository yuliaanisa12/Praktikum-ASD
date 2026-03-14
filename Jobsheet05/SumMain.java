package Jobsheet05;

import java.util.Scanner;

public class SumMain {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Sum sm = new Sum(elemen);

        for(int i=0; i<elemen; i++){
            System.out.print("Masukkan keuntungan ke-" + (i+1) + ":");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("total keuntungan dengan brute farce: " + sm.totalBF());
        System.out.println("total keuntungan menggunakan divide dan conquer: " + sm.totalDC(sm.keuntungan,0, elemen-1));

        input.close();
    }
}
