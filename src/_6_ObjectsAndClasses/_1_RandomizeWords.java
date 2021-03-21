package _6_ObjectsAndClasses;

//import java.util.*; // със * означаваме всички!!

import java.util.Scanner;
//import java.util.Arrays;
import java.util.Random;

public class _1_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        //винаги започва от timeStamp а можем да му дадем и стойност
        Random randomGenerator = new Random();

        for (int i = 0; i < words.length; i++) {
            //генерира числа от 0 до дължината на words без да е включена
            int x = randomGenerator.nextInt(words.length);
            int y = randomGenerator.nextInt(words.length);
            String oldWordX = words[x];
            words[x] = words[y];
            words[y] = oldWordX;
        }
        System.out.println(String.join(System.lineSeparator(), words));
    }
}
