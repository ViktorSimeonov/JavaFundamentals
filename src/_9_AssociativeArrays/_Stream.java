package _9_AssociativeArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Stream {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("cats");
        words.add("dog");
        words.add("apple");// the only one word
        words.add("orange");
        words.add("budnonethwiser");
        //how to sort and filter a List
//i want to filter the words bigger then 5 letter
        /*Stream<String> stream = words.stream();
        stream.filter(w->w.endsWith("e"));
        List<String> filtered = stream.collect(Collectors.toList());*/
        //upper is the same
        List<String> filtered = words.stream().
                filter(w->w.endsWith("e")).
                filter(w->w.length()<=5).
                collect(Collectors.toList());
//case 2
        List<String> filtered2 = words.stream()
                .filter(w->w.length()<=5)
                .map(w-> w.toUpperCase())// map е същото като transform
                .collect(Collectors.toList());
//case 3 // филтрира по малки от 5, прави ги с главни букви и ги прави с големи букви
        List<String> filtered3 = words.stream()
                .filter(w->w.length()<=5)
                .map(w-> w.toUpperCase())// map е същото като transform
                .sorted((a,b)->a.compareTo(b))
                .collect(Collectors.toList());
//case 4 // ако искаме да имаме още условия просто отваряме скоби като на метод и пишем там
        List<String> filtered4 = words.stream()
                .filter(w->{
                    System.out.println(("filter " + w));
                    return w.length()<=5;
                })
                .map(w-> w.toUpperCase())// map е същото като transform
                .sorted((a,b)->a.compareTo(b))
                .collect(Collectors.toList());
//case 5 // ако искаме да имаме още условия просто отваряме скоби като на метод и пишем там
        List<String> filtered5 = words.stream()
                .filter(w->{
                    System.out.println(("filter " + w));
                    return w.length()<=5;
                })
                .map(w-> {
                    System.out.println("map "+ w);
                    return w.toUpperCase();
                })// map е същото като transform
                .sorted((a,b)->a.compareTo(b))
                .collect(Collectors.toList());


        System.out.println(String.join(" ", filtered));
        System.out.println(String.join(" ", filtered2));
        System.out.println(String.join(" ", filtered3));
        System.out.println(String.join(" ", filtered4));
        System.out.println(String.join(" ", filtered5));
    }
}
