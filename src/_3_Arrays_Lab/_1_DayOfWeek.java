package _3_Arrays_Lab;

import java.util.Scanner;

public class _1_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentDay = Integer.parseInt(scanner.nextLine());
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};
        if (currentDay >=1&&currentDay<=7) {
            System.out.printf("%s", daysOfWeek[currentDay - 1]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}
