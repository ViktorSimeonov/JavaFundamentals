package Exam_28022021;

import java.util.Scanner;

public class _1_CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fat = Integer.parseInt(scanner.nextLine());
        int protein = Integer.parseInt(scanner.nextLine());
        int vaglehidrati = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());
        int water = Integer.parseInt(scanner.nextLine());
        double resultFat = ((calories*fat)*1.0/9) + ((calories*protein)*1.0/4)+ ((calories*vaglehidrati)*1.0/4);
        double cal = calories/resultFat*100;
        cal*=(100-water)*0.01;
        System.out.printf("%.4f",cal);
    }
}
