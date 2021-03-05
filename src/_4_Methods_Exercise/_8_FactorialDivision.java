package _4_Methods_Exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _8_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        factorial(x, y);
    }

    private static void factorial(int x, int y) {
        double result = factorialX(x) / factorialY(y);
        System.out.print(new DecimalFormat( "##.00").format(result));
    }
    static double factorialX(int x) {
        double resultX=x;
        for (int i = 1; i < x; i++) {
            resultX*=(x-i);
        }
        return (resultX);
    }
    static double factorialY(int y) {
        double resultY=y;
        for (int i = 1; i < y; i++) {
            resultY*=(y-i);
        }
        return (resultY);
    }
}


