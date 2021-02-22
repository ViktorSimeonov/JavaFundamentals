package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _6_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int[] arrInt1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //int[] arrInt1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String firstString = scanner.nextLine();
        String[] firstArr = firstString.split(" ");
        int[] arrInt1 = new int[firstArr.length];
        for (int i = 0; i < firstArr.length; i++) {
            arrInt1[i] = Integer.parseInt(firstArr[i]);
        }
        String secondString = scanner.nextLine();
        String[] secondArr = secondString.split(" ");
        int[] arrInt2 = new int[secondArr.length];
        for (int i = 0; i < secondArr.length; i++) {
            arrInt2[i]=Integer.parseInt(secondArr[i]);
        }
        int sum=0;
        boolean notEqual = false;
        // I can use and the code from above just have to replace (firstArr whit arrInt1 ) and ready
        if(firstArr.length==secondArr.length) {
            for (int i = 0; i < arrInt1.length; i++) {
                if (arrInt1[i]==arrInt2[i]){
                    sum+=arrInt1[i];
                }else{
                    System.out.printf("Arrays are not identical. Found difference at %d index.%n",i);
                    notEqual=true;
                    break;
                }
            }
            if(!notEqual){
                System.out.printf("Arrays are identical. Sum: %d",sum);
            }
        }
    }
}

