package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        hours = 60 * hours;
        int timeNow = minutes + hours;
        int timeAfter30Min = timeNow + 30;
        int newHours = timeAfter30Min / 60;
        int newMinutes = timeAfter30Min % 60;
        if (newHours > 23) {
            newHours = 0;
        }
        System.out.printf("%d:%02d%n",newHours,newMinutes);
//        System.out.printf("%d:", newHours);
//        if (newMinutes <= 9) {
//            System.out.printf("0%d", newMinutes);
//        }else {
//            System.out.printf("%d", newMinutes);
//        }


    }
}
