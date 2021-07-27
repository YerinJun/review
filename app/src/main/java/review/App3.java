package review;

import java.sql.Date;
import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    System.out.printf("[%s]\n", "작업");

    Scanner keyboard = new Scanner(System.in);

    final int MAX_LENGTH = 10;
    int[] no = new int[MAX_LENGTH];
    String[] content = new String[MAX_LENGTH];
    Date[] deadline = new Date[MAX_LENGTH];
    int[] status = new int[MAX_LENGTH];
    String[] owner = new String[MAX_LENGTH];

    int size = 0;
    for (int i = 0; i < MAX_LENGTH; i++) {
      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboard.nextLine());
      System.out.print("내용? ");
      content[i] = keyboard.nextLine();
      System.out.print("마감일? ");
      deadline[i] = Date.valueOf(keyboard.nextLine());
      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      status[i] = Integer.parseInt(keyboard.nextLine());
      System.out.print("담당자? ");
      owner[i] = keyboard.nextLine();

      size++;
      System.out.print("계속 입력하시겠습니까? (y/N) ");
      String input = keyboard.nextLine();
      if (input.equalsIgnoreCase("n") || input.length() == 0)
        break;
    }
    keyboard.close();

    System.out.println("-----------------------");

    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, ", no[i], deadline[i]);
      switch (status[i]) {
        case 1:
          System.out.print("진행중, ");
          break;
        case 2:
          System.out.print("완료, ");
          break;
        default:
          System.out.print("신규, ");
      }
      System.out.println(owner[i]);
    }
  }
}