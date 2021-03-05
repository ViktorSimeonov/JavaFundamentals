package _4_Methods_Lab;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] arrey = getArray();
        for (int i : arrey) {
            System.out.println(arrey[i]);
            System.out.println(i+"  hm");
            System.out.println(arrey);
        }
    }
    public static int[] getArray() {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        return a;
    }

}
