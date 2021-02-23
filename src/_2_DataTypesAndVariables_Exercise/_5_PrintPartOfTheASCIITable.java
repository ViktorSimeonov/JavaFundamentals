package _2_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class _5_PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startChar = Integer.parseInt(scanner.nextLine());
        int endChar = Integer.parseInt(scanner.nextLine());
        for (int i = startChar; i <=endChar ; i++) {
            char current = (char)i;
            System.out.print(current+" ");

        }

    }
}
