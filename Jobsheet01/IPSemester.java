package Jobsheet01;
import java.util.Scanner;

public class IPSemester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] namaMK = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 2, 2, 3, 2, 3, 2, 2};

        double totalBobot = 0;
        int totalSKS = 0;

        double[] nilaiAngkaArr = new double[namaMK.length];
        String[] nilaiHurufArr = new String[namaMK.length];
        double[] bobotNilaiArr = new double[namaMK.length];

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("-----------------------------------------------------------------------------------");

        // INPUT NILAI
        for (int i = 0; i < namaMK.length; i++) {

            System.out.print("Masukkan nilai angka untuk MK =" + namaMK[i] + ": ");
            nilaiAngkaArr[i] = input.nextDouble();

            double nilaiSetara;

            if (nilaiAngkaArr[i] >= 80) {
                nilaiHurufArr[i] = "A";
                nilaiSetara = 4;
            } else if (nilaiAngkaArr[i] >= 73) {
                nilaiHurufArr[i] = "B+";
                nilaiSetara = 3.5;
            } else if (nilaiAngkaArr[i] >= 65) {
                nilaiHurufArr[i] = "B";
                nilaiSetara = 3;
            } else if (nilaiAngkaArr[i] >= 60) {
                nilaiHurufArr[i] = "C+";
                nilaiSetara = 2.5;
            } else if (nilaiAngkaArr[i] >= 50) {
                nilaiHurufArr[i] = "C";
                nilaiSetara = 2;
            } else if (nilaiAngkaArr[i] >= 39) {
                nilaiHurufArr[i] = "D";
                nilaiSetara = 1;
            } else {
                nilaiHurufArr[i] = "E";
                nilaiSetara = 0;
            }

            bobotNilaiArr[i] = nilaiSetara * sks[i];

            totalBobot += bobotNilaiArr[i];
            totalSKS += sks[i];
        }

        // CETAK TABEL (di luar loop input)
        System.out.println("\n-----------------------------------------------------------------------------------");
        System.out.printf("%-40s %-15s %-15s %-10s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("-----------------------------------------------------------------------------------");

        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("%-40s %-15.2f %-15s %-10.2f\n",
                    namaMK[i],
                    nilaiAngkaArr[i],
                    nilaiHurufArr[i],
                    bobotNilaiArr[i]);
        }

        double ip = totalBobot / totalSKS;

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("IP = %.2f\n", ip);
    
        input.close();
    }
}



