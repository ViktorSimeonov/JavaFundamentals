package Exam_28022021;

import java.util.Scanner;

public class _3_CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = Double.parseDouble(scanner.nextLine());
        String how = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());
        double sum=0;
        switch (how) {
            case "standard":
                if(weight<1){
                    sum=distance*0.03;
                }
                else if ( weight >= 1 && weight < 10){
                   sum= distance*0.05;
                }else if ( weight >= 10 && weight < 40){
                    sum= distance*0.1;
                }else if ( weight >= 40 && weight < 90){
                    sum= distance*0.15;
                }else if ( weight >= 90 && weight < 150){
                    sum= distance*0.2;
                }

                break;
            case "express":
                if(weight<1){
                    sum=distance*0.03;
                    sum+=(weight*0.8*0.03)*distance;
                }
                else if ( weight >= 1 && weight < 10){
                    sum= distance*0.05;
                    sum+=(weight*0.4*0.05)*distance;
                }else if ( weight >= 10 && weight < 40){
                    sum= distance*0.1;
                    sum+=(weight*0.05*0.1)*distance;
                }else if ( weight >= 40 && weight < 90){
                    sum= distance*0.15;
                    sum+=(weight*0.02*0.15)*distance;
                }else if ( weight >= 90 && weight < 150){
                    sum= distance*0.2;
                    sum+=(weight*0.01*0.2)*distance;
                }
                break;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",weight,sum);
    }
}
