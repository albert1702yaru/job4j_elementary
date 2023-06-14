package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int one, int two, int three) {
        int result = max(two, three);
        return max(one, result);
    }

    public static int max(int one, int two, int three, int four) {
        int result = max(two, three, four);
        return max(one, result);
    }
}
