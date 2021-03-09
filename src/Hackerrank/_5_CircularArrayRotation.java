package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class _5_CircularArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        int[] input = readArray(firstLine);
        String secondLine = scanner.nextLine();
        int[] arrA = readArray(secondLine);
        int n = input[0];
        int rotationK = input[1];
        int q = input[2];
        for (int i = 0; i < rotationK; i++) {
            int lastNum = arrA[arrA.length - 1];
            if (n - 1 >= 0) System.arraycopy(arrA, 0, arrA, 1, n - 1);
            arrA[0] = lastNum;
        }
        for (int i = 0; i < q; i++) {
            //  int x = indicesQ[i];
            int x = Integer.parseInt(scanner.nextLine());
            System.out.println(arrA[x]);
        }

    }
    private static int[] readArray(String firstLine) {
        return (Arrays.stream(firstLine.split(" ")).mapToInt(Integer::parseInt).toArray());

    }
}

