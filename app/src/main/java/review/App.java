package review;

import java.util.Date;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("[회원]");

    final int MAX_LENGTH = 100;

    int[] no = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] email = new String[MAX_LENGTH];
    String[] pw = new String[MAX_LENGTH];
    String[] photo = new String[MAX_LENGTH];
    String[] tel = new String[MAX_LENGTH];
    Date[] registeredDate = new Date[MAX_LENGTH];

    Scanner keyboard = new Scanner(System.in);

    int size = 0; 

    for (int i = 0; i < MAX_LENGTH; i++) {
      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboard.nextLine());
      System.out.print("이름? ");
      name[i] = keyboard.nextLine();
      System.out.print("이메일? ");
      email[i] = keyboard.nextLine();
      System.out.print("암호? ");
      pw[i] = keyboard.nextLine();
      System.out.print("사진? ");
      photo[i] = keyboard.nextLine();
      System.out.print("전화? ");
      tel[i] = keyboard.nextLine();
      registeredDate[i] = new Date();
      size = size + 1;
      System.out.println();

      System.out.println("계속 입력하시겠습니까? (y/N)");
      String input = keyboard.nextLine();
      if (input.equalsIgnoreCase("n") || input.equals("")) {
        break;
      }
    }
    keyboard.close();

    System.out.println("--------------------------------------------");

    for (int i = 0; i < size; i++) {
      System.out.printf("%s, %s, %s, %s, %s\n", no[i], name[i], email[i], tel[i], registeredDate[i]);
    }
  }
}