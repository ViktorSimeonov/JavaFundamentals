package Hackerrank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _4_TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] time = scanner.nextLine().split(":");
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        String secAmPm = time[2];
        String sec = secAmPm.substring(0, 2);
        int secInt = Integer.parseInt(sec);
        String amPM = secAmPm.substring(2, 4);
        switch (amPM) {
            case "AM":
                if (hours == 0 && minutes == 0 && secInt == 0) {
                    hours = 24;
                }
                if(hours==12){
                    hours=0;
                }
                break;
            case "PM":
                hours = hours + 12;
                if (hours == 24) {
                    hours = 12;
                }
                break;
        }

        System.out.print(new DecimalFormat("#00:").format(hours));
        System.out.print(new DecimalFormat("#00:").format(minutes));
        System.out.print(new DecimalFormat("#00").format(secInt));
    }
}

