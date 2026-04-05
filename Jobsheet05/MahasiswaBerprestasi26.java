package Jobsheet05;

public class MahasiswaBerprestasi26 {
    Mahasiswa26 listMhs[];
    int idx;

    MahasiswaBerprestasi26(int kapasitas) {
    listMhs = new Mahasiswa26[kapasitas];
}

    void tambah (Mahasiswa26 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else{
            System.out.println("Data sudah penuh");
        }
    }
    void tampil() {
        for (Mahasiswa26 m:listMhs) {
            m.tampilInformasi();
            System.out.println("------------------------");
        }
    }
    void bubbleSort() {
        for (int i=0; i<listMhs.length-1; i++) {
            for (int j=1; j<listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa26 temp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = temp;
                }
            }
        }
    }
    void selectionSort() {
    for (int i = 0; i < idx - 1; i++) {
        int min = i;
        for (int j = i + 1; j < idx; j++) {
            if (listMhs[j].ipk < listMhs[min].ipk) {
                min = j;
            }
        }
        Mahasiswa26 tmp = listMhs[min];
        listMhs[min] = listMhs[i];
        listMhs[i] = tmp;
    }
}
void insertionSortDESC() {
    for (int i = 1; i < idx; i++) {
        Mahasiswa26 temp = listMhs[i];
        int j = i;
        while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
            listMhs[j] = listMhs[j - 1];
            j--;
        }
        listMhs[j] = temp;
        }
    }
}
