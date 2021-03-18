package Hackerrank;

import java.util.Scanner;

public class _9_AppendAndDelete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int k = Integer.parseInt(scanner.nextLine());
        int lengthS = s.length();
        int lengthT = t.length();
        int equal = 0;
        int notEqual = 0;
        int shorterString = Math.min(lengthS, lengthT);
        for (int i = 0; i < shorterString; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                equal++;
            } else {
                notEqual++;
            }
        }
        if(((lengthS+lengthT)-2*equal)>k){
            System.out.println("No");
        }else if(((lengthS+lengthT)-2*equal)%2==k%2){
            System.out.println("Yes");
        }/*else if(((lengthS+lengthT)-2*equal)==k){
            System.out.println("Yes");
        }*/
        else if((lengthS+lengthT-k)<=0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
