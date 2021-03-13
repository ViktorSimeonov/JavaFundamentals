package _5_ListLab;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _0_ReadList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        for (Integer number : numbers) {
            System.out.print(number+" ");
        }
        System.out.println();
        System.out.println(numbers.size());
    }
}

/*
input
4
2 3 - 34 54

*/
