import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //6
        //1 2 3 4 10 11
        int n = Integer.parseInt(scanner.nextLine());
        String numbers = scanner.nextLine();
        String[] splitedArr = numbers.split(" ");
        int[] arr = new int[n];
        int sum=0;
        for (int i = 0; i < splitedArr.length; i++) {
            arr[i] = Integer.parseInt(splitedArr[i]);
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}

