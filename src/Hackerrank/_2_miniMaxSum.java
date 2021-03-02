package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class _2_miniMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().
                split(" ")).mapToInt(Integer::parseInt).toArray();
        long minSum = Long.MAX_VALUE;
        long maxSum = Long.MIN_VALUE;
        long currentSum;
        for (int i = 0; i < numbers.length; i++) {
            currentSum = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                currentSum += numbers[j];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < minSum) {
                minSum = currentSum;
            }
        }
        System.out.printf("%d %d", minSum, maxSum);
    }
}
