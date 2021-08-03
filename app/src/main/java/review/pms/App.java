package review.pms;

import review.pms.handler.BoardHandler;
import review.pms.handler.MemberHandler;
import review.pms.handler.ProjectHandler;
import review.pms.handler.TaskHandler;
import review.util.Prompt;

public class App {
  public static void main(String[] args) {

    BoardHandler boardHandler = new BoardHandler();
    MemberHandler memberHandler = new MemberHandler();
    ProjectHandler projectHandler = new ProjectHandler();
    TaskHandler taskHandler = new TaskHandler();

    while (true) {
      String input = Prompt.inputString("명령> ");

      if (input.equals("exit") || input.equals("quit") || input.equals("bye")) {
        System.out.println("Bye!");
        break;
      } else if (input.equals("/member/add")) {
        memberHandler.add();

      } else if (input.equals("/member/list")) {
        memberHandler.list();

      } else if (input.equals("/project/add")) {
        projectHandler.add(memberHandler);

      } else if (input.equals("/project/list")) {
        projectHandler.list();

      } else if (input.equals("/task/add")) {
        taskHandler.add(memberHandler);

      } else if (input.equals("/task/list")) {
        taskHandler.list();

      } else if (input.equals("/board/add")) {
        boardHandler.add();

      } else if (input.equals("/board/list")) {
        boardHandler.list();

      } else {
        System.out.println("유효하지 않은 명령입니다.");
      }
    }
    Prompt.close();
  }
}