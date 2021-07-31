package review;

import java.sql.Date;

public class TaskHandler {

  final static int MAX_LENGTH = 10;
  static int[] no = new int[MAX_LENGTH];
  static String[] content = new String[MAX_LENGTH];
  static Date[] deadline = new Date[MAX_LENGTH];
  static int[] status = new int[MAX_LENGTH];
  static String[] owner = new String[MAX_LENGTH];
  static int size = 0;

  static void add() {
    System.out.println("[작업 등록]");
    no[size] = Prompt.inputInt("번호? ");
    content[size] = Prompt.inputString("내용? ");
    deadline[size] = Prompt.inputDate("마감일? ");
    System.out.println("상태? ");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    status[size] = Prompt.inputInt("> ");
    owner[size] = Prompt.inputString("담당자? ");
    size++;
  }

  static void list() {
    System.out.println("[작업 목록]");

    for (int i = 0; i < size; i++) {
      String stateLabel = null;
      switch (status[i]) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      System.out.printf("%d, %s, %s, %s, %s\n", 
          no[i], content[i], deadline[i], stateLabel, owner[i]);
    }
  }

}
