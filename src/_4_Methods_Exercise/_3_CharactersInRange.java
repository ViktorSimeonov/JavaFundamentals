package _4_Methods_Exercise;

import java.util.Scanner;

public class _3_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startChar = scanner.nextLine().charAt(0);
        char endChar = scanner.nextLine().charAt(0);
        printCharactersInRange(startChar, endChar);
    }

    private static void printCharactersInRange(char startChar, char endChar) {
        if (startChar < endChar) {
            for (int i = ((int) startChar + 1); i <= ((int) endChar - 1); i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = ((int) endChar + 1); i <= ((int) startChar - 1); i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
