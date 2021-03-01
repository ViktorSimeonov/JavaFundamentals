package Exam_28022021;

import java.util.Scanner;

public class _6_Substitute {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int K;
        int M;
        int count = 0;
        boolean ready=false;
        for (int i = k; i <= 8; i++) {
            if(ready){
                break;
            }
            for (int j = 9; j >= l; j--) {
                if(ready){
                    break;
                }
                for (int o = m; o <= 8; o++) {
                    if(ready){
                        break;
                    }
                    for (int p = 9; p >= n; p--) {
                        if(ready){
                            break;
                        }
                        if (i % 2 == 0 && j % 2 != 0 && o % 2 == 0 && p % 2 != 0) {

                            K = (i * 10) + j;
                            M = (o * 10) + p;
                            if (M == K) {
                                System.out.println("Cannot change the same player.");
                            } else {
                                System.out.printf("%d - %d%n", K, M);
                                count++;
                            }
                            if (count == 6) {
                                ready=true;
                                break;
                            }
                        }
                    }

                }
            }
        }

    }
}

