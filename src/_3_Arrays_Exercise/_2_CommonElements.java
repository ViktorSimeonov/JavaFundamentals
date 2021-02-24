package _3_Arrays_Exercise;

import java.util.Scanner;

public class _2_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        String[] word1 = first.split(" ");
        String[] word2 = second.split(" ");
        for (int i = 0; i < word2.length; i++) {
            for (int j = 0; j < word1.length; j++) {
                if (word2[i].equals(word1[j])){
                    System.out.print(word2[i]+" ");
                }
            }
            //System.out.println(word1[i]);
        }


    }
}
