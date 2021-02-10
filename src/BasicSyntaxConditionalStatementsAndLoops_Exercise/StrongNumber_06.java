package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int myNumber = Integer.parseInt(num);
        int length = num.length();
        String text = "";
        int sum = 1;
        int sumAll = 0;
        for (int i = 0; i < length; i++) {
            char a = num.charAt(i);
            text = text + a;
            int number = Integer.parseInt(text);
            for (int j = 1; j <= number; j++) {
                sum *= j;
                // System.out.println(sum);
            }
            text = "";
            sumAll += sum;
            sum = 1;
        }
        if (myNumber==sumAll){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
