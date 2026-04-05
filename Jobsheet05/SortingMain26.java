package Jobsheet05;

public class SortingMain26 {
    public static void main(String[] args) {

        //deklarasi 
        int a[] = {20, 10, 2, 7, 12, 62};
        int b[] = {30, 20, 2, 8, 14};
        int c[] = {40, 10, 4, 9, 3};

        // tampilan awal 
        Sorting26 dataurut1 = new Sorting26(a, a.length);
        Sorting26 dataurut2 = new Sorting26(b, b.length);
        Sorting26 dataurut3 = new Sorting26(c, c.length);

        //data awal
        System.out.println("Data Awal 1");
        dataurut1.tampil();
        System.out.println("Data Awal 2");
        dataurut2.tampil();
        System.out.println("Data Awal 3");
        dataurut3.tampil();

        //bubble sort 
        dataurut1.bubbleSort();
        dataurut2.selectionSort();
        dataurut3.insertionSort();

        // hasil 
        System.out.println("Data sudah diurutkan dengan bubble sort (ASC) ");
        dataurut1.tampil();
        System.out.println("Data sudah diurutkan dengan selection sort (ASC) ");
        dataurut2.tampil();
        System.out.println("Data sudah diurutkan dengan insertion sort (ASC) ");
        dataurut3.tampil();
    }
}

