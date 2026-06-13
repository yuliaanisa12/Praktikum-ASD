// import pembacaa unput dari keyboard
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // buat objk untuk input user

        DLLAntrian antrian = new DLLAntrian(); // buat objek antrian untuk mengelola antrian pembeli
        DLLPesanan pesanan = new DLLPesanan(); // buat objek pesanan untuk mengelola data pesanan   
        int pilihan;    // variabel untuk menyimpan pilihan menu user

        do {   // loop menu , pilih 0, tampilkan menu utama
            System.out.println("\n===============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("===============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();   // baca pilihan user
            System.out.println("----------------------");
            sc.nextLine();   // buang sisa newline setelah nextInt() agar input berikutnya bisa dibaca dengan benar

            switch (pilihan) { // percabangan berdasarkan pilihan user
                case 1:
                    System.out.print("Nama Pembeli: ");
                    String namaPembeli = sc.nextLine();
                    System.out.print("No HP       : ");
                    String noHp = sc.nextLine();             
                    antrian.tambahAntrian(namaPembeli, noHp); // tambahkan ke antrian
                    System.out.println("Antrian berhasil ditambahkan dengan nomor antrian: " + antrian.nomorAntrian);
                    break; // keluar dari switch 

                case 2: // cetak antrian
                    antrian.tampilAntrian(); // tampilkan selurug daftar antrian
                    break;

                case 3: // hapus antrian & tambah pesanan
                    if (antrian.isEmpty()) {  // cek antrian ksong 
                        System.out.println("Antrian kosong! tidak ada pembeli yang dapat dilayani.");
                        break; // btal kembali menu
                    }

                    System.out.print("Kode Pesanan : ");
                    int kodePesanan = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Pesanan : ");
                    String namaPesanan = sc.nextLine();
                    System.out.print("Harga        : ");
                    int harga = sc.nextInt();
                    System.out.print("jumlah:" ); // tambah3  
                    int jumlah = sc.nextInt(); 
                    int total = harga * jumlah;
                    System.out.println("Total harga: " + total);
                    sc.nextLine();
                    Pembeli selesai = antrian.hapusAntrian();  // ambil & hps pling depan antrian
                    pesanan.tambahPesanan(kodePesanan, namaPesanan, selesai.namaPembeli, harga); // simpan pesan ke DLLPesan
                    System.out.println(selesai.namaPembeli + " telah memesan " + namaPesanan + " dengan harga " + harga);
                    break;

                case 4: // laporan pesanan
                    pesanan.tampilPesanan(); // tampilkan semua pesanan A-Z+ total
                    break;

                case 0: // keluar 
                    System.out.println("Terima kasih!");
                    sc.close(); 
                    return; // keluar dri program

                default: // jika pilih selain 0-4
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0); // ulang loop selama plh bkn
    }
} 