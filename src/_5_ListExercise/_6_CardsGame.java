package _5_ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class  _6_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+")).
                map(Integer::parseInt).collect(Collectors.toList());
        while (!(firstPlayer.isEmpty() || secondPlayer.isEmpty())) {
            int fist = firstPlayer.get(0);
            int second = secondPlayer.get(0);
            if (fist == second) {
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            }else if(fist>second){
                firstPlayer.add(fist);
                firstPlayer.add(second);
                firstPlayer.remove(0);
                secondPlayer.remove(0);

            }else{
                secondPlayer.remove(0);
                firstPlayer.remove(0);
                secondPlayer.add(second);
                secondPlayer.add(fist);
            }

        }int sum=0;
        if(!firstPlayer.isEmpty()){
            for (Integer integer : firstPlayer) {
                sum+=integer;
            }
            System.out.printf("First player wins! Sum: %d",sum);
        }else {
            for (Integer integer : secondPlayer) {
                sum+=integer;
            }
            System.out.printf("Second player wins! Sum: %d",sum);
        }
    }
}
