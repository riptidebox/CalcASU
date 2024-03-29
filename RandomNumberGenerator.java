package org.example;
import java.util.Random;



    public class RandomNumberGenerator {
        public int generateNumber() {
            Random random = new Random();
            return random.nextInt(401) + 100; // Генерируем число в диапазоне от 100 до 500
        }

        public static void main(String[] args) {
            RandomNumberGenerator rng = new RandomNumberGenerator();
            int randomNumber = rng.generateNumber();
            System.out.println("Случайное число: " + randomNumber);
        }


}