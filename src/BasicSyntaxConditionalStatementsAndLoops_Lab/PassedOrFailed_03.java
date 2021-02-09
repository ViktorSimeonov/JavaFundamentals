package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class PassedOrFailed_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float grade = Float.parseFloat(scanner.nextLine());
        if (grade >= 3){
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }
    }
}
