package Jobsheet01; 
import java.util.Scanner;

public class NilaiAkhirMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Program Menghitung Nilai Akhir Mahasiswa");
        System.out.println("========================================");

        System.out.print("Masukkan nilai Tugas: ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = input.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = input.nextDouble();

        System.out.print("Masukkan Nilai UAS:");
        double uas = input.nextDouble();

        System.out.println("========================================");

        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100 ) {

            System.out.println("nilai tidak valid.");
            System.out.println("==================");
        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
        
        String nilaiHuruf;
        String keterangan;

        if (nilaiAkhir >= 85) {
            nilaiHuruf = "A";
            keterangan = "LULUS";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
            keterangan = "LULUS";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
            keterangan = "LULUS";
        } else if (nilaiAkhir >= 55) {
            nilaiHuruf = "C+";
            keterangan = "LULUS";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
            keterangan = "LULUS";
        } else if (nilaiAkhir >= 40) {
            nilaiHuruf = "D";
            keterangan = "TIDAK LULUS";
        } else {
            nilaiHuruf = "E";
            keterangan = "TIDAK LULUS";
        }

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + keterangan);
    }
    input.close();
}
}

