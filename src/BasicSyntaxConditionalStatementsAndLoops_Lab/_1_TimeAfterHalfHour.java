package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class _1_TimeAfterHalfHour {
    public static void main(String[] args) {
        //read the hours
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        //прибавяме 30 мин
        minutes = minutes+30;
        if(minutes>60){
            minutes=minutes-60;
            hours++;
        }
        if(hours>23){
            hours=0;
        }
        // Принтрираме новото време

        System.out.printf("%d:%02d",hours,minutes);


    }
}
