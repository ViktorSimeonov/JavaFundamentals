import java.util.Arrays;


public class SplitStringStream {
    public static void main(String[] args) {

        String inputLine="1 3 21 14";
        String[] items = inputLine.split(" ");
        int[] arr = Arrays.stream(items)
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        //       mapToInt(Integer::parseInt).toArray друг начин на изписването :)


    }
}
