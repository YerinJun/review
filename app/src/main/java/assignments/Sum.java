package assignments;

import java.util.Scanner;
public class Sum {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter starting number. ");
    int startNo = Integer.parseInt(keyboard.nextLine());
    System.out.print("Enter end number. ");
    int lastNo = Integer.parseInt(keyboard.nextLine());
    keyboard.close();

    int sum = 0;
    for (int i = startNo; i <= lastNo; i++) {
      sum += i;
    }
    System.out.printf("Sum of consecutive numbers between %d and %d is %d", startNo, lastNo, sum);
  }
}
