package review;

import java.util.Date;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    System.out.println("[회원]");

    int no1, no2, no3, no4, no5;
    String name1, name2, name3, name4, name5;
    String email1, email2, email3, email4, email5;
    String pw1, pw2, pw3, pw4, pw5;
    String photo1, photo2, photo3, photo4, photo5;
    String tel1, tel2 ,tel3, tel4, tel5;
    Date registeredDate1, registeredDate2, registeredDate3, registeredDate4, registeredDate5;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("번호? ");
    no1 = Integer.parseInt(keyboard.nextLine());
    System.out.print("이름? ");
    name1 = keyboard.nextLine();
    System.out.print("이메일? ");
    email1 = keyboard.nextLine();
    System.out.print("암호? ");
    pw1 = keyboard.nextLine();
    System.out.print("사진? ");
    photo1 = keyboard.nextLine();
    System.out.print("전화? ");
    tel1 = keyboard.nextLine();
    registeredDate1 = new Date();
    System.out.println();

    System.out.print("번호? ");
    no2 = Integer.parseInt(keyboard.nextLine());
    System.out.print("이름? ");
    name2 = keyboard.nextLine();
    System.out.print("이메일? ");
    email2 = keyboard.nextLine();
    System.out.print("암호? ");
    pw2 = keyboard.nextLine();
    System.out.print("사진? ");
    photo2 = keyboard.nextLine();
    System.out.print("전화? ");
    tel2 = keyboard.nextLine();
    registeredDate2 = new Date();
    System.out.println();

    System.out.print("번호? ");
    no3 = Integer.parseInt(keyboard.nextLine());
    System.out.print("이름? ");
    name3 = keyboard.nextLine();
    System.out.print("이메일? ");
    email3 = keyboard.nextLine();
    System.out.print("암호? ");
    pw3 = keyboard.nextLine();
    System.out.print("사진? ");
    photo3 = keyboard.nextLine();
    System.out.print("전화? ");
    tel3 = keyboard.nextLine();
    registeredDate3 = new Date();
    System.out.println();

    System.out.print("번호? ");
    no4 = Integer.parseInt(keyboard.nextLine());
    System.out.print("이름? ");
    name4 = keyboard.nextLine();
    System.out.print("이메일? ");
    email4 = keyboard.nextLine();
    System.out.print("암호? ");
    pw4 = keyboard.nextLine();
    System.out.print("사진? ");
    photo4 = keyboard.nextLine();
    System.out.print("전화? ");
    tel4 = keyboard.nextLine();
    registeredDate4 = new Date();
    System.out.println();

    System.out.print("번호? ");
    no5 = Integer.parseInt(keyboard.nextLine());
    System.out.print("이름? ");
    name5 = keyboard.nextLine();
    System.out.print("이메일? ");
    email5 = keyboard.nextLine();
    System.out.print("암호? ");
    pw5 = keyboard.nextLine();
    System.out.print("사진? ");
    photo5 = keyboard.nextLine();
    System.out.print("전화? ");
    tel5 = keyboard.nextLine();
    registeredDate5 = new Date();
    System.out.println();

    keyboard.close();

    System.out.println("-----------------------");

    System.out.printf("%s, %s, %s, %s, %s\n", no1, name1, email1, tel1, registeredDate1);
    System.out.printf("%s, %s, %s, %s, %s\n", no2, name2, email2, tel2, registeredDate2);
    System.out.printf("%s, %s, %s, %s, %s\n", no3, name3, email3, tel3, registeredDate3);
    System.out.printf("%s, %s, %s, %s, %s\n", no4, name4, email4, tel4, registeredDate4);
    System.out.printf("%s, %s, %s, %s, %s\n", no5, name5, email5, tel5, registeredDate5);


  }
}