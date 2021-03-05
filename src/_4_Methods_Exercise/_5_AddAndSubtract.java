package _4_Methods_Exercise;

import java.util.Scanner;

public class _5_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
       int result = resultFromAddAndSubstract(first,second,third);
        System.out.println(result);
    }

    private static int resultFromAddAndSubstract(int first, int second, int third) {
        return (sumFirstSecond(first,second)-third);
    }

    private static int sumFirstSecond(int first, int second) {
        return (first+second);
    }
}
