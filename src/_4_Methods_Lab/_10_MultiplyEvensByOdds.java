package _4_Methods_Lab;

import java.util.Scanner;

public class _10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int multiplyOfEvenAndOdds = getMultipleOfEvenAndOdds(Math.abs(input));
        System.out.println(multiplyOfEvenAndOdds);
    }

    private static int getMultipleOfEvenAndOdds(int number) {
        //сумата на четните
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);
        return oddSum * evenSum;
        //сумата на нечетните

    }

    private static int getSumOfEvenDigits(int number) {
        int evenSum = 0;
        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            }
            number = number/10;
        }
        return evenSum;
    }

    private static int getSumOfOddDigits(int number) {
        int oddSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 1) {
                oddSum += digit;
            }
            number = number/10;
        }
        return oddSum;
    }
}
