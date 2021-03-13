package _5_ListLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetGetRemove_fromList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        System.out.println(numbers.size());
        //in this way we always adding the element at last index
        numbers.add(7);
        numbers.add(0);
        numbers.add(9);
//if we wont to add an element on exact Index, then
        numbers.add(2,7);
        //ще премахне нулевия индекс
        numbers.remove(0);
        //премахва стойността нула!
        numbers.remove(Integer.valueOf(0));
        //взимане на стойност на нулевия индекс
        int x = numbers.get(0);
        System.out.println(numbers.get(0));
        //промяна на стойност в листа index 1 new value 5
        numbers.set(1, 5);
        System.out.println();

    }
}