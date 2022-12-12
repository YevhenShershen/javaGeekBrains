package egzamins;

import java.util.Arrays;

//Program implementujący algorytm przeszukiwania tablicy z wartownikiem.
public class PrzeszukZwartownikiem {
    int[] arr = new int[50];
    int elemSzukany = 0;

    private int[] createRandomArray(int x) {
        //tworzymy tabele z randomną liczbą
        for (
                int i = 0;
                i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 100);
        }
        //ustawiamy wartownik na koniec naszej tabeli
        arr[arr.length - 1] = x;
        return arr;
    }

    public void searchElement(int element) {
        createRandomArray(element);
        //
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element && i == arr.length - 1) {
                System.out.println("Такого элемента нету в массиве");
                System.out.println(Arrays.toString(arr));
                return;
            }
            if (arr[i] == element) {
                System.out.println(Arrays.toString(arr));
                System.out.println("Элемент находится под индексом " + i + " " + arr.length);
                return;
            }
        }
    }
}
