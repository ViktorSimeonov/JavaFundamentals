package Hackerrank;

import java.util.Scanner;

public class _14_BreakingTheRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfGame = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
        int[] score = new int[input.length];
        int[] result = new int[2];
        for (int i = 0; i < input.length; i++) {
            score[i] = Integer.parseInt(input[i]);
        }
        result = minMax(score, result, numOfGame);
        for (int i : result) {
            System.out.printf(i+" ");
        }
    }

    private static int[] minMax(int[] score, int[] result, int numOfGame) {
        int minScore = score[0];
        int maxScore = score[0];
        for (int i = 1; i < score.length; i++) {
            if (minScore > score[i]) {
                minScore = score[i];
                result[1]++;
            }
            if (maxScore < score[i]) {
                maxScore = score[i];
                result[0]++;
            }
        }
        return result;
    }
}
