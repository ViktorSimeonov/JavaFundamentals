package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class _16_DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if ((numbers[i] + numbers[j]) % Integer.parseInt(data[1]) == 0) {
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
