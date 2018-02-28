package BubbleSortAndBinarySearch;
/*
 * Created by TKolos on 28.02.2018.
 * Binary search: https://ru.wikipedia.org/wiki/%D0%94%D0%B2%D0%BE%D0%B8%D1%87%D0%BD%D1%8B%D0%B9_%D0%BF%D0%BE%D0%B8%D1%81%D0%BA
 * В стандартной библиотеке Java уже имеется реализация двоичного поиска (который при этом может быть расширен через интерфейс Comparator).
 * Для объектных типов данных общий вид метода выглядит так: java.util.Arrays.binarySearch(T[] array, T value[, Comparator c])
 * Bubble sort: https://ru.wikibooks.org/wiki/%D0%A0%D0%B5%D0%B0%D0%BB%D0%B8%D0%B7%D0%B0%D1%86%D0%B8%D0%B8_%D0%B0%D0%BB%D0%B3%D0%BE%D1%80%D0%B8%D1%82%D0%BC%D0%BE%D0%B2/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0/%D0%9F%D1%83%D0%B7%D1%8B%D1%80%D1%8C%D0%BA%D0%BE%D0%BC#Java
 */
public class SearchAndSort {

    double[] array;
    //int length;

    public SearchAndSort(double[] array) {
        this.array = array;
    }

    // собственно алгоритм поиска
    public int binarySearch(double x) {
        int i = -1;
        if (this.array != null) {
            int low = 0, high = this.array.length, mid;
            while (low < high) {
                mid = (low + high) / 2; // Можно заменить на: (low + high) >>> 1, чтоб не возникло переполнение целого
                if (x == this.array[mid]) {
                    i = mid;
                    break;
                } else {
                    if (x < this.array[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return i;
    }
    void bubbleSort() {
        for (int i = this.array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (this.array[j] > this.array[j + 1]) {
                    double t = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = t;
                }
            }
        }
    }
    void print(){
        for (int i = 0; i < this.array.length ; i++) {
            System.out.print(this.array[i] + ", ");
        }
        System.out.println("");
    }
}
