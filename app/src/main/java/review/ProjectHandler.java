package review;

import java.sql.Date;

public class ProjectHandler {

  final static int MAX_LENGTH = 10;
  static int[] no = new int[MAX_LENGTH];
  static String[] title = new String[MAX_LENGTH];
  static String[] content = new String[MAX_LENGTH];
  static Date[] startDate = new Date[MAX_LENGTH];
  static Date[] endDate = new Date[MAX_LENGTH];
  static String[] owner = new String[MAX_LENGTH];
  static String[] member = new String[MAX_LENGTH];
  static int size = 0;

  static void add() {
    System.out.println("[프로젝트 등록]");
    no[size] = Prompt.inputInt("번호 ? ");
    title[size] = Prompt.inputString("프로젝트명 ? ");
    content[size] = Prompt.inputString("내용 ? ");
    startDate[size] = Prompt.inputDate("시작일 ? ");
    endDate[size] = Prompt.inputDate("종료일 ? ");
    owner[size] = Prompt.inputString("만든이 ? ");
    member[size] = Prompt.inputString("팀원 ? ");
    size++;
  }

  static void list() {
    System.out.println("[프로젝트 목록]");

    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          no[i], title[i], startDate[i], endDate[i], owner[i]);
    }
  }
}
