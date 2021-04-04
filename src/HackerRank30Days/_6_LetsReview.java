package HackerRank30Days;

import java.util.Scanner;

public class _6_LetsReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j < N; j++) {
            String s = scanner.nextLine();
            String even = "";
            String odd = "";
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    even += s.charAt(i);
                } else {
                    odd += s.charAt(i);
                }
            }
            System.out.printf("%s %s%n", even, odd);


        }
    }

}
