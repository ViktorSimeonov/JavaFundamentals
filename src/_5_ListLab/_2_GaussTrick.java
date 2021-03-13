package _5_ListLab;

import java.util.ArrayList;
import java.util.Scanner;

public class _2_GaussTrick {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = readList();
        for (int i = 0; i < arrList.size()-1; i++) {
            int first = arrList.get(i);
            int last = arrList.get(arrList.size() - 1);
            int sum = first + last;
            arrList.set(i, sum);
            arrList.remove(arrList.size() - 1);
        }
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i)+" ");
        }
    }

    private static ArrayList<Integer> readList() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] string = input.split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < string.length; i++) {
            String s = string[i];
            int x = Integer.parseInt(s);
            numbers.add(x);
        }
        return (numbers);
    }
}
