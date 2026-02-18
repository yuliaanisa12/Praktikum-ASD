package Jobsheet01;
import java.util.Scanner;

public class JadwalKuliah{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal kuliah (n): ");
        int n = input.nextInt();
        input.nextLine(); 

        String[][] jadwal = new String[n][4];

        inputData(jadwal, input);

       
        System.out.println("\n--- Seluruh Jadwal Kuliah ---");
        tampilkanSemua(jadwal);

        System.out.print("\nMasukkan hari yang ingin dicari: ");
        String cariHari = input.nextLine();
        tampilkanPerHari(jadwal, cariHari);

        System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
        String cariNama = input.nextLine();
        tampilkanPerNama(jadwal, cariNama);
        
        input.close();
    }

 
    public static void inputData(String[][] jadwal, Scanner input) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("\nInput Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = input.nextLine();
            System.out.print("Hari             : ");
            jadwal[i][2] = input.nextLine();
            System.out.print("Jam              : ");
            jadwal[i][3] = input.nextLine();
        }
    }

   
    public static void tampilkanSemua(String[][] jadwal) {
        System.out.println("------------------------------------------------------------");
        System.out.printf("| %-20s | %-10s | %-10s | %-10s |\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("| %-20s | %-10s | %-10s | %-10s |\n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
        System.out.println("------------------------------------------------------------");
    }

   
    public static void tampilkanPerHari(String[][] jadwal, String hari) {
        System.out.println("\nJadwal pada hari " + hari + ":");
        boolean ditemukan = false;
        for (int i = 0; i < jadwal.length; i++) {
           
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println("- " + jadwal[i][0] + " (" + jadwal[i][3] + ") di " + jadwal[i][1]);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Tidak ada jadwal.");
    }

    
    public static void tampilkanPerNama(String[][] jadwal, String nama) {
        System.out.println("\nInformasi Mata Kuliah " + nama + ":");
        boolean ditemukan = false;
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(nama)) {
                System.out.println("Hari: " + jadwal[i][2] + ", Jam: " + jadwal[i][3] + ", Ruang: " + jadwal[i][1]);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Mata kuliah tidak ditemukan.");
    }
}
