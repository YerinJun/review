package assignments;

import java.util.Scanner;
public class Sum {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter start number to sum. ");
    int startNo = Integer.parseInt(keyboard.nextLine());
    System.out.print("Enter last number to sum. ");
    int lastNo = Integer.parseInt(keyboard.nextLine());
    keyboard.close();

    int sum = 0;
    for (int i = startNo; i <= lastNo; i++) {
      sum += i;
    }
    System.out.printf("Sum from %d to %d is %d", startNo, lastNo, sum);
  }
}
