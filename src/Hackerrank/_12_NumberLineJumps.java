package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class _12_NumberLineJumps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).
                mapToInt(Integer::parseInt).toArray();

       /* if v1>v2:
        while x1<x2:
        x1+=v1
        x2+=v2
        return "YES" if x1==x2 else "NO"*/
        int x1 = input[0];
        int v1 = input[1];
        int x2 = input[2];
        int v2 = input[3];
        if (v1 > v2 && ((x2 - x1) % (v2 - v1)==0)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
/*        def kangaroo(x1, v1, x2, v2):
        return "YES" if (v1 > v2) and not (x2 - x1) % (v2 - v1) else "NO"

        x1,v1,x2,v2 = map(int,input().split())
        result = kangaroo(x1, v1, x2, v2)
        print(result)*/

               /*if (x2 > x1 && v2 > v1) {
            System.out.println("NO");
        } else if (x1 > x2 && v1 > x1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }*/
    }
}
