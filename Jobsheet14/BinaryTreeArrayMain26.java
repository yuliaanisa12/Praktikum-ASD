public class BinaryTreeArrayMain26 {
    public static void main(String[] args) {
        BinaryTreeArray26 bta = new BinaryTreeArray26();
        Mahasiswa26 mhs1 = new Mahasiswa26("244160121", "Ali", "A", 3.57);
        Mahasiswa26 mhs2 = new Mahasiswa26("244160185", "Candra", "C", 3.41);
        Mahasiswa26 mhs3 = new Mahasiswa26("244160221", "Badar", "B", 3.75);
        Mahasiswa26 mhs4 = new Mahasiswa26("244160220", "Dewi", "B", 3.35);

        Mahasiswa26 mhs5 = new Mahasiswa26("244160131", "Devi", "A", 3.48);
        Mahasiswa26 mhs6 = new Mahasiswa26("244160205", "Ehsan", "D", 3.61);
        Mahasiswa26 mhs7 = new Mahasiswa26("244160170", "Fizi", "B", 3.86);

        Mahasiswa26[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

                // Tugas 4
        BinaryTreeArray26 bta2 = new BinaryTreeArray26();
        bta2.add(new Mahasiswa26("244160121", "Ali", "A", 3.57));
        bta2.add(new Mahasiswa26("244160185", "Candra", "C", 3.41));
        bta2.add(new Mahasiswa26("244160221", "Badar", "B", 3.75));
        bta2.add(new Mahasiswa26("244160220", "Dewi", "B", 3.35));
        bta2.add(new Mahasiswa26("244160131", "Devi", "A", 3.48));
        bta2.add(new Mahasiswa26("244160205", "Ehsan", "D", 3.61));
        bta2.add(new Mahasiswa26("244160170", "Fizi", "B", 3.86));

        System.out.println("\nInOrder Traversal (add):");
        bta2.traverseInOrder(0);
        System.out.println("\nPreOrder Traversal:");
        bta2.traversePreOrder(0);
    }
}
    
