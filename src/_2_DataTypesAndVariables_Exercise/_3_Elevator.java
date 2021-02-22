package _2_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class _3_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        // double courses = (double)people/capacity;
        double courses = people*1.0/capacity;
        System.out.printf("%.0f",Math.ceil(courses));
        //System.out.println((int)courses);


    }
}
