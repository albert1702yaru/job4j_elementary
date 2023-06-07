package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean in = left > right;
        int result = in ? left : right;
        return result;
    }
}
