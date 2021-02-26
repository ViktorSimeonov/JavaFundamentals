package _3_Arrays_More_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _1_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int[] letterSum = new int[num];
        for (int i = 0; i < num; i++) {
            String str = scanner.nextLine();
            sum=0;
            for (int j = 0; j < str.length(); j++) {
                char chaCurrent = str.charAt(j);
                if (chaCurrent == 'a' || chaCurrent == 'A' || chaCurrent == 'e' || chaCurrent == 'E' || chaCurrent == 'o' || chaCurrent == 'O' ||
                        chaCurrent == 'u' || chaCurrent == 'U' || chaCurrent == 'i' || chaCurrent == 'I') {

                    sum += (str.charAt(j) * str.length());
                } else {
                    sum += (str.charAt(j) / str.length());
                }
            }
            letterSum[i]=sum;
        }
        Arrays.sort(letterSum);
        for (int let=0 ; let <=letterSum.length-1;let++) {
            System.out.println(letterSum[let]);
        }
    }
}

