package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffAndDivvy(double first, double second) {
        return diff(first, second)
                + divvy(first, second);
    }

    public static double sumMultiplyDiffDivvy(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + diff(first, second) + divvy(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + diffAndDivvy(10, 20));
        System.out.println("Результат расчета равен: " + sumMultiplyDiffDivvy(10, 20));
    }
}