package review.pms;

import review.pms.handler.MemberHandler;
import review.pms.handler.ProjectHandler;
import review.pms.handler.TaskHandler;
import review.util.Prompt;

public class App {
  public static void main(String[] args) {
    while (true) {
      String input = Prompt.inputString("명령> ");

      if (input.equals("exit") || input.equals("quit") || input.equals("bye")) {
        System.out.println("Bye!");
        break;
      } else if (input.equals("/member/add")) {
        MemberHandler.add();

      } else if (input.equals("/member/list")) {
        MemberHandler.list();

      } else if (input.equals("/project/add")) {
        ProjectHandler.add();

      } else if (input.equals("/project/list")) {
        ProjectHandler.list();

      } else if (input.equals("/task/add")) {
        TaskHandler.add();

      } else if (input.equals("/task/list")) {
        TaskHandler.list();

      } else {
        System.out.println("유효하지 않은 명령입니다.");
      }
    }
    Prompt.close();
  }
}