package review;

import java.util.Date;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("[회원]");

    Scanner keyboard = new Scanner(System.in);

    final int MAX_VALUE = 100;

    int[] no = new int[MAX_VALUE];
    String[] name = new String[MAX_VALUE];
    String[] email = new String[MAX_VALUE];
    String[] password = new String[MAX_VALUE];
    String[] photo = new String[MAX_VALUE];
    String[] tel = new String[MAX_VALUE];
    Date[] registeredDate = new Date[MAX_VALUE];

    int size = 0;

    for (int i = 0; i < MAX_VALUE; i++) {
      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboard.nextLine());
      System.out.print("이름? ");
      name[i] = keyboard.nextLine();
      System.out.print("이메일? ");
      email[i] = keyboard.nextLine();
      System.out.print("암호? ");
      password[i] = keyboard.nextLine();
      System.out.print("사진? ");
      photo[i] = keyboard.nextLine();
      System.out.print("전화? ");
      tel[i] = keyboard.nextLine();
      registeredDate[i] = new Date();
      size += 1;

      System.out.print("계속 입력하시겠습니까?(y/N)");
      String input = keyboard.nextLine();
      if (input.equalsIgnoreCase("n") || input.length() == 0) {
        break;
      }
    }
    keyboard.close();

    System.out.println("----------------------------------------------");
    for(int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %tY-%5$tm-%5$td\n",
          no[i], name[i], email[i], tel[i], registeredDate[i]);
    }
  }
}