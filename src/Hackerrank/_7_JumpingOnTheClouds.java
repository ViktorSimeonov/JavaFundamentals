package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class _7_JumpingOnTheClouds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int e = 100;
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] clouds = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        for (int i = 0; i < e; i += input[1]) {

            count++;
            e -= 1;
            if ((i + input[1]) == input[0]) {
                if (clouds[0] == 1) {
                    e -= 2;
                }
                break;
            } else if ((i + input[1]) > input[0]) {
                i = (i + input[1]) - (clouds.length);
                if (clouds[i] == 1) {
                    e -= 2;
                }
                count++;

                if (clouds[i + input[1]] == 1) {
                    e -= 2;
                }
            }
            if (clouds[i + input[1]] == 1) {
                e -= 2;
            }
        }
        System.out.println(e);

    }
}



