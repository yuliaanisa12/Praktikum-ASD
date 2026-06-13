//  class double linked list menyimpan antrian pembeli
public class DLLAntrian {
    NodeAntrian head;       // depan antrian
    NodeAntrian tail;       // belakang antrian
    int size;               //jumlah pembeli dlm antri
    int nomorAntrian;       // nomor antrian berikutnya
    // konstruktor inisialisasi antri + isi 4 data 
    public DLLAntrian() {
        head = null;        // awl ksong
        tail = null;       
        size = 0;           //jumlah antrian
        nomorAntrian = 0;   // no mulai dri 0
        //menambah 4 data awal pembeli
        tambahAntrian("ainra", "08224500000");
        tambahAntrian("danra", "08224511111");
        tambahAntrian("sanri", "08224522222");
        tambahAntrian("vania", "082234556");
    }
    // method menambah pembelibru ke bgian akhir
    public void tambahAntrian(String namaPembeli, String noHp) {
        nomorAntrian++;                              // increment no antrian 
        size++;                                      // increment jumlah antrian
        Pembeli p = new Pembeli(namaPembeli, noHp);  // buat objek pembeli bru
        NodeAntrian baru = new NodeAntrian(p);       // bungkus dlam node
        baru.data = p;                               // isi data node pembelian
       
        if (head == null) {   // jika antrian msh ksong
            head = baru;      // node baru jdi head
            tail = baru;      // node baru jg jadi tail
        } else {              // jika antrian sudah ada isi
            baru.prev = tail; // prev node baru menuju tail lma
            tail.next = baru; // next tail lama menuju node baru
            tail = baru;      // node bru mnjdi tail bru
        }
    }
    // method menampilkan seluruh antrian pembeli
    public void tampilAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.printf("%-12s %-15s %s%n", "No Antrian", "Nama", "No HP");
        NodeAntrian curr = head;
        int no = 1;     //no urutan dri 1
        while (curr != null) {
            System.out.printf("%-12d %-15s %s%n", no, curr.data.namaPembeli, curr.data.noHp);
            curr = curr.next;   // maju ke node berikutnya
            no++;   // increment no urutan
        }
    }
    // method menghapis pembeli paling depan antrian (fifo)
    public Pembeli hapusAntrian() {
        if (head == null) return null;  // jika ksong , return null
        Pembeli p = head.data;
        if (head == tail) {     
            head = null;
            tail = null;
        } else {            // jika masih ada antrian lain setelah dihapus
            head = head.next;  // maju head ke node berikutnya
            head.prev = null;   // prev head baru di null kan
        }
        size--;     // decrement jumlah antrian
        return p;   // kembalikan data pembeli yang dihapus
    }
    // method cek apakah antrian kosong
    public boolean isEmpty() {
        return head == null;

    }
}