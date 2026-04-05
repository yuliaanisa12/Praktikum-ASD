package Jobsheet05;

public class SortingMain26 {
    
    public class SortingMain {
    public static void main(String[] args) {

        int a[] = {34, 7, 23, 32, 5, 62};
        int b[] = {12, 45, 2, 19, 33};
        int c[] = {9, 8, 7, 6, 5};

        // Bubble Sort
        Sorting26 dataurut1 = new Sorting26(a, a.length);
        System.out.println("Bubble Sort:");
        dataurut1.bubbleSort();
        dataurut1.tampil();

        // Selection Sort
        Sorting26 dataurut2 = new Sorting26(b, b.length);
        System.out.println("Selection Sort:");
        dataurut2.selectionSort();
        dataurut2.tampil();

        // Insertion Sort
        Sorting26 dataurut3 = new Sorting26(c, c.length);
        System.out.println("Insertion Sort:");
        dataurut3.insertionSort();
        dataurut3.tampil();
    }
}
}
