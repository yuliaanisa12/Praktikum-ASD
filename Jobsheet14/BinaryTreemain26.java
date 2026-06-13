public class BinaryTreemain26 {
    public static void main(String[] args) {
        BinaryTree26 bst = new BinaryTree26();

        bst.add(new Mahasiswa26("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa26("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa26("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa26("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in oder traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        String hasilCari = bst.find(3.54)?"Ditemukan":"Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22)?"Ditemukan":"Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa26("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa26("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa26("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        // Tugas Praktikum
        System.out.println("\n=== TUGAS PRAKTIKUM ===");

        // Tugas 1: addRekursif
        System.out.println("\nTest addRekursif - Membuat tree baru:");
        BinaryTree26 bst2 = new BinaryTree26();
        bst2.addRekursif(new Mahasiswa26("244160121", "Ali", "A", 3.57));
        bst2.addRekursif(new Mahasiswa26("244160221", "Badar", "B", 3.85));
        bst2.addRekursif(new Mahasiswa26("244160185", "Candra", "C", 3.21));
        bst2.addRekursif(new Mahasiswa26("244160220", "Dewi", "B", 3.54));
        bst2.addRekursif(new Mahasiswa26("244160131", "Devi", "A", 3.72));
        bst2.addRekursif(new Mahasiswa26("244160205", "Ehsan", "D", 3.37));
        bst2.addRekursif(new Mahasiswa26("244160170", "Fizi", "B", 3.46));
        System.out.println("InOrder Traversal (addRekursif):");
        bst2.traverseInOrder(bst2.root);

        // Tugas 2: cariMinIPK dan cariMaxIPK
        System.out.println();
        bst2.cariMinIPK();
        System.out.println();
        bst2.cariMaxIPK();

        // Tugas 3: tampilMahasiswaIPKdiAtas
        System.out.println();
        bst2.tampilMahasiswaIPKdiAtas(3.50);
    }
}