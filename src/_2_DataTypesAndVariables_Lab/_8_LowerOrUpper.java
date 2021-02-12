package _2_DataTypesAndVariables_Lab;

import java.util.Scanner;

public class _8_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int letter = scanner.next().charAt(0);
        if (65 <= letter && letter <= 90) {
            System.out.println("upper-case");
        } else if (97 <= letter && letter <= 122)
            System.out.println("lower-case");
    }
}
