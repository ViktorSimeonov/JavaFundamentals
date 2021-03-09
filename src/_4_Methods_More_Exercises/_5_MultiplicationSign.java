package _4_Methods_More_Exercises;

import java.util.Scanner;

public class _5_MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        if (isZero(arr)) {
            System.out.printf("zero%n");
            return;
        }
        if (isNegative(arr)) {
            System.out.printf("negative%n");
        } else {
            System.out.printf("positive%n");
        }

    }

    private static boolean isZero(int[] arr) {
        boolean isZero = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                isZero = true;
                break;
            }
        }
        return (isZero);
    }

    private static boolean isNegative(int[] arr) {
        int negative = 0;
        boolean isNegative = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negative++;
            }
        }
        if (negative % 2 == 1) {
            isNegative = true;
        }
        return (isNegative);
    }
}
