package _2_DataTypesAndVariables_Lab;

import java.util.Scanner;

public class _6_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.next().charAt(0);
        char second = scanner.next().charAt(0);
        char third = scanner.next().charAt(0);
        System.out.printf("%c%c%c",first,second,third);

    }
}
