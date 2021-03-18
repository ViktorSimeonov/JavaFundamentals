package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class _11_AppleAndOrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] houseDimension = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int[] treePosition = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int[] countAppleOrange = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int[] appleDistance = Arrays.stream(scanner.nextLine().split("\\s+"))

                .mapToInt(Integer::parseInt).toArray();
        int[] orangeDistance = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int s = houseDimension[0];
        int t = houseDimension[1];
        int a = treePosition[0];
        int b = treePosition[1];
        int m = countAppleOrange[0];
        int n = countAppleOrange[1];
        int countApple = 0;
        int countOrange = 0;
        for (int i = 0; i < m; i++) {
            if ((a + appleDistance[i]) >= s && (a + appleDistance[i] <= t)) {
                countApple++;
            }
        }
        System.out.println(countApple);
        for (int i = 0; i < n; i++) {
            if ((b + orangeDistance[i] <= t && b + orangeDistance[i] >= s)) {
                countOrange++;
            }
        }
        System.out.println(countOrange);

    }
}
