package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int positive = 0;
        int negative= 0;
        int zero= 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>0){
                positive++;
            }else if(arr[i]<0) {
                negative++;
            }else{
                zero++;
            }
        }
        System.out.printf("%.6f%n",positive*1.0/(arr.length));
        System.out.printf("%.6f%n",negative*1.0/(arr.length));
        System.out.printf("%.6f%n",zero*1.0/(arr.length));
    }
}

