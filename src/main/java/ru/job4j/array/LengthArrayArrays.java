package ru.job4j.array;

public class LengthArrayArrays {

    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 0}};
        for (int[] i : numbers) {
            System.out.println(
                    "Размер вложенного массива равен: " + i.length
            );
        }
    }
}