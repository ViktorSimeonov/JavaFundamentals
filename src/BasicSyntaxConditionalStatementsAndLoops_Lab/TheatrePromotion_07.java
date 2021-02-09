package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;
        switch (typeDay) {
            case "Weekday":
                if (0 <= age && age <= 18){
                    price=12;
                }
                else if (18 < age && age <= 64){
                    price=18;
                }
                else if (64 < age && age <= 122){
                    price=12;
                }else {
                    System.out.println("Error!");
                }
                    break;
            case "Weekend":
                if (0 <= age && age <= 18){
                    price=15;
                }
                else if (18 < age && age <= 64){
                    price=20;
                }
                else if (64 < age && age <= 122){
                    price=12;
                }else {
                    System.out.println("Error!");
                }
                break;
            case "Holiday":
                if (0 <= age && age <= 18){
                    price=5;
                }
                else if (18 < age && age <= 64){
                    price=12;
                }
                else if (64 < age && age <= 122){
                    price=10;
                }else {
                    System.out.println("Error!");
                }
                break;
            default:

                break;
        }
        if (price!=0){
            System.out.printf("%d$",price);
        }
    }
}
