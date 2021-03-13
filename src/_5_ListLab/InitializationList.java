
package _5_ListLab;

import java.util.ArrayList;
import java.util.Scanner;

public class InitializationList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        //инициализиране с данни
       /* List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
       ако искам да имам Лист но да е точно като Арей и да не можем да добавяме данни
       List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50, 60);
*/


        //чете от конзолата интиджър без значение с какво са разделени
        int num = scanner.nextInt();
        while (num != 0) {
            numbers.add(num);
            num = scanner.nextInt();
        }
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");

        }

    }
}

/*
input
        1
        2 3
        4 0 5 1
        2 3
*/
