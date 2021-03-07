package _4_Methods_More_Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _1_DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input) {
            case "int":
                int x = Integer.parseInt(scanner.nextLine());
                System.out.println(num(x));
                break;
            case "real":
                double y = Double.parseDouble(scanner.nextLine());
                System.out.println(new DecimalFormat("#.00").format(num(y)));
                break;
            case "string":
                String z = scanner.nextLine();
                num(z);
                break;
        }
    }

    static int num(int XX) {
        return (XX * 2);
    }

    static double num(double YY) {
        return (YY * 1.5);
    }

    static void num(String ZZ) {
        System.out.println("$"+ZZ+"$");

    }
}
