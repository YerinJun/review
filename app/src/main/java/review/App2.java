package review;

import java.sql.Date;
import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.printf("%s\n", "[프로젝트]");

    System.out.print("번호? ");
    int no = keyboard.nextInt();
    keyboard.nextLine();

    System.out.print("프로젝트명?");
    String title = keyboard.nextLine();

    System.out.print("내용?");
    String content = keyboard.nextLine();

    System.out.print("시작일?");
    Date startDate = Date.valueOf(keyboard.nextLine());

    System.out.print("종료일? ");
    Date endDate = Date.valueOf(keyboard.nextLine());

    System.out.print("만든이?");
    String maker = keyboard.nextLine();

    System.out.print("팀원? ");
    String member = keyboard.nextLine();

    Date today = new Date(System.currentTimeMillis());
    keyboard.close();

    System.out.println("--------------------");
    System.out.println("번호: " + no);
    System.out.println("프로젝트명: " + title);
    System.out.println("내용: " + content);
    System.out.println("시작일: " + startDate);
    System.out.println("종료일: " + endDate);
    System.out.println("만든이: " + maker);
    System.out.println("팀원: "+ member);
    System.out.println("오늘 날짜: " + today);

  }
}
