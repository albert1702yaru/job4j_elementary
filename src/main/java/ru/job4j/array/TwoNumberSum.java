package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < array.length && j > 0) {
            if (array[i] + array[j] == target) {
                return new int[] {i, j};
            } else if (array[i] + array[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[0];
    }
}