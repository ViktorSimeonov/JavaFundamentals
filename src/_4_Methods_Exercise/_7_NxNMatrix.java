package _4_Methods_Exercise;

import java.util.Scanner;

public class _7_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        matrixNxN(N);
    }

    private static void matrixNxN(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
