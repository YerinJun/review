package review.util;

import java.sql.Date;
import java.util.Scanner;

public class Prompt {
  public static Scanner keyboard = new Scanner(System.in);

  public static String inputString(String title) {
    System.out.print(title);
    return keyboard.nextLine();
  }
  public static int inputInt(String title) {
    return Integer.parseInt(inputString(title));
  }
  public static Date inputDate(String title) {
    return Date.valueOf(inputString(title));
  }

  public static void close() {
    keyboard.close();
  }
}
