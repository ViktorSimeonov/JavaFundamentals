package HackerRank30Days;

import java.util.Scanner;

public class _5_Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n",n,i,(n*i));
        }
    }

}
