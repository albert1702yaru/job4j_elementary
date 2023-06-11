package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (char i : board[row]) {
            if (i != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] i : board) {
            if (i[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}