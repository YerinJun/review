package assignments;

import java.util.Scanner;

public class SimpleCalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final int MAX_LENGTH = 10;
    int[] v1 = new int[MAX_LENGTH];
    int[] v2 = new int[MAX_LENGTH];
    int[] result = new int[MAX_LENGTH];
    String[] operator = new String[MAX_LENGTH];

    System.out.println("Welcome to simple calculator!");
    for (int i = 0; i < MAX_LENGTH; i++) {
      System.out.print("Enter first value. ");
      v1[i] = Integer.parseInt(keyboard.nextLine());
      System.out.print("Enter second value. ");
      v2[i] = Integer.parseInt(keyboard.nextLine());
      System.out.print("Enter operator. [ + - * / ] ");
      operator[i] = keyboard.nextLine();

      result[i] = 0;
      if (operator[i].equals("+")) {
        result[i] = v1[i] + v2[i];
      } else if (operator[i].equals("-")) {
        result[i] = v1[i] - v2[i];
      } else if (operator[i].equals("*")) {
        result[i] = v1[i] * v2[i];
      } else if (operator[i].equals("/")) {
        result[i] = v1[i] / v2[i];
      } else {
        System.out.println("Should've entered one of the following : + - * / ");
        return;
      } 
      System.out.printf("%d %s %d = %d%n", v1[i], operator[i], v2[i], result[i]);

      System.out.print("Keep using simple calculator? (y/n) ");
      String input = keyboard.nextLine();
      if (input.equalsIgnoreCase("n") || input.length() == 0) {
        System.out.println("Thanks for using simple calculator, Goodbye!");
        break;
      }
    }
    keyboard.close();
  }
}