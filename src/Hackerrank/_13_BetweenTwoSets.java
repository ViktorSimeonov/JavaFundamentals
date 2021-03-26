package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class _13_BetweenTwoSets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensionOfArrays = Arrays.stream(scanner.nextLine().split(" ")
        ).mapToInt(Integer::parseInt).toArray();
        int[] firstArr = Arrays.stream(scanner.nextLine().split(" ")
        ).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int N1 = firstArr[firstArr.length - 1];
        int N2 = secondArr[0];
        int countNums = 0;
        for (int i = N1; i <= N2; i++) {
            if (getTotalIX(i, firstArr, secondArr)) {
                countNums++;
            }


        }
        System.out.println(countNums);

    }

    private static Boolean getTotalIX(int i, int[] firstArr, int[] secondArr) {
        boolean isNum = false;
        boolean firstIsNot = false;
        boolean secondIsNot = false;
        for (int j = 0; j < firstArr.length; j++) {
            if (i % firstArr[j] != 0) {
                firstIsNot = true;
                break;
            }
        }
        for (int j = 0; j < secondArr.length; j++) {
            if (secondArr[j] % i != 0) {
                secondIsNot = true;
                break;
            }
        }
        if (firstIsNot || secondIsNot) {
            isNum = false;
        } else {
            isNum = true;
        }

        return isNum;
    }

}
