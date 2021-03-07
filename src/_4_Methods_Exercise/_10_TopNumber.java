package _4_Methods_Exercise;

import java.util.Scanner;

public class _10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        //int length = String.valueOf(input).length();
        topNumbers(input);

    }
    private static void topNumbers(int input) {

        for (int i = 10; i < input; i++) {
            int sum = 0;
            int runNumber = i;
            while (runNumber > 0) {
                int num = runNumber % 10;
                runNumber = runNumber / 10;
                //  System.out.println(num);
                sum += num;
            }
            if (sum % 8 == 0) {
                oneOddNumber(i);

            }
        }
    }
    private static void oneOddNumber(int n) {
        int runNumber = n;
        while (runNumber > 0) {
            int num = runNumber % 10;
            if (num % 2 != 0) {
                System.out.println(n);
                break;
            }
            runNumber = runNumber / 10;
        }

    }
}
