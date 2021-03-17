package _5_ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _5_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] bombNum = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int value = bombNum[0];
        while (input.contains(value)) {
            int index = input.indexOf(value);
            int power = bombNum[1];
            int startIndex = index - power;
            int endIndex = index + power;
            if (endIndex > (input.size() - 1)) {
                endIndex = input.size() - 1;
            }
            if (startIndex < 0) {
                startIndex = 0;
            }
            for (int j = endIndex; j >= startIndex; j--) {
                input.remove(j);
            }
        }
        int sum = 0;
        for (Integer integer : input) {
            sum += integer;
        }
        System.out.println(sum);

    }
}
