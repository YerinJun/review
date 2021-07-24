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

    System.out.print("번호? ");
    no[0] = Integer.parseInt(keyboard.nextLine());
    System.out.print("이름? ");
    name[0] = keyboard.nextLine();
    System.out.print("이메일? ");
    email[0] = keyboard.nextLine();
    System.out.print("암호? ");
    pw[0] = keyboard.nextLine();
    System.out.print("사진? ");
    photo[0] = keyboard.nextLine();
    System.out.print("전화? ");
    tel[0] = keyboard.nextLine();
    registeredDate[0] = new Date();
    System.out.println();

    System.out.print("번호? ");
    no[1] = Integer.parseInt(keyboard.nextLine());
    System.out.print("이름? ");
    name[1] = keyboard.nextLine();
    System.out.print("이메일? ");
    email[1] = keyboard.nextLine();
    System.out.print("암호? ");
    pw[1] = keyboard.nextLine();
    System.out.print("사진? ");
    photo[1] = keyboard.nextLine();
    System.out.print("전화? ");
    tel[1] = keyboard.nextLine();
    registeredDate[1] = new Date();
    System.out.println();

    System.out.print("번호? ");
    no[2] = Integer.parseInt(keyboard.nextLine());
    System.out.print("이름? ");
    name[2] = keyboard.nextLine();
    System.out.print("이메일? ");
    email[2] = keyboard.nextLine();
    System.out.print("암호? ");
    pw[2] = keyboard.nextLine();
    System.out.print("사진? ");
    photo[2] = keyboard.nextLine();
    System.out.print("전화? ");
    tel[2] = keyboard.nextLine();
    registeredDate[2] = new Date();
    System.out.println();

    System.out.print("번호? ");
    no[3] = Integer.parseInt(keyboard.nextLine());
    System.out.print("이름? ");
    name[3] = keyboard.nextLine();
    System.out.print("이메일? ");
    email[3] = keyboard.nextLine();
    System.out.print("암호? ");
    pw[3] = keyboard.nextLine();
    System.out.print("사진? ");
    photo[3] = keyboard.nextLine();
    System.out.print("전화? ");
    tel[3] = keyboard.nextLine();
    registeredDate[3] = new Date();
    System.out.println();

    System.out.print("번호? ");
    no[4] = Integer.parseInt(keyboard.nextLine());
    System.out.print("이름? ");
    name[4] = keyboard.nextLine();
    System.out.print("이메일? ");
    email[4] = keyboard.nextLine();
    System.out.print("암호? ");
    pw[4] = keyboard.nextLine();
    System.out.print("사진? ");
    photo[4] = keyboard.nextLine();
    System.out.print("전화? ");
    tel[4] = keyboard.nextLine();
    registeredDate[4] = new Date();
    System.out.println();


    keyboard.close();

    System.out.println("--------------------------------------------");

    System.out.printf("%s, %s, %s, %s, %s\n", no[0], name[0], email[0], tel[0], registeredDate[0]);
    System.out.printf("%s, %s, %s, %s, %s\n", no[1], name[1], email[1], tel[1], registeredDate[1]);
    System.out.printf("%s, %s, %s, %s, %s\n", no[2], name[2], email[2], tel[2], registeredDate[2]);
    System.out.printf("%s, %s, %s, %s, %s\n", no[3], name[3], email[3], tel[3], registeredDate[3]);
    System.out.printf("%s, %s, %s, %s, %s\n", no[4], name[4], email[4], tel[4], registeredDate[4]);

  }
}