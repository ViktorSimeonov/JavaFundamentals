package _4_Methods_More_Exercises;

import java.util.Scanner;

public class _3_LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());
        longestLine(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    private static void longestLine(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double firstPoint = lengthLine(x1, y1);
        double secondPoint = lengthLine(x2, y2);
        double thirdPoint = lengthLine(x3, y3);
        double fourthPoint = lengthLine(x4, y4);
        double firstAngle = sinFromAngel(y1, firstPoint);
        double secondAngle = sinFromAngel(y2, secondPoint);
        double thirdAngle = sinFromAngel(y3, thirdPoint);
        double fourthAngle = sinFromAngel(y4, fourthPoint);
        double firstLineAngle;
        double secondLineAngle;
        if(x1>=0&y1>=0&&x2<=0&y2<=0||x1<=0&y1<=0&&x2>=0&y2>=0){
             firstLineAngle = 270 - firstAngle - secondAngle;
        }else{
             firstLineAngle = 180 - firstAngle - secondAngle;
        }
        if(x3>=0&y3>=0&&x4<=0&y4<=0||x3<=0&y3<=0&&x4>=0&y4>=0){
             secondLineAngle = 270 - thirdAngle - fourthAngle;
        }else {
             secondLineAngle = 180 - thirdAngle - fourthAngle;
        }
        double firstLineLength = Math.sqrt(Math.pow(firstPoint, 2) + Math.pow(secondPoint, 2) - (2 * firstPoint * secondPoint * Math.cos(firstLineAngle)));
        double secondLineLength = Math.sqrt(Math.pow(thirdPoint, 2) + Math.pow(fourthPoint, 2) - (2 * thirdPoint * fourthPoint * Math.cos(secondLineAngle)));
        if (firstLineLength > secondLineLength) {
            printLongerLine(x2, y2, x1, y1);
        } else if (firstLineLength < secondLineLength){
            printLongerLine(x4, y4, x3, y3);
        }else{
            printLongerLine(x2, y2, x1, y1);
        }

    }

    private static void printLongerLine(int x1, int y1, int x2, int y2) {
        System.out.printf("(%d, %d)(%d, %d)%n", x1, y1, x2, y2);
    }


    private static double sinFromAngel(double y, double line) {
        return (Math.toDegrees(Math.asin(Math.abs(y) / line)));
    }


    private static double lengthLine(int x, int y) {
        return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }


}
