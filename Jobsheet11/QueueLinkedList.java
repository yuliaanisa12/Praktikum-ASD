public class QueueLinkedList {

    NodeTugas front;
    NodeTugas rear;
    int size;
    int max = 10;

    boolean isEmpty() {

        return front == null;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        if (!isEmpty()) {
            front = rear = null;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    void enqueue(TugasMahasiswa input) {
        if (isFull()) {
            System.out.println("Antrian penuh");
        } else {
            NodeTugas ndInput = new NodeTugas(input, null);
            if (isEmpty()) {
                front = rear = ndInput;
            } else {
                rear.next = ndInput;
                rear = ndInput;
            }
            size++;

            System.out.println( input.nama + " berhasil masuk antrian");
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian dipanggil :");
            front.data.tampilIformasi();
            front = front.next;
            size--;
            if (front == null) {
                rear = null;
            }
        }
    }

    void peekFront() {
        if (!isEmpty()) {
            System.out.println( "Antrian terdepan :");
            front.data.tampilIformasi();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir :");
            rear.data.tampilIformasi();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    void print() {
        if (!isEmpty()) {
            NodeTugas temp = front;
            System.out.println("Isi Antrian:");
            while (temp != null) {
                temp.data.tampilIformasi();
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa mengantri : " + size);
    }
}
