package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count= 0;
        int number =0;
        while (count <n){

            if (number%2!=0){
            System.out.println(number);
                count++;
                       sum+=number;}
            number++;
        }
        System.out.printf("Sum: %d",sum);
    }
}
