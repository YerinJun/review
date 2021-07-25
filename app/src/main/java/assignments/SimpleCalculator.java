package assignments;

import java.util.Scanner;

public class SimpleCalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter fist value. ");
    int v1 = Integer.parseInt(keyboard.nextLine());
    System.out.print("Enter second value. ");
    int v2 = Integer.parseInt(keyboard.nextLine());
    System.out.print("Enter operator. ( +, -, *, / ) ");
    String operator = keyboard.nextLine();
    keyboard.close();

    int result = 0;
    if (operator.equals("+")) {
      result = v1 + v2;
    } else if (operator.equals("-")) {
      result = v1 - v2;
    } else if (operator.equals("*")) {
      result = v1 * v2;
    } else if (operator.equals("/")) {
      result = v1 / v2;
    } else {
      System.out.println("Please, choose one of +, -, *, / operators.");
      return;
    }

    System.out.printf("%d %s %d = %d", v1, operator, v2, result);
  }
}
