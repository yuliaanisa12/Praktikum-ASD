package Jobsheet12;

public class DoubleLinkedList26 {

    Node26 head;
    Node26 tail;
    int size;

    public DoubleLinkedList26() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa26 data) {

        Node26 newNode = new Node26(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    public void addLast(Mahasiswa26 data) {

        Node26 newNode = new Node26(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    public void add(int index, Mahasiswa26 data) {

        if (index < 0 || index > size) {
            System.out.println("Index di luar batas");
            return;
        }

        if (index == 0) {
            addFirst(data);

        } else if (index == size) {
            addLast(data);

        } else {

            Node26 current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            Node26 newNode = new Node26(data);

            newNode.next = current.next;
            newNode.prev = current;

            current.next.prev = newNode;
            current.next = newNode;

            size++;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa26 data) {

        Node26 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node26 newNode = new Node26(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;

        } else {
            newNode.next = current.next;
            newNode.prev = current;

            current.next.prev = newNode;
            current.next = newNode;
        }

        size++;

        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void removeFirst() {

        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");

        } else {

            System.out.println("Data yang dihapus:");
            head.data.tampil();

            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }

            size--;
        }
    }

    public void removeLast() {

        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");

        } else {

            System.out.println("Data yang dihapus:");
            tail.data.tampil();

            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }

            size--;
        }
    }

    public void removeAfter(String keyNim) {

        Node26 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Node setelah key tidak ada.");
            return;
        }

        Node26 deleted = current.next;

        if (deleted == tail) {
            tail = current;
            tail.next = null;
        } else {
            current.next = deleted.next;
            deleted.next.prev = current;
        }

        System.out.println("Data yang dihapus:");
        deleted.data.tampil();

        size--;
    }

    public void remove(int index) {

        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index di luar batas.");
            return;
        }

        if (index == 0) {
            removeFirst();

        } else if (index == size - 1) {
            removeLast();

        } else {

            Node26 current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            System.out.println("Data yang dihapus:");
            current.data.tampil();

            current.prev.next = current.next;
            current.next.prev = current.prev;

            size--;
        }
    }

    public void getFirst() {

        if (isEmpty()) {
            System.out.println("Linked List kosong.");
        } else {
            System.out.println("Data pertama:");
            head.data.tampil();
        }
    }

    public void getLast() {

        if (isEmpty()) {
            System.out.println("Linked List kosong.");
        } else {
            System.out.println("Data terakhir:");
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {

        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index di luar batas.");
            return;
        }

        Node26 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        System.out.println("Data pada index " + index + ":");
        current.data.tampil();
    }

    public int getSize() {
        return size;
    }

    public void print() {

        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node26 current = head;

        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {

        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node26 current = tail;

        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }
}