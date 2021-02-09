package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class Division_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int divided = 0;
        if (num % 2 == 0) {
            divided = 2;
        }
        if (num % 3 == 0) {
            divided = 3;
        }
        if (num % 6 == 0) {
            divided = 6;
        }
        if (num % 7 == 0) {
            divided = 7;
        }
        if (num % 10 == 0) {
            divided = 10;
        }

        if(divided!=0) {
            System.out.printf("The number is divisible by %d", divided);
        }else {
            System.out.println("Not divisible");
        }
    }
}
