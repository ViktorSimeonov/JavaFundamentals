package _2_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class _11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        double theBiggest = 0;
        byte theSnow =0;
        short theTime = 0;
        short theQuality = 0;
        for (int i = 0; i < N; i++) {
            byte snowSnowball = Byte.parseByte(scanner.nextLine());
            short timeSnowball = Short.parseShort(scanner.nextLine());
            short qualitySnowball = Short.parseShort(scanner.nextLine());
            double valueSnowball = Math.pow((snowSnowball * 1.0 / timeSnowball), qualitySnowball);
            if (valueSnowball >= theBiggest) {
                theBiggest = valueSnowball;
                theSnow=snowSnowball;
                theTime=timeSnowball;
                theQuality=qualitySnowball;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",theSnow,theTime,theBiggest,theQuality);
    }
}
