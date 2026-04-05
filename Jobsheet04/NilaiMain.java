package Jobsheet04;

public class NilaiMain {
    
    public static void main(String[] args) {

        NilaiMahasiswa[] mhs = {
            new NilaiMahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new NilaiMahasiswa("Budi", "220101002", 2022, 85, 88),
            new NilaiMahasiswa("Cindy", "220101003", 2021, 90, 87),
            new NilaiMahasiswa("Dian", "220101004", 2021, 76, 79),
            new NilaiMahasiswa("Eko", "220101005", 2023, 92, 95),
            new NilaiMahasiswa("Fajar", "220101006", 2020, 88, 85),
            new NilaiMahasiswa("Gina", "220101007", 2023, 80, 83),
            new NilaiMahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        int utsMax = NilaiMahasiswa.utsTertinggi(mhs, 0, mhs.length - 1);
        int utsMin = NilaiMahasiswa.utsTerendah(mhs, 0, mhs.length - 1);
        double rataUAS = NilaiMahasiswa.rataUAS(mhs);

        System.out.println("Nilai UTS tertinggi (Divide and Conquer): " + utsMax);
        System.out.println("Nilai UTS terendah (Divide and Conquer): " + utsMin);
        System.out.println("Rata-rata nilai UAS (Brute Force): " + rataUAS);
    }
}
    

