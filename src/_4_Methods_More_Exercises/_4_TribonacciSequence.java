package _4_Methods_More_Exercises;

import java.util.Scanner;

public class _4_TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = Integer.parseInt(scanner.nextLine());
        int[] arrTribonacci = new int[index];
        //index=1
        if ((index-1) == 0 || index > 0) {
            arrTribonacci[0] = 1;
        }
        //index=2
        if ((index-1) == 1 || index > 1) {
            arrTribonacci[1] = 1;
        }
        //index=3
        if ((index-1) == 2 || index > 2) {
            arrTribonacci[2] = 2;
        }
        //index=4
        if (index-1 >= 3) {
            for (int i = 3; i <= index-1; i++) {
                arrTribonacci[i] = arrTribonacci[i - 1] + arrTribonacci[i - 2] + arrTribonacci[i - 3];
            }
        }
        printTribonachiSequence(index, arrTribonacci);
    }

    private static void printTribonachiSequence(int index, int[] arrTribonacci) {
        for (int i = 0; i < index; i++) {
            System.out.print(arrTribonacci[i] + " ");
        }
    }

}
