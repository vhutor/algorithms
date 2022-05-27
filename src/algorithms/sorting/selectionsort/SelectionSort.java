package algorithms.sorting.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static int[] sort(int[] array) {
        int N = array.length;

        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j < N; j++) {
                if(array[j] < array[min]) {
                    min = j;
                }
            }
            exchange(array, i, min);
        }

        return array;
    }

    public static void exchange(int[] array, int index1, int index2) {
        int space = array[index1];
        array[index1] = array[index2];
        array[index2] = space;
    }

}
