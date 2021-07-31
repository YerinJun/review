package review;

import java.sql.Date;

public class MemberHandler {

  final static int MAX_LENGTH = 10;
  static int[] no = new int[MAX_LENGTH];
  static String[] name = new String[MAX_LENGTH];
  static String[] email = new String[MAX_LENGTH];
  static String[] pw = new String[MAX_LENGTH];
  static String[] photo = new String[MAX_LENGTH];
  static String[] tel = new String[MAX_LENGTH];
  static Date[] registeredDate = new Date[MAX_LENGTH];
  static int size = 0;

  static void add() {
    System.out.println("[회원 등록]");
    no[size] = Prompt.inputInt("번호? ");
    name[size] = Prompt.inputString("이름? ");
    email[size] =  Prompt.inputString("이메일? ");
    pw[size] = Prompt.inputString("암호? ");
    photo[size] = Prompt.inputString("사진? ");
    tel[size] = Prompt.inputString("전화? ");
    registeredDate[size] = new Date(System.currentTimeMillis());
    size++;
  }

  static void list() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %tY-%5$tm-%5$td\n",
          no[i], name[i], email[i], tel[i], registeredDate[i]);
    }
  }
}
