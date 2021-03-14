package _5_ListLab;

import java.util.ArrayList;
import java.util.Scanner;

public class _3_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");
        ArrayList<Integer> firstList = readList(input1);
        ArrayList<Integer> resultList = new ArrayList<>();
        ArrayList<Integer> secondList = readList(input2);
        if (firstList.size() > secondList.size()) {
            for (int i = 0; i < secondList.size(); i++) {
                resultList.add(firstList.get(i));
                resultList.add(secondList.get(i));

            }
            for (int i = secondList.size(); i <= firstList.size() - 1; i++) {
                resultList.add(firstList.get(i));

            }

        }
        if (firstList.size() < secondList.size()) {
            for (int i = 0; i < firstList.size(); i++) {
                resultList.add(firstList.get(i));
                resultList.add(secondList.get(i));

            }
            for (int i = firstList.size(); i <= secondList.size() - 1; i++) {
                resultList.add(secondList.get(i));

            }

        }
        if (firstList.size() == secondList.size()) {
            for (int i = 0; i < secondList.size(); i++) {
                resultList.add(firstList.get(i));
                resultList.add(secondList.get(i));

            }
        }
        for (int i = 0; i < resultList.size(); i++) {
            System.out.print(resultList.get(i) + " ");
        }


    }

    static ArrayList<Integer> readList(String[] input) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            String s = input[i];
            int x = Integer.parseInt(s);
            arrayList.add(x);
        }
        return arrayList;
    }
}
