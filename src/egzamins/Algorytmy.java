package egzamins;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Algorytmy {
    int[] arr = {1, -22, 33, -4, 44, 12, 133, 0, 11, 1233, 33, 222, 1321, 11, 44, -1};
    int minAlg = arr[0];
    int index = 0;
    int count = 0;

    //=======================================================ПОИСК
    //Линейный поиск(Wyszukiwanie liniowe) минимального алгоритма - O(n)
    public void searchMinElement() {
        for (int i = 1; i <= arr.length - 1; i++) {
            if (minAlg > arr[i]) {
                minAlg = arr[i];
                index = i;
            }
        }
        System.out.println("Minimalny algorytm: " + minAlg + " z indeksom: " + index);
    }

    //=======================================================СОРТИРОВКА
    //Алгоритм сортировки Пузырьком(Sortowanie bąbelkowe) - O(n²)
    public void sortBubble() {
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                //1 > -22, Больше , тогда вытащи еденицу и на ее место поставь меньшее число -22
                // с помощью переменной tem
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Cортировка выбором (Sortowanie przez wybieranie) - O(n²)
    //Пример {33,24,1} => 24 < 33 =>{24| 33,1}
    public void selectionSort() {
        for (int step = 0; step < arr.length; step++) {
            int index = min(arr, step);

            int tmp = arr[step];
            arr[step] = arr[index];
            arr[index] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int min(int[] array, int start) {
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    //Быстрая сортировка - Dziel i zwyciężaj
    //algorytm partycjonujący - realizuje podział zadanego zbioru danych na podzbiory(partycje)
    //według ustalonego kryterium
    public void sort(){
        quickSort( arr, 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int from, int to) {

        if (from < to) {

            int divideIndex = partition(arr, from, to);

            quickSort(arr, from, divideIndex - 1);

            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
