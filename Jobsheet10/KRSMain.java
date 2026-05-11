import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilih;

        do {
            System.out.println("\n=== MENU KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS (2 orang)");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Diproses");
            System.out.println("8. Sisa Belum KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); 
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); 
                    String nim = sc.nextLine();
                    System.out.print("Nama: "); 
                    String nama = sc.nextLine();
                    System.out.print("Prodi: "); 
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: "); 
                    String kelas = sc.nextLine();
                    antrian.enqueue(new Mahasiswa(nim, nama, prodi, kelas)); // ✔️ diperbaiki
                    break;

                case 2:
                    antrian.dequeue2Mahasiswa();
                    break;

                case 3:
                    antrian.tampilkanSemua(); 
                    break;

                case 4:
                    antrian.tampilkan2Terdepan(); 
                    break;

                case 5:
                    antrian.tampilkanAkhir();
                    break;

                case 6:
                    antrian.jumlahAntrian(); 
                    break;

                case 7:
                    antrian.jumlahSudahDiProses(); 
                    break;

                case 8:
                    antrian.jumlahSisaKuota();
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilih != 0);

        sc.close();
    }
}