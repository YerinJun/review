package review;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final int MAX_LENGTH = 10;

    int[] no = new int[MAX_LENGTH];
    String[] title = new String[MAX_LENGTH];
    String[] content = new String[MAX_LENGTH];
    Date[] startDate = new Date[MAX_LENGTH];
    Date[] endDate = new Date[MAX_LENGTH];
    String[] owner = new String[MAX_LENGTH];
    String[] member = new String[MAX_LENGTH];

    int size = 0;
    System.out.println("[프로젝트]");
    for (int i = 0; i < MAX_LENGTH; i++) {
      System.out.print("번호 ? ");
      no[i] = Integer.parseInt(keyboard.nextLine());
      System.out.print("프로젝트명 ? ");
      title[i] = keyboard.nextLine();
      System.out.print("내용 ? ");
      content[i] = keyboard.nextLine();
      System.out.print("시작일 ? ");
      startDate[i] = Date.valueOf(keyboard.nextLine());
      System.out.print("종료일 ? ");
      endDate[i] = Date.valueOf(keyboard.nextLine());
      System.out.print("만든이 ? ");
      owner[i] = keyboard.nextLine();
      System.out.print("팀원 ? ");
      member[i] = keyboard.nextLine();

      size++;
      System.out.print("계속 입력하시겠습니까? (y/N)");
      String input = keyboard.nextLine();
      if (input.equalsIgnoreCase("n") || input.length() == 0)
        break;
    }

    keyboard.close();
    System.out.println("-----------------------------------------");

    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", no[i], title[i], startDate[i], endDate[i], owner[i]);
    }
  }
}