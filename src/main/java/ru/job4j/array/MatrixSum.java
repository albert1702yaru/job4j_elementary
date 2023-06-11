package ru.job4j.array;

public class MatrixSum {

    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] i : array) {
            for (int j : i) {
                rsl += j;
            }
        }
        return rsl;
    }
}