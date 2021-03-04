package Hackerrank;

import java.util.Scanner;

public class _4_TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] time = scanner.nextLine().split(":");
        int hours;
        int pm = 0;
        char a = 0;
        char b = 0;
        for (int i = 0; i < time.length; i++) {
            hours = Integer.parseInt(time[0]);
            int sec;
            int sec1;
            if (i == time.length - 1) {
                char[] am = time[i].toCharArray();
                for (int j = 0; j < am.length - 1; j++) {
                    if (j == 0) {
                        sec = time[2].charAt(j);
                        a = (char) sec;
//                       System.out.print(sec-48);
//                        sec = (sec - 48) * 10;
                    }
                    if (j == 1) {
                        sec1 = time[2].charAt(j);
//                        sec = sec + (sec1 - 48);
                        b = (char) sec1;
                    }
                    if (j == 2) {
                        pm = time[2].charAt(j);
                        if (pm == 80) {
                            hours += 12;
                            if (hours == 24) {
                                hours = 0;
                                System.out.print("12" + ":" + time[1] + ":" + a + b);
                            } else {
                                System.out.print(hours + ":" + time[1] + ":" + a + b);
                            }
                        } else if (pm == 65) {
                            if (hours == 12) {

                                System.out.print("00" + ":" + time[1] + ":" + a + b);
                            } else if (hours == 0) {
                                System.out.print("00" + ":" + time[1] + ":" + a + b);
                            } else {
                                System.out.print(hours + ":" + time[1] + ":" + a + b);

                            }
                        }
                    }
                }
            }
        }
    }
}

