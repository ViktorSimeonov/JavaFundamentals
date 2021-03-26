package _9_AssociativeArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _Lambda {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("cats");
        words.add("dog");
        words.add("apple");
        words.add("orang  e");
        words.add("budnonethwiser");
//Todo test :)
        /*Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });*/
        //this code is the same as the upper one
        Collections.sort(words, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

        System.out.println(String.join(" ",words));
    }
}
