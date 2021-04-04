package HackerRank30Days;

import java.util.Scanner;

public class _3_IntroToConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num % 2 != 0) {
            System.out.println("Weird");
        } else if (num >= 2 && num <= 5) {
            System.out.println("Not Weird");
        } else if (num >= 6 && num <= 20) {
            System.out.println("Weird");
        } else if (num>20){
            System.out.println("Not Weird");

        }
    }

}
