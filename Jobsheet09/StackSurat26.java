class StackSurat26 {
    Surat26[] stack;
    int top;
    int size;

    StackSurat26(int size) {
        this.size = size;
        stack = new Surat26[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(Surat26 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
            System.out.println("Surat berhasil ditambahkan");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    Surat26 pop() {
        if (!isEmpty()) {
            Surat26 srt = stack[top];
            top--;
            return srt;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    Surat26 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    void cari(String nama) {
        boolean ketemu = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                System.out.println(stack[i].idSurat + " | " +
                        stack[i].namaMahasiswa + " | " +
                        stack[i].kelas + " | " +
                        stack[i].jenisIzin + " | " +
                        stack[i].durasi + " hari");
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Surat tidak ditemukan");
        }
    }
}