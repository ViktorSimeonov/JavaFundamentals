package _8_MidExam;

import java.util.Scanner;

public class _1_SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //students per hour
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int allStudents = Integer.parseInt(scanner.nextLine());
        int allForHour = first + second + third;
        int hoursNeeded=0;
        int i=0;
        while (allStudents>0){
            i++;
            if(i%4==0){
                hoursNeeded++;
                continue;
            }

            hoursNeeded++;
            allStudents = allStudents-allForHour;

        }
        System.out.printf("Time needed: %dh.%n", (hoursNeeded));

    }
}
