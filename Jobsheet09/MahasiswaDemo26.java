import java.util.Scanner;

public class MahasiswaDemo26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa26 stack = new StackTugasMahasiswa26(5);

        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Jumlah Tugas");
            System.out.print("Pilih:");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa26 mhs = new Mahasiswa26(nim, nama,kelas, -1);
                    stack.push(mhs);
                    System.out.printf("Nilai Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa26 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah  %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa26 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.printf("Tugas terakhir dikumpulkan oleh %s\n", lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("nama\tNIM\tkelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa26 bawah = stack.lihatBawah();
                    if (bawah != null) {
                        System.out.printf("Tugas pertama yang dikumpulkan oleh %s\n", bawah.nama);
                    }
                    break;
                case 6:
                    System.out.println("jumlah tugas saat ini: " + stack.hitungTugas());
                    break;
                default:
                    System.out.println("pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <=6);
        scan.close();
    }
}
