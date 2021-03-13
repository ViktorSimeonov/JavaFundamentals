package _5_ListLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        ArrayList<Double> numbers = newList();
        //Вариант 1
        /*boolean search = true;
        while (search) {
            search=false;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i).equals(numbers.get(i + 1))) {
                    search=true;
                    numbers.set(i, (numbers.get(i) * 2));
                    numbers.remove(i + 1);
                    break;
                }

            }

        }*/
        //вариант 2
        int i = 0;
        while (i < numbers.size()-1) {
            double current = numbers.get(i);
            double next = numbers.get(i+1);
            if (current==next) {
                numbers.remove(i);
                numbers.set(i, (current+next));
                i=0;
            }else {
                i++;
            }
        }
        printList(numbers);
    }

    private static ArrayList<Double> newList() {
        Scanner scanner = new Scanner(System.in);
//        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
//        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String num = scanner.nextLine();
        String[] numbers = num.split(" ");
        ArrayList<Double> newList = new ArrayList<>();
        for (int i = 0, numbersLength = numbers.length; i < numbersLength; i++) {
            String s = numbers[i];
            double x = Double.parseDouble(s);
            newList.add(x);
        }
        return newList;
    }

    private static void printList(ArrayList<Double> numbers) {
        for (Double number : numbers) {

            System.out.print(new DecimalFormat("#.#").format(number)+" ");
        }
    }


}
