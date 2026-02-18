package Jobsheet01;
import java.util.Scanner;

public class PlatKota {
    public static void main(String[] args) {

        char[] kodePlat = {
            'A','B','D','E','F','G','H','L','N','T'
        };

        char[][] kota = {
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char kode = input.next().toUpperCase().charAt(0);

        boolean ditemukan = false;

        for (int i = 0; i < kodePlat.length; i++) {
            if (kode == kodePlat[i]) {
                System.out.print("Nama Kota: ");
                for (int j = 0; j < kota[i].length; j++) {
                    System.out.print(kota[i][j]);
                }
                System.out.println();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan");
        }
        input.close();
    }
}

