package _3_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _9_1_KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthSequences = Integer.parseInt(scanner.nextLine());
        String dNA;
        int sample = 0;
        int currentNumberOfSameNumber = 0;
        int previousNumberOfSameNumber = 0;
        int bestSequenceIndex = 0;
        int currentCountEqual;
        int currentStartIndex = 0;
        int previousStartIndex = 0;
        int previousSum = 0;
        int currentSum;
        int[] outputBestArr = new int[lengthSequences];
        while (!"Clone them!".equals(dNA = scanner.nextLine())) {
            sample++;
            int[] numbers = Arrays.stream(dNA.split("!")).mapToInt(Integer::parseInt).toArray();
            currentCountEqual = 0;
            currentSum = 0;
            for (int i = 0; i < lengthSequences; i++) {
                if (1 == numbers[i]) {
                    currentCountEqual++;
                    currentSum++;
                    if (currentCountEqual > currentNumberOfSameNumber) {
                        currentNumberOfSameNumber = currentCountEqual;
//                        bestSequenceIndex = sample;
//                        currentBestArr = numbers;
                        currentStartIndex = (i + 1) - currentNumberOfSameNumber;
                    }
                } else {
                    currentCountEqual = 0;
                }
            }
            if (currentNumberOfSameNumber == previousNumberOfSameNumber) {
                if (currentStartIndex == previousStartIndex && currentSum > previousSum) {
                    outputBestArr = numbers;
                    bestSequenceIndex = sample;
                    previousSum = currentSum;

                } else if (previousStartIndex > currentStartIndex) {
                    outputBestArr = numbers;
                    bestSequenceIndex = sample;
                    previousSum = currentSum;
                }

            } else if (currentNumberOfSameNumber > previousNumberOfSameNumber) {
                outputBestArr = numbers;
                bestSequenceIndex = sample;
                previousNumberOfSameNumber = currentNumberOfSameNumber;
                previousSum = currentSum;
            }
            previousStartIndex = currentStartIndex;
            currentNumberOfSameNumber = 0;
            currentStartIndex = 0;

        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSequenceIndex, previousSum);
        for (int i = 0; i < lengthSequences; i++) {
            System.out.printf("%d ", outputBestArr[i]);
        }
    }
}









