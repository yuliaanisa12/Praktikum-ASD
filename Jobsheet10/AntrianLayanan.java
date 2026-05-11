public class AntrianLayanan {
    Mahasiswa[] data;
    int front, rear, size, max;

    public AntrianLayanan(int n) {
        this.max = n;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (size == max) {
            System.out.println("Antrian penuh, tidak dapat menambahkan mahasiswa.");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian.");
        }
    }

    public Mahasiswa layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dapat dilayani.");
            return null;
        }
        Mahasiswa mhs = data[front];
        front = (front + 1) % max;
        size--;
        System.out.println(mhs.nama + " telah dilayani.");
        return mhs;
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa di depan antrian:");
            System.out.printf("%-5s %-5s %-5s %-5s %-5s\n", "No", "NIM", "NAMA", "PRODI", "KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            System.out.printf("%-5s %-5s %-5s %-5s %-5s\n", "No", "NIM", "NAMA", "PRODI", "KELAS");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.printf("%-5d  ", (i+1));
                data[index].tampilkanData();
            }
        }
    }
    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
            }
        }

    public int getJumlahAntrian() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

