package _4_Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int y = Integer.parseInt(scanner.nextLine());
        double result = calculate(x,operator,y);
        System.out.println(new DecimalFormat("0.##").format(result));

    }

    private static double calculate(int x, String operator, int y) {
        double result = 0.0;
        switch (operator) {
            case "/":
                result = x * 1.0 / y;
                break;
            case "*":
                result = x * y;
                break;
            case "-":
                result = x - y;
                break;
            case "+":
                result = x + y;
                break;

        }
        return (result);
    }
}
