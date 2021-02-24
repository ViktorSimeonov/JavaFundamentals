import java.util.Scanner;

public class SplitString_parseInt {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        String  numbersAsOneLine="1 3 21 14";
        // трябва да създадем масив и да запишем данните вътре
        //{1, 3, 21,14}
        String[] splitedString = numbersAsOneLine.split(" ");
        // разделителя може да бъде всякакъв "1%2*5â6", и т.н.
        int[] arr = new int[splitedString.length];
        for (int i = 0; i < splitedString.length; i++) {
            arr[i] = Integer.parseInt(splitedString[i]);
            System.out.println(arr[i]);
        }
    }
}
