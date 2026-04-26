package JobsheetCM1;

import java.util.Scanner;

public class ClassMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mhs = {
                new Mahasiswa("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku[] buku = {
                new Buku("B001", "Algoritma", 2020),
                new Buku("B002", "Basis Data", 2019),
                new Buku("B003", "Pemrograman", 2021),
                new Buku("B004", "Fisika", 2024)
        };

        Peminjaman[] pinjam = {
                new Peminjaman(mhs[0], buku[0], 7),
                new Peminjaman(mhs[1], buku[1], 3),
                new Peminjaman(mhs[2], buku[2], 10),
                new Peminjaman(mhs[2], buku[3], 6),
                new Peminjaman(mhs[0], buku[1], 4)
        };

        int pilih;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan berdasarkan Denda + Hitung");
            System.out.println("5. Cari berdasarkan NIM");
            System.out.println("0. Keluar\n");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    System.out.println("\nDATA MAHASISWA");
                    System.out.println("-----------------------------------------------------------------------");
                    System.out.printf("| %-5s | %-10s | %-25s | %-13s |\n",
                            "NIM", "Nama", "Prodi", "no_hp");
                    System.out.println("-----------------------------------------------------------------------");

                    for (Mahasiswa m : mhs) {
                        m.tampil();
                    }
                    break;

                case 2:
                    System.out.println("\nDATA BUKU");
                    System.out.println("-------------------------------------------------------------");
                    System.out.printf("| %-5s | %-15s | %-5s | %-15s |\n",
                            "Kode", "Judul", "Tahun", "Penerbit");
                    System.out.println("-------------------------------------------------------------");

                    for (Buku b : buku) {
                        b.tampil();
                    }
                    break;

                case 3:
                    System.out.println("\nDATA PEMINJAMAN");
                    System.out.println("---------------------------------------------------------------------");
                    System.out.printf("| %-5s | %-10s | %-15s | %-5s | %-10s |\n",
                            "NIM", "Nama", "Judul Buku", "Hari", "Denda");
                    System.out.println("---------------------------------------------------------------------");

                    for (Peminjaman p : pinjam) {
                        p.tampil();
                    }
                    break;

                case 4:
                    // SORTING (descending berdasarkan denda) - Insertion Sort
                    for (int i = 1; i < pinjam.length; i++) {
                        Peminjaman temp = pinjam[i];
                        int j = i - 1;

                        while (j >= 0 && pinjam[j].denda < temp.denda) {
                            pinjam[j + 1] = pinjam[j];
                            j--;
                        }
                        pinjam[j + 1] = temp;
                    }

                    // Tampilkan hasil sorting
                    System.out.println("\nData setelah diurutkan (denda terbesar ke kecil):");
                    for (int i = 0; i < pinjam.length; i++) {
                        pinjam[i].tampil();
                    }

                    // HITUNG MAHASISWA UNIK YANG KENA DENDA
                    String[] nimSudah = new String[pinjam.length];
                    int jumlah = 0;

                    for (int i = 0; i < pinjam.length; i++) {
                        if (pinjam[i].denda > 0) {
                            boolean sudah = false;

                            for (int k = 0; k < jumlah; k++) {
                                if (nimSudah[k] != null && nimSudah[k].equals(pinjam[i].mhs.nim)) {
                                    sudah = true;
                                    break;
                                }
                            }

                            if (!sudah) {
                                nimSudah[jumlah] = pinjam[i].mhs.nim;
                                jumlah++;
                            }
                        }
                    }

                    System.out.println("\nJumlah mahasiswa yang memiliki denda: " + jumlah);
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.next();

                    for (Peminjaman p : pinjam) {
                        if (p.mhs.nim.equals(cari)) {
                            p.tampil();
                        }
                    }
                    break;
            }

        } while (pilih != 0);

        sc.close();
    }
}
