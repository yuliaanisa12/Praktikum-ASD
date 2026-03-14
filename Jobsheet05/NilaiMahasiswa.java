package Jobsheet05;

public class NilaiMahasiswa {
    String nama;
    String nim;
    int tahunMasuk;
    int uts;
    int uas;

    NilaiMahasiswa(String nama, String nim, int tahunMasuk, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.uts = uts;
        this.uas = uas;
    }

    static int utsTertinggi(NilaiMahasiswa arr[], int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }

        int mid = (l + r) / 2;

        int left = utsTertinggi(arr, l, mid);
        int right = utsTertinggi(arr, mid + 1, r);

        return Math.max(left, right);
    }

    static int utsTerendah(NilaiMahasiswa arr[], int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }

        int mid = (l + r) / 2;

        int left = utsTerendah(arr, l, mid);
        int right = utsTerendah(arr, mid + 1, r);

        return Math.min(left, right);
    }

    static double rataUAS(NilaiMahasiswa arr[]) {
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i].uas;
        }

        return total / arr.length;
    }
}

