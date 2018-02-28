package BubbleSortAndBinarySearch;

/**
 * Created by TKolos on 28.02.2018.
 */
public class Main {
    public static void main(String[] args) {
        SearchAndSort bs = new SearchAndSort(new double[]{-16, -9, -5, 0, 3, 7, 12, 18, 20, 24, 30, 32, 38, 47, 50});
        System.out.println(bs.binarySearch(-30));// -1;
        System.out.println(bs.binarySearch(-16));// 0;
        System.out.println(bs.binarySearch(7));// 5;
        System.out.println(bs.binarySearch(20));// 8;

        SearchAndSort arr = new SearchAndSort(new double[]{2, 9, -1.1, -10, 0, 5, 4, 5.4, 78, 40});
        arr.print();
        arr.bubbleSort();
        arr.print();
    }
}
