package _5_ListLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        //Create a list of strings
        names.add("Peter");
        //add element
        names.add("Maria");
        names.add("Tosho");
        names.add("Gosho");
        //remove an element
        names.remove("Tosho");
        for (String name : names) {
            System.out.println(name);
        }

    }
}
