package Hackerrank;
import java.util.Arrays;
import java.util.Scanner;

public class
_6_SequenceEquation {
    public static void main(String[] args) {
        /* Create function: p_inverse */
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] p_inverse = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int x = 1; x <= n; x++) {
            for (int i = 0; i < n; i++) {
                //търсим на коя позиция е 1;
                if (p_inverse[i] == x) {
                    //взимаме позицията и търсим числото което е равно на позицията
                    for (int j = 0; j < n; j++) {
                        if (p_inverse[j] == (i+1)) {
                            System.out.println(j+1);
                            break;
                        }
                    }
                }
            }
        }
    }
}
 /*   It took me a while to find this as well, so I'll leave this here for others facing the same frustration. Let's use sample input 0 as our example.

        the input is:

        3

        2 3 1

        Our expected output is also [2, 3, 1]

        The first value 3 in our input is the length of the list, so it's not important for the purpose of finding our objective.

        Our list, [2, 3, 1] needs to be used to define a new list. The new list starts from the minimum of the list (1), and ends with the maximum of the list (3).

        Starting with x=1, we need to find the index of the value 1 in our input list, with 1 base indexing. 1 is the 3rd number in our input list. Now we take that index, 3, and we find its value in our list. 3 is the second value, so we take 2 and start our new list with it.

        Now let's do 2. 2 is the first value in our list, so we use index 1. The value of that 1 appears in our input list at position 3. We add 3 to our output list, so our output now looks like [2, 3]

        Finally, we are at 3, the last iteration of the length of our input list. 3 is at position 2 of our input list, so we find the value of 2 in the input list. 2 is the first value, so we add that index to our output list, which is now [2, 3, 1]

        We've matched our output expectation.

        In summary: Using the range of your input, start from 1 and end with the max. For each number in this range, find it in the input, find the value of it's index in the list, and append that index to your list. Repeat until you have reached the max value of the range of your input.*/