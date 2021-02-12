package _2_DataTypesAndVariables_Lab;

import java.util.Scanner;

public class _7_ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char thirdChar = scanner.nextLine().charAt(0);
//        int first = (char)firstChar;
//        int second = (char)secondChar;
//        int third = (char)thirdChar;
        System.out.printf("%c %c %c",thirdChar,secondChar,firstChar);
    }
}
