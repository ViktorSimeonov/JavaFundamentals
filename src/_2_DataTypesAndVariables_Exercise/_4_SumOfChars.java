package _2_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class _4_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            int letter = scanner.nextLine().charAt(0);
            sum +=letter;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
