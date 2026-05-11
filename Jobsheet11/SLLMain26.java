
public class SLLMain26 {
    public static void main(String[] args) {

    SingleLinkedList26 sll = new SingleLinkedList26();

        Mahasiswa26 mhs1 = new Mahasiswa26("22212202", "Cintia", "3C",3.5);
        Mahasiswa26 mhs2 = new Mahasiswa26("22212201", "Bimon", "2B", 3.8);

        // tambah data
        sll.addFirst(mhs1);
        sll.addLast(mhs2);

        // tampil data index 1
        System.out.println("data index 1 : ");
        sll.head.data.tampilkanInformasi();

        // cari index bimon
        System.out.println(
                "data mahasiswa an Bimon berada pada index : "
                + sll.indexOf("Bimon")
        );

        // tampil linked list
        System.out.println();
        sll.print();

        // hapus data depan
        sll.removeFirst();

        // tampil linked list lagi
        sll.print();
    }
}