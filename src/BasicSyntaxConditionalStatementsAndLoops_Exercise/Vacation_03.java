package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double totalPrice = 0;
        switch (dayOfWeek) {
            case "Friday":
                switch (typeGroup) {
                    case "Students":
                        if (number >= 30) {
                            totalPrice = (number * 8.45) * 0.85;
                        }else {
                            totalPrice = (number * 8.45);
                        }
                        break;
                    case "Business":
                        if (number >= 100) {
                            number -= 10;
                            totalPrice = (number * 10.90);
                        }else {
                            totalPrice = (number * 10.90);
                        }
                        break;
                    case "Regular":
                        if (number >= 10 && number <= 20) {
                            totalPrice = (number * 15) * 0.95;
                        }else {
                            totalPrice = (number * 15);
                        }

                        break;
                }
                break;
            case "Saturday":
                switch (typeGroup) {
                    case "Students":
                        if (number >= 30) {
                            totalPrice = (number * 9.80) * 0.85;
                        }else {
                            totalPrice = (number * 9.80);
                        }
                        break;
                    case "Business":
                        if (number >= 100) {
                            number -= 10;
                            totalPrice = (number * 15.60);
                        }else {
                            totalPrice = (number * 15.60);
                        }
                        break;
                    case "Regular":
                        if (number >= 10 && number <= 20) {
                            totalPrice = (number * 20) * 0.95;
                        }else {
                            totalPrice = (number * 20);
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (typeGroup) {
                    case "Students":
                        if (number >= 30) {
                            totalPrice = (number * 10.46) * 0.85;
                        }else {
                            totalPrice = (number * 10.46);
                        }
                        break;
                    case "Business":
                        if (number >= 100) {
                            number -= 10;
                            totalPrice = (number * 16);
                        }else {
                            totalPrice = (number * 16);
                        }
                        break;
                    case "Regular":
                        if (number >= 10 && number <= 20) {
                            totalPrice = (number * 22.50) * 0.95;
                        }else {
                            totalPrice = (number * 22.50);
                        }
                        break;
                }
                break;

        }
        System.out.printf("Total price: %.2f",totalPrice);
    }
}
