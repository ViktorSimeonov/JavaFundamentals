package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class _17_MigratoryBirds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        System.out.println(theNum(numbers));
    }

    private static int theNum(int[] numbers) {
        int sameNum = 0;
        int currentMaxNum = 0;
        int currentMaxSameNum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] ){
                    sameNum++;
                }
            }
            if(sameNum>currentMaxSameNum){
                currentMaxSameNum=sameNum;
                currentMaxNum=numbers[i];
            }else if(sameNum==currentMaxSameNum){
                if(currentMaxNum>=numbers[i]){
                    currentMaxNum=numbers[i];
                }
            }sameNum=0;
        }
        return currentMaxNum;
    }
}
