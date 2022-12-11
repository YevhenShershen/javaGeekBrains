package egzamins;

import java.util.Arrays;

public class Sortowanie {
    int[] arr = {1, 2, 3, 22, 123, 4, 12, 11, 55, 434};

    public void selectionSort() {
        for (int step = 0; step < arr.length; step++) {
            int index = max(arr, step);
            int tmp = arr[step];
            arr[step] = arr[index];
            arr[index] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int max(int[] array, int start) {
        int maxIndex = start;
        int maxValue = array[start];
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
