package org.example;

import java.util.Random;

public class ArrayGenerator {
    private RandomNumberGenerator rng;

    public ArrayGenerator() {
        rng = new RandomNumberGenerator();
    }

    public int[] generateArray() {
        int[] array = new int[11]; // Создаем массив с 11 элементами

        // Заполняем массив случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = rng.generateNumber();
        }

        return array;
    }

    public static void main(String[] args) {
        ArrayGenerator arrayGenerator = new ArrayGenerator();
        int[] randomArray = arrayGenerator.generateArray();

        // Выводим массив на экран
        System.out.println("Сгенерированный массив:");
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i] + " ");
        }
    }
}
