package _8_MidExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _3_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        double sum = 0;
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            nums.add(Integer.parseInt(input[i]));
            sum += nums.get(i);
            count++;
        }
        double result = sum / count;
        List<Integer> sortArr = new ArrayList<>();
        int biggerThen = 0;
        for (Integer num : nums) {
            if (num > result) {
                sortArr.add(num);
                biggerThen++;
            }
        }
        Collections.sort(sortArr);
        Collections.reverse(sortArr);
        if (biggerThen == 0) {
            System.out.println("No");
        } else if (biggerThen>5){
            for (int i = 0; i < 5; i++) {
                System.out.print(sortArr.get(i) + " ");
            }
        }else{
            for (int i = 0; i < biggerThen; i++) {
                System.out.print(sortArr.get(i) + " ");
            }
        }


    }
}
