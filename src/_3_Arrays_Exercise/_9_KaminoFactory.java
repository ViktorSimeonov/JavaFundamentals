package _3_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _9_KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthSequences = Integer.parseInt(scanner.nextLine());
        String dNA;
        int sample = 0;
        int evenNumberOfSameNumber = 0;
        int oddNumberOfSameNumber = 0;
        int bestNumberOfSameNumber = 0;
        int oddIndexOfTheBestSample = 0;
        int evenIndexOfTheBestSample = 0;
        int bestIndexOfTheBestSample = 0;
        int evenCountEqual;
        int oddCountEqual;
        int evenStartIndexTheBest = 0;
        int oddStartIndexTheBest = 0;
        int bestStartIndexTheBest = 0;
        int oddSum = 0;
        int evenSum = 0;
        int evenBestSum = 0;
        int bestOddSum = 0;
        int bestSum = 0;
        int[] evenBestArr = new int[lengthSequences];
        int[] oddBestArr = new int[lengthSequences];
        int[] theBestArr = new int[lengthSequences];
        while (!"Clone them!".equals(dNA = scanner.nextLine())) {
            sample++;
            int[] numbers = Arrays.stream(dNA.split("!")).mapToInt(Integer::parseInt).toArray();
            int equalTo = 1;
            evenCountEqual = 0;
            oddCountEqual = 0;

            if ((sample - 1) % 2 == 0) {
                for (int i = 0; i < lengthSequences; i++) {
                    if (equalTo == numbers[i]) {
                        evenCountEqual++;
                        evenSum++;
                        if (evenCountEqual > evenNumberOfSameNumber) {
                            evenNumberOfSameNumber = evenCountEqual;
                            evenIndexOfTheBestSample = sample;
                            evenBestArr = numbers;
                            evenStartIndexTheBest = (i + 1) - evenNumberOfSameNumber;
                            bestSum = evenSum;
                        } else if (evenCountEqual == evenNumberOfSameNumber) {
                            if (evenStartIndexTheBest < ((i + 1) - evenNumberOfSameNumber)) {

                            } else if ((evenStartIndexTheBest > ((i + 1) - evenNumberOfSameNumber))) {
                                evenStartIndexTheBest = (i + 1) - evenNumberOfSameNumber;

                            } else {
                                if (bestSum > evenSum) {

                                }

                            }
                        }
                    } else {
                        evenCountEqual = 0;
                    }
                }
            } else {
                for (int i = 0; i < lengthSequences; i++) {
                    if (equalTo == numbers[i]) {
                        oddCountEqual++;
                        oddSum++;
                        if (oddCountEqual > oddNumberOfSameNumber) {
                            oddNumberOfSameNumber = oddCountEqual;
                            oddIndexOfTheBestSample = sample;
                            oddBestArr = numbers;
                            oddStartIndexTheBest = (i + 1) - oddNumberOfSameNumber;
                        }
                    } else {
                        oddCountEqual = 0;
                    }
                }
            }

            if (evenNumberOfSameNumber > oddNumberOfSameNumber) {
                bestNumberOfSameNumber = evenNumberOfSameNumber;
                bestIndexOfTheBestSample = evenIndexOfTheBestSample;
                theBestArr = evenBestArr;
                if (evenSum > evenBestSum) {
                    bestSum = evenSum;
                }
                evenSum = 0;

            } else if (evenNumberOfSameNumber < oddNumberOfSameNumber) {
                bestNumberOfSameNumber = oddNumberOfSameNumber;
                bestIndexOfTheBestSample = oddIndexOfTheBestSample;
                theBestArr = oddBestArr;
                if (bestSum > oddSum) {
                    bestSum = oddSum;
                }
                oddSum = 0;

            } else {
                if (evenStartIndexTheBest < oddStartIndexTheBest) {
                    bestNumberOfSameNumber = evenNumberOfSameNumber;
                    bestIndexOfTheBestSample = evenIndexOfTheBestSample;
                    theBestArr = evenBestArr;
                    bestStartIndexTheBest = evenStartIndexTheBest;

                } else if (evenStartIndexTheBest > oddStartIndexTheBest) {
                    bestNumberOfSameNumber = oddNumberOfSameNumber;
                    bestIndexOfTheBestSample = oddIndexOfTheBestSample;
                    bestStartIndexTheBest = oddStartIndexTheBest;
                    theBestArr = oddBestArr;

                } else {

                    if (evenBestSum > bestOddSum) {
                        bestNumberOfSameNumber = evenNumberOfSameNumber;
                        bestIndexOfTheBestSample = evenIndexOfTheBestSample;
                        bestStartIndexTheBest = evenStartIndexTheBest;
                        theBestArr = evenBestArr;
                        bestSum = evenBestSum;
                    } else {
                        bestNumberOfSameNumber = oddNumberOfSameNumber;
                        bestIndexOfTheBestSample = oddIndexOfTheBestSample;
                        bestStartIndexTheBest = oddStartIndexTheBest;
                        theBestArr = oddBestArr;
                        bestSum = bestOddSum;
                    }
                }
            }
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestIndexOfTheBestSample, bestSum);
        for (int i = 0; i < lengthSequences; i++) {
            System.out.printf("%d ", theBestArr[i]);
        }
    }
}






