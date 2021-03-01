package Exam_28022021;

import java.util.Scanner;

public class _5_ExcursionSale {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sea = Integer.parseInt(scanner.nextLine());
        int mountain = Integer.parseInt(scanner.nextLine());
        String type;
        double win = 0;
        boolean sold = false;
        while (!"Stop".equals(type = scanner.nextLine())) {
            if (type.equals("sea") && sea != 0) {
                win += 680;
                sea -= 1;
            } else if (type.equals("mountain") && mountain != 0) {
                win += 499;
                mountain -= 1;
            }
            if (sea == 0 && mountain == 0) {
            sold=true;
            break;
            }
        }
        if (sold) {
            System.out.println("Good job! Everything is sold.");
        }
        System.out.printf("Profit: %.0f leva.", win);
    }
}
