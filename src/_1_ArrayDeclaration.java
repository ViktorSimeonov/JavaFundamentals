import java.util.Arrays;
import java.util.Scanner;

public class _1_ArrayDeclaration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declaration of array
        int[] array = new int[4];
        // or
        int[] array1 = {1, 2, 5, 7};
        //print from array1 the number with index[0]
        System.out.println(array1[0]);
        //if we want the last number in our case 7 index 3
        System.out.println(array1[array1.length - 1]);
        // filling the array with data
        int[] array2 = new int[5];
//        for (int i = 0; i < 5; i++) {
//            array2[i] = Integer.parseInt(scanner.nextLine());
//            //another way to fill array
//            //
//        }
        //creating an Array from a stream - 2 3 4 5 7 54 76
        //the result is "2" "3" "4" and so on... in int type
        int[] array3 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

        //split of String - "Viktor Petya Tori" result is "Viktor" "Petya" "Tori"
        //String[] words = scanner.nextLine().split(" ");

        for (int number:array3) {
            System.out.println(number);
        }

    }
}
