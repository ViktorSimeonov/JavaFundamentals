package _5_ListLab;

//премахване на отрицателни числа от Лист

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _0_TestList {
    public static void main(String[] args) {
        List<Integer> numbers = parseLineOfNumbers();
        /*Вариант 1 : чрез създаване на нов ЛИст но заема много място!
        List<Integer> nonNegative = new ArrayList<>();
        for (Integer number : numbers) {
            if(number>0){
                nonNegative.add(number);
            }
        }*/
        //Вариант 2 инплейс
        int i = 0;
        while (i < numbers.size()) {
            int num = numbers.get(i);
            if (num < 0) {
                numbers.remove(i);
            }else {
                i++;
            }
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static List<Integer> parseLineOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] numbersAsString = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String s : numbersAsString) {
            int number = Integer.parseInt(s);
            numbers.add(number);
        }
        return numbers;
    }
}

/*
input

2 -6 -23 9 42


*/
