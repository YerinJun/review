package review;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    while (true) {
      System.out.print("명령> ");
      String input = keyboard.nextLine();
      if (input.equals("exit") || input.equals("quit")) {
        System.out.println("Bye!");
        break;
      }
      System.out.println(input);
    }



    //    System.out.println("[회원]");
    //
    //    final int MAX_LENGTH = 10;
    //
    //    int[] no = new int[MAX_LENGTH];
    //    String[] name = new String[MAX_LENGTH];
    //    String[] email = new String[MAX_LENGTH];
    //    String[] pw = new String[MAX_LENGTH];
    //    String[] photo = new String[MAX_LENGTH];
    //    String[] tel = new String[MAX_LENGTH];
    //    Date[] registeredDate = new Date[MAX_LENGTH];
    //
    //
    //    int size = 0;
    //    for (int i = 0; i < MAX_LENGTH; i++) {
    //      System.out.print("번호? ");
    //      no[i] = Integer.parseInt(keyboard.nextLine());
    //      System.out.print("이름? ");
    //      name[i] = keyboard.nextLine();
    //      System.out.print("이메일? ");
    //      email[i] = keyboard.nextLine();
    //      System.out.print("암호? ");
    //      pw[i] = keyboard.nextLine();
    //      System.out.print("사진? ");
    //      photo[i] = keyboard.nextLine();
    //      System.out.print("전화? ");
    //      tel[i] = keyboard.nextLine();
    //      registeredDate[i] = new Date();
    //
    //      System.out.print("계속 입력하시겠습니까? (y/N) ");
    //      String input = keyboard.nextLine();
    //      if (input.equalsIgnoreCase("n") || input.length() == 0)
    //        break;
    //      size++;
    //    }
    //
    //    System.out.println("----------------------------");
    //    for (int i = 0; i <= size; i++) {
    //      System.out.printf("%d, %s, %s, %s, %tY-%5$tm-%5$td\n",
    //          no[i], name[i], email[i], tel[i], registeredDate[i]);
    //    }
    keyboard.close();
  }
}