public class PrintArray {
    public static void main(String[] args) {
        String numbersAsOneLine = "1 3 21 14";
        // трябва да създадем масив и да запишем данните вътре
        //{1, 3, 21,14}
        String[] splitedString = numbersAsOneLine.split(" ");
        // разделителя може да бъде всякакъв "1%2*5â6", и т.н.
        int[] arr = new int[splitedString.length];
        for (int i = 0; i < splitedString.length; i++) {
            arr[i] = Integer.parseInt(splitedString[i]);
            System.out.println(arr[i]);
        }
        // друг начин  Arrays.stream(arr).forEach(System.out::println);
        // System.out.println(String.join(" ",arr)); // друг начин за принт
            //Foreach Loop
        //int[] numbers = { 1, 2, 3, 4, 5 };
        //for (int number : numbers) {
        //   System.out.println(number + " ");
        //}
    }
}
