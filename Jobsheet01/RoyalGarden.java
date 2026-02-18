package Jobsheet01;

public class RoyalGarden {
    public static int hitungPendapatan(int aglo, int keladi, int alo, int mawar ) {
    int hargaAglo = 75000;
    int hargaKeladi = 50000;
    int hargaAlo = 60000;
    int hargaMawar = 40000;

    return  (aglo * hargaAglo) +
            (keladi * hargaKeladi) +
            (alo * hargaAlo) +
            (mawar * hargaMawar);
    }

    public static String cekStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
        }

  public static void main(String[] args) {

        int[][] stok = {
            {10, 5, 15, 7},   // RoyalGarden 1
            {6, 11, 9, 12},   // RoyalGarden 2
            {2, 10, 10, 5},   // RoyalGarden 3
            {5, 7, 12, 9}     // RoyalGarden 4
        };

        for (int i = 0; i < stok.length; i++) {
            int pendapatan = hitungPendapatan(
                    stok[i][0],
                    stok[i][1],
                    stok[i][2],
                    stok[i][3]
            );

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status     : " + cekStatus(pendapatan));
            System.out.println("---------------------------");
        }
    }
}



    