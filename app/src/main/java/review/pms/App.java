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
    ProjectHandler projectHandler = new ProjectHandler(memberHandler);
    TaskHandler taskHandler = new TaskHandler(memberHandler);

    while (true) {
      String input = Prompt.inputString("명령> ");

      if (input.equals("exit") || input.equals("quit") || input.equals("bye")) {
        System.out.println("Bye!");
        break;
      } else if (input.equals("/member/add")) {
        memberHandler.add();

      } else if (input.equals("/member/list")) {
        memberHandler.list();

      } else if (input.equals("/member/detail")) {
        memberHandler.detail();

      } else if (input.equals("/member/update")) {
        memberHandler.update();

      } else if (input.equals("/member/delete")) {
        memberHandler.delete();

      } else if (input.equals("/project/add")) {
        projectHandler.add();

      } else if (input.equals("/project/list")) {
        projectHandler.list();

      } else if (input.equals("/project/detail")) {
        projectHandler.detail();

      } else if (input.equals("/project/update")) {
        projectHandler.update();

      } else if (input.equals("/project/delete")) {
        projectHandler.delete();

      } else if (input.equals("/task/add")) {
        taskHandler.add();

      } else if (input.equals("/task/list")) {
        taskHandler.list();

      } else if (input.equals("/task/detail")) {
        taskHandler.detail();

      } else if (input.equals("/task/update")) {
        taskHandler.update();

      } else if (input.equals("/task/delete")) {
        taskHandler.delete();

      } else if (input.equals("/board/add")) {
        boardHandler.add();

      } else if (input.equals("/board/list")) {
        boardHandler.list();

      } else if (input.equals("/board/detail")) {
        boardHandler.detail();

      } else if (input.equals("/board/update")) {
        boardHandler.update();

      } else if (input.equals("/board/delete")) {
        boardHandler.delete();

      } else {
        System.out.println("유효하지 않은 명령입니다.");
      }
    }
    Prompt.close();
  }
}