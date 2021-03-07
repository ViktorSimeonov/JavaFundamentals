package _4_Methods_Exercise;

import java.util.Scanner;

public class _9_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input ;
        while (!"END".equals(input = scanner.nextLine())){
            System.out.println(palindrome(input));
        }
    }

    private static boolean palindrome(String input) {
        return forward(input).equals(backword(input));

    }

    private static String forward(String input) {
        return input;

    }
    private static String backword(String input) {
        String tupni="";
        for (int i = input.length()-1; i >= 0; i--) {
            char a = input.charAt(i);
            tupni=tupni+ a;
        }
        return tupni;
    }
}
