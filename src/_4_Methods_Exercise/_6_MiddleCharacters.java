package _4_Methods_Exercise;

import java.util.Scanner;

public class _6_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printMiddle(input);
    }

    private static void printMiddle(String input) {
              if (input.length() % 2 == 0) {
            System.out.print(input.charAt((input.length() / 2)-1)+""+ input.charAt((input.length() / 2) ));
        } else {
            System.out.println(input.charAt(input.length() / 2));
        }

    }
}
