package _2_DataTypesAndVariables_Exercise;

import java.util.Scanner;

public class _7_WaterOverflow {
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int n = Integer.parseInt(scanner.nextLine());
      int capacity = 255;
      for (int i = 0; i < n; i++) {
         int deliveredQuantity = Integer.parseInt(scanner.nextLine());
         if (capacity >= deliveredQuantity){
             capacity-=deliveredQuantity;
         }else {
             System.out.println("Insufficient capacity!");
         }
      }
      System.out.println(255-capacity);
  }
}


