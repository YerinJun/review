package review;

import java.util.Date;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("[회원]");

    int[] no = new int[5];
    String[] name = new String[5];
    String[] email = new String[5];
    String[] pw = new String[5];
    String[] photo = new String[5];
    String[] tel = new String[5];
    Date[] registeredDate = new Date[5];

    Scanner keyboard = new Scanner(System.in);


    for (int i = 0; i < 5; i++) {
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
      System.out.println();
    }
    keyboard.close();

    System.out.println("--------------------------------------------");

    for (int i = 0;i < 5; i++) {
      System.out.printf("%s, %s, %s, %s, %s\n", no[i], name[i], email[i], tel[i], registeredDate[i]);
    }
  }
}