package Jobsheet05;

import java.util.Scanner;

public class faktorial {

    static int faktorialBF(int n) {
        int hasil = 1;
        int i = 1;

        while (i <= n) {
            hasil = hasil * i;
            i++;
        }

        return hasil;
    }
    static int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * faktorialDC(n - 1);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        System.out.println("Nilai faktorial BF: " + faktorialBF(nilai));
        System.out.println("Nilai faktorial DC: " + faktorialDC(nilai));

        input.close();
    }
}

