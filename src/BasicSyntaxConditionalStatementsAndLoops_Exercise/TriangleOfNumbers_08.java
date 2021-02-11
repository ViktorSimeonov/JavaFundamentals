package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class TriangleOfNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
