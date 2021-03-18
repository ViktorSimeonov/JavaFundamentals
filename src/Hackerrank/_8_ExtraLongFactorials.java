package Hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class _8_ExtraLongFactorials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
             System.out.println(factorial(N));
    }


    static BigInteger factorial(int N) {
        // Initialize result
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = 2; i <= N; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f;
    }
}
