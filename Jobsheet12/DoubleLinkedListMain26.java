package Jobsheet12;
import java.util.Scanner;

public class DoubleLinkedListMain26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList26 list = new DoubleLinkedList26();
        int pilihan;

        do {
            System.out.println("\n==== MENU DOUBLE LINKED LIST ====");
            System.out.println("1. Tambah Data di Awal");
            System.out.println("2. Tambah Data di Akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data (reverse)");
            System.out.println("8. Tambah data pada index tertentu");
            System.out.println("9. Hapus data setelah NIM tertentu");
            System.out.println("10. Hapus data berdasarkan index");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data berdasarkan index");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {

                case 1:
                    Mahasiswa26 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    break;

                case 2:
                    Mahasiswa26 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;

                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = scan.nextLine();

                    System.out.println("Masukkan data baru");
                    Mahasiswa26 dataBaru = inputMahasiswa(scan);

                    list.insertAfter(keyNim, dataBaru);
                    break;

                case 4:
                    list.removeFirst();
                    break;

                case 5:
                    list.removeLast();
                    break;

                case 6:
                    list.print();
                    break;

                case 7:
                    list.printReverse();
                    break;

                case 8:

                    System.out.print("Masukkan index : ");
                    int indexTambah = scan.nextInt();
                    scan.nextLine();

                    Mahasiswa26 dataTambah = inputMahasiswa(scan);

                    list.add(indexTambah, dataTambah);
                    break;

                case 9:

                    System.out.print("Masukkan NIM key : ");
                    String keyRemove = scan.nextLine();

                    list.removeAfter(keyRemove);
                    break;

                case 10:

                    System.out.print("Masukkan index yang dihapus : ");
                    int indexHapus = scan.nextInt();
                    scan.nextLine();

                    list.remove(indexHapus);
                    break;

                case 11:
                    list.getFirst();
                    break;

                case 12:
                    list.getLast();
                    break;

                case 13:

                    System.out.print("Masukkan index : ");
                    int indexCari = scan.nextInt();
                    scan.nextLine();

                    list.getIndex(indexCari);
                    break;

                case 14:

                    System.out.println("Jumlah data : " + list.getSize());
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (pilihan != 0);

        scan.close();
    }

    public static Mahasiswa26 inputMahasiswa(Scanner scan) {

        System.out.print("NIM   : ");
        String nim = scan.nextLine();

        System.out.print("Nama  : ");
        String nama = scan.nextLine();

        System.out.print("Kelas : ");
        String kelas = scan.nextLine();

        System.out.print("IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine();

        return new Mahasiswa26(nim, nama, kelas, ipk);
    }
}