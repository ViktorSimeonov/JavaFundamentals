package _2_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class _6_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int letter = Integer.parseInt(scanner.nextLine());
        for (int i = 97; i < (97+letter); i++) {
            for (int j = 97; j < (97+letter); j++) {
                for (int k = 97; k < (97+letter); k++) {
                    System.out.printf("%c%c%c%n", (char) i, (char) j, (char) k);
                }
            }
        }
    }
}