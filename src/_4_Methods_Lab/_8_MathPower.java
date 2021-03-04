package _4_Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _8_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        int ofPower = Integer.parseInt(scanner.nextLine());
        Double resultOfMathPower = mathOfPower(x, ofPower);
        System.out.println(new DecimalFormat("0.####").format(resultOfMathPower));
    }

    public static Double mathOfPower(double x, int ofPower) {
        double result = 1;
        for (int i = 1; i <= ofPower; i++) {
            result = result * x;
        }
        return (result);
    }
}
