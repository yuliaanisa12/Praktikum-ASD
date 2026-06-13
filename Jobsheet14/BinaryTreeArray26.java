public class BinaryTreeArray26 {
    Mahasiswa26[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray26() {
        this.dataMahasiswa = new Mahasiswa26[10];
    }

    void populateData(Mahasiswa26 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // Tugas 4 - tambahkan ini
    void add(Mahasiswa26 data) {
        dataMahasiswa[idxLast] = data;
        idxLast++;
    }

    // Tugas 4 - tambahkan ini
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}