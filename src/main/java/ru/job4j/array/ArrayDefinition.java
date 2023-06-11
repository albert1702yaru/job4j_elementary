package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surNames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surNames равен: " + surNames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        names[0] = "Petr Arsentev";
        names[1] = "Stas Korobeinikov";
        names[2] = "Alexey Esipov";
        names[3] = "Andrei Hincu";
        for (String i : names) {
            System.out.println(i);
        }
    }
}
