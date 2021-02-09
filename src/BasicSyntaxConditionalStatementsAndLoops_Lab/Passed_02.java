package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class Passed_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float grade = Float.parseFloat(scanner.nextLine());
        if (grade >= 3){
            System.out.println("Passed!");
        }
    }
}
