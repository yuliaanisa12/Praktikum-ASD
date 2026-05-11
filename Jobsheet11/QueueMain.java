public class QueueMain {

    public static void main(String[] args) {

        QueueLinkedList antrian = new QueueLinkedList();

        TugasMahasiswa mhs1 = new TugasMahasiswa("22212202", "Cintia", "TI");
        TugasMahasiswa mhs2 = new TugasMahasiswa("23212201", "Bimon", "SI");
        TugasMahasiswa mhs3 = new TugasMahasiswa("24212203", "Dewi", "MI");
        
        antrian.enqueue(mhs1);
        antrian.enqueue(mhs2);
        antrian.enqueue(mhs3);

        antrian.print();

        antrian.peekFront();

        antrian.peekRear();

        antrian.jumlahAntrian();

        antrian.dequeue();

        antrian.print();

        antrian.clear();
        
        antrian.print();
    }
}
