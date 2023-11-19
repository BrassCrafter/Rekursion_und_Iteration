package Aufgaben_3_11_2023;

import java.util.Arrays;

public class Quicksort {
    static int vergleiche;
    public static void sort(int[] usl) {
        if (usl == null || usl.length == 0) {
            return;
        }
        quickSort(usl, 0, usl.length - 1);
    }

    private static void quickSort(int[] usl, int low, int high) {
        if (low < high) {
            vergleiche ++;
            int pivotIndex = partition(usl, low, high);
            quickSort(usl, low, pivotIndex - 1);
            quickSort(usl, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] usl, int low, int high) {
        int pivot = usl[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (usl[j] <= pivot) {
                vergleiche ++;
                i++;

                int temp = usl[i];
                usl[i] = usl[j];
                usl[j] = temp;
            }
        }

        int temp = usl[i + 1];
        usl[i + 1] = usl[high];
        usl[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] usl = new int[10];
        for(int i = 0; i < usl.length; i++)
            usl[i] = (int)(Math.random()*usl.length);
        System.out.println("Unsorted usl: " + Arrays.toString(usl));
        sort(usl);
        System.out.println("Sorted usl: " + Arrays.toString(usl));
        System.out.println("finished!!");
        System.out.println("Vergleiche: " + vergleiche);
    }
}
