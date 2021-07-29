package review;

import java.sql.Date;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final int MAX_LENGTH = 10;
    int[] no = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] email = new String[MAX_LENGTH];
    String[] pw = new String[MAX_LENGTH];
    String[] photo = new String[MAX_LENGTH];
    String[] tel = new String[MAX_LENGTH];
    Date[] registeredDate = new Date[MAX_LENGTH];
    int size = 0;

    final int pMAX_LENGTH = 10;
    int[] pno = new int[pMAX_LENGTH];
    String[] title = new String[pMAX_LENGTH];
    String[] content = new String[pMAX_LENGTH];
    Date[] startDate = new Date[pMAX_LENGTH];
    Date[] endDate = new Date[pMAX_LENGTH];
    String[] owner = new String[pMAX_LENGTH];
    String[] member = new String[pMAX_LENGTH];
    int psize = 0;

    final int tMAX_LENGTH = 10;
    int[] tno = new int[tMAX_LENGTH];
    String[] tcontent = new String[tMAX_LENGTH];
    Date[] deadline = new Date[tMAX_LENGTH];
    int[] status = new int[tMAX_LENGTH];
    String[] towner = new String[tMAX_LENGTH];
    int tsize = 0;

    while (true) {
      System.out.print("명령> ");
      String input = keyboard.nextLine();
      if (input.equals("exit") || input.equals("quit") || input.equals("bye")) {
        System.out.println("Bye!");
        break;
      } else if (input.equals("/member/add")) {
        System.out.println("[회원 등록]");
        System.out.print("번호? ");
        no[size] = Integer.parseInt(keyboard.nextLine());
        System.out.print("이름? ");
        name[size] = keyboard.nextLine();
        System.out.print("이메일? ");
        email[size] = keyboard.nextLine();
        System.out.print("암호? ");
        pw[size] = keyboard.nextLine();
        System.out.print("사진? ");
        photo[size] = keyboard.nextLine();
        System.out.print("전화? ");
        tel[size] = keyboard.nextLine();
        registeredDate[size] = new Date(System.currentTimeMillis());
        size++;

      } else if (input.equals("/member/list")) {
        System.out.println("[회원 목록]");
        for (int i = 0; i < size; i++) {
          System.out.printf("%d, %s, %s, %s, %tY-%5$tm-%5$td\n",
              no[i], name[i], email[i], tel[i], registeredDate[i]);
        }

      } else if (input.equals("/project/add")) {
        System.out.print("번호 ? ");
        pno[psize] = Integer.parseInt(keyboard.nextLine());
        System.out.print("프로젝트명 ? ");
        title[psize] = keyboard.nextLine();
        System.out.print("내용 ? ");
        content[psize] = keyboard.nextLine();
        System.out.print("시작일 ? ");
        startDate[psize] = Date.valueOf(keyboard.nextLine());
        System.out.print("종료일 ? ");
        endDate[psize] = Date.valueOf(keyboard.nextLine());
        System.out.print("만든이 ? ");
        owner[psize] = keyboard.nextLine();
        System.out.print("팀원 ? ");
        member[psize] = keyboard.nextLine();
        psize++;

      } else if (input.equals("/project/list")) {
        for (int i = 0; i < psize; i++) {
          System.out.printf("%d, %s, %s, %s, %s\n", 
              pno[i], title[i], startDate[i], endDate[i], owner[i]);
        }

      } else if (input.equals("/task/add")) {
        System.out.print("번호? ");
        tno[tsize] = Integer.parseInt(keyboard.nextLine());
        System.out.print("내용? ");
        tcontent[tsize] = keyboard.nextLine();
        System.out.print("마감일? ");
        deadline[tsize] = Date.valueOf(keyboard.nextLine());
        System.out.println("상태? ");
        System.out.println("0: 신규");
        System.out.println("1: 진행중");
        System.out.println("2: 완료");
        System.out.print("> ");
        status[tsize] = Integer.parseInt(keyboard.nextLine());
        System.out.print("담당자? ");
        towner[tsize] = keyboard.nextLine();
        tsize++;

      } else if (input.equals("/task/list")) {
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

      } else {
        System.out.println("유효하지 않은 명령입니다.");
      }

    }
    keyboard.close();
  }
}