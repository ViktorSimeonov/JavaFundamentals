package Hackerrank;

import java.util.Scanner;

public class _10_GradingStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade < 38) {
                System.out.println(grade);
            } else {
                int result = grade % 5;
                if (result < 3) {
                    System.out.println(grade);
                } else {
                    double result1 = Math.ceil(grade * 1.0 / 5);
                    double grade1 = result1 * 5;
                    System.out.printf("%.0f%n", grade1);
                }
            }
        }
    }
}
