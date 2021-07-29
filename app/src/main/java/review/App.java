package review;

import java.sql.Date;
import java.util.Scanner;

public class App {
  static Scanner keyboard = new Scanner(System.in);

  final static int MAX_LENGTH = 10;
  static int[] no = new int[MAX_LENGTH];
  static String[] name = new String[MAX_LENGTH];
  static String[] email = new String[MAX_LENGTH];
  static String[] pw = new String[MAX_LENGTH];
  static String[] photo = new String[MAX_LENGTH];
  static String[] tel = new String[MAX_LENGTH];
  static Date[] registeredDate = new Date[MAX_LENGTH];
  static int size = 0;

  final static int pMAX_LENGTH = 10;
  static int[] pno = new int[pMAX_LENGTH];
  static String[] title = new String[pMAX_LENGTH];
  static String[] content = new String[pMAX_LENGTH];
  static Date[] startDate = new Date[pMAX_LENGTH];
  static Date[] endDate = new Date[pMAX_LENGTH];
  static String[] owner = new String[pMAX_LENGTH];
  static String[] member = new String[pMAX_LENGTH];
  static int psize = 0;

  final static int tMAX_LENGTH = 10;
  static int[] tno = new int[tMAX_LENGTH];
  static String[] tcontent = new String[tMAX_LENGTH];
  static Date[] deadline = new Date[tMAX_LENGTH];
  static int[] status = new int[tMAX_LENGTH];
  static String[] towner = new String[tMAX_LENGTH];
  static int tsize = 0;

  public static void main(String[] args) {

    while (true) {
      String input = promptString("명령> ");

      if (input.equals("exit") || input.equals("quit") || input.equals("bye")) {
        System.out.println("Bye!");
        break;
      } else if (input.equals("/member/add")) {
        addMember();

      } else if (input.equals("/member/list")) {
        listMembers();

      } else if (input.equals("/project/add")) {
        addProject();

      } else if (input.equals("/project/list")) {
        listProjects();

      } else if (input.equals("/task/add")) {
        addTask();

      } else if (input.equals("/task/list")) {
        listTasks();

      } else {
        System.out.println("유효하지 않은 명령입니다.");
      }

    }
    keyboard.close();
  }

  static void addMember() {
    System.out.println("[회원 등록]");
    no[size] = promptInt("번호? ");
    name[size] = promptString("이름? ");
    email[size] =  promptString("이메일? ");
    pw[size] = promptString("암호? ");
    photo[size] = promptString("사진? ");
    tel[size] = promptString("전화? ");
    registeredDate[size] = new Date(System.currentTimeMillis());
    size++;
  }

  static void listMembers() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %tY-%5$tm-%5$td\n",
          no[i], name[i], email[i], tel[i], registeredDate[i]);
    }
  }

  static void addProject() {
    pno[psize] = promptInt("번호 ? ");
    title[psize] = promptString("프로젝트명 ? ");
    content[psize] = promptString("내용 ? ");
    startDate[psize] = promptDate("시작일 ? ");
    endDate[psize] = promptDate("종료일 ? ");
    owner[psize] = promptString("만든이 ? ");
    member[psize] = promptString("팀원 ? ");
    psize++;
  }

  static void listProjects() {
    for (int i = 0; i < psize; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          pno[i], title[i], startDate[i], endDate[i], owner[i]);
    }
  }

  static void addTask() {
    tno[tsize] = promptInt("번호? ");
    tcontent[tsize] = promptString("내용? ");
    deadline[tsize] = promptDate("마감일? ");
    System.out.println("상태? ");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    status[tsize] = promptInt("> ");
    towner[tsize] = promptString("담당자? ");
    tsize++;
  }

  static void listTasks() {
    for (int i = 0; i < tsize; i++) {
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
          tno[i], tcontent[i], deadline[i], stateLabel, towner[i]);
    }
  }
  static String promptString(String title) {
    System.out.print(title);
    return keyboard.nextLine();
  }
  static int promptInt(String title) {
    return Integer.parseInt(promptString(title));
  }
  static Date promptDate(String title) {
    return Date.valueOf(promptString(title));
  }
}