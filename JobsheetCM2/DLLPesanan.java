// class double linked menyimpan semua data pesanan
public class DLLPesanan {
    NodePesanan head; // pointer  node pertama
    NodePesanan tail; // pointer node terakhir
    // konstruktor inisialisasi ksong
    public DLLPesanan() {
        head = null; 
        tail = null;
    }
    // method menambah pesanan beru ke bagian akhir
    public void tambahPesanan(int kodePesanan, String namaPesanan, String namaPembeli, int harga) {
        Pesanan p = new Pesanan(kodePesanan, namaPesanan, namaPembeli, harga);
        NodePesanan baru = new NodePesanan(p);
        if (head == null) {     // jika list msh ksong
            head = baru;        // node baru jdi head
            tail = baru;        // node baru jg jadi tail
        } else {                // jika list sudah ada isi
            baru.prev = tail;   // prev node baru menuju tail lma
            tail.next = baru;   // next tail lama menuju node baru
            tail = baru;        // node bru mnjdi tail bru
        }
    }

    // Bubble sort berdasarkan nama pesanan (ascending)A-Z
    public void sortByNama() {
        if (head == null || head.next == null) return;  // jika ksng /1node tdk sort
        NodePesanan i = head;                           // pointer luar mulai dari head
        while (i != null) {                             // loop semua node dri depan
            NodePesanan j = i.next;                     // pointer dlm mulai dri node stelah i
            while (j != null) {                         // loop node setelah i smpai akhir
                if (i.data.namaPesanan.compareToIgnoreCase(j.data.namaPesanan) > 0) { 
                    // swap data
                    Pesanan tmp = i.data;
                    i.data = j.data;
                    j.data = tmp;
                }
                j = j.next; // maju ke node berikutnya  
            }
            i = i.next; // maju ke node berikutnya
        }
    }
    // method menampilkan semua pesnan ke layar
    public void tampilPesanan() {
        if (head == null) {  // juka tdak ada pesanan 
            System.out.println("Belum ada pesanan.");
            return;     //keluar dari method
        }
        sortByNama();  //urutan sebelum tampil
        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.printf("%-14s %-20s %s%n", "Kode Pesanan", "Nama Pesanan", "Harga");
        int total = 0;
        NodePesanan curr = head;
        while (curr != null) {      // loop semua node pesanan
            System.out.printf("%-14d %-20s %d%n", curr.data.kodePesanan, curr.data.namaPesanan, curr.data.harga);
            total += curr.data.harga; // hitung total pendapatan
            curr = curr.next;       // maju ke node berikutnya
        }
        System.out.println("--------------------------------------");
        System.out.println("Total Pendapatan: " + total);   // tampil total pendapatan
    }
}