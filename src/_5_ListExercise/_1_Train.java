package _5_ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] command = input.split(" ");
            if (command[0].equals("Add")) {
                numbers.add(Integer.parseInt(command[1]));
            }else {
                int passengers = Integer.parseInt(command[0]);
                for (int i = 0; i < numbers.size(); i++) {
                    int freePlaces = maxCapacity-(numbers.get(i));
                    if(freePlaces>=passengers){
                        int currentNum = numbers.get(i)+passengers;
                        numbers.set(i, currentNum);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
            if(input.equals("end")){
                for (Integer number : numbers) {
                    System.out.print(number+" ");

                }
            }
        }
    }
}
