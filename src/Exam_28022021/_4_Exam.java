package Exam_28022021;

import java.util.Scanner;

public class _4_Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int student = Integer.parseInt(scanner.nextLine());
        int rez1=0;
        int rez2=0;
        int rez3=0;
        int rez4=0;
        double average=0;

        for (int i = 1; i <= student; i++) {
            double result = Double.parseDouble(scanner.nextLine());
            average+=result;
            if (result >= 2 && result < 3) {
                rez1++;
            }else if (result >= 3 && result < 4){
                rez2++;
            }else if (result >= 4 && result < 5){
                rez3++;
            }else if (result >= 5 ){
                rez4++;
            }
        }
        double rez44 = (rez4*1.0/student)*100;
        double rez33 = (rez3*1.0/student)*100;
        double rez22 = (rez2*1.0/student)*100;
        double rez11 = (rez1*1.0/student)*100;

        System.out.printf("Top students: %.2f%%%n",rez44);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",rez33);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",rez22);
        System.out.printf("Fail: %.2f%%%n",rez11);
        System.out.printf("Average: %.2f%n",(average/student));
    }
}
