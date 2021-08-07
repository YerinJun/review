package review.pms;

import review.pms.handler.BoardHandler;
import review.pms.handler.MemberHandler;
import review.pms.handler.ProjectHandler;
import review.pms.handler.TaskHandler;
import review.pms.menu.BoardAddMenu;
import review.pms.menu.BoardDeleteMenu;
import review.pms.menu.BoardDetailMenu;
import review.pms.menu.BoardListMenu;
import review.pms.menu.BoardUpdateMenu;
import review.pms.menu.MemberAddMenu;
import review.pms.menu.MemberDeleteMenu;
import review.pms.menu.MemberDetailMenu;
import review.pms.menu.MemberListMenu;
import review.pms.menu.MemberUpdateMenu;
import review.pms.menu.Menu;
import review.pms.menu.MenuGroup;
import review.pms.menu.ProjectAddMenu;
import review.pms.menu.ProjectDeleteMenu;
import review.pms.menu.ProjectDetailMenu;
import review.pms.menu.ProjectListMenu;
import review.pms.menu.ProjectUpdateMenu;
import review.pms.menu.TaskAddMenu;
import review.pms.menu.TaskDeleteMenu;
import review.pms.menu.TaskDetailMenu;
import review.pms.menu.TaskListMenu;
import review.pms.menu.TaskUpdateMenu;
import review.util.Prompt;

public class App {

  static BoardHandler boardHandler = new BoardHandler();
  static MemberHandler memberHandler = new MemberHandler();
  static ProjectHandler projectHandler = new ProjectHandler(memberHandler);
  static TaskHandler taskHandler = new TaskHandler(memberHandler);

  public static void main(String[] args) {
    Menu mainMenu = createMenu();
    mainMenu.execute();

    Prompt.close();
  }

  static Menu createMenu() {
    MenuGroup mainMenuGroup = new MenuGroup("메인");
    mainMenuGroup.setPrevMenuTitle("종료");

    MenuGroup boardMenu = new MenuGroup("게시판");
    mainMenuGroup.add(boardMenu);

    boardMenu.add(new BoardAddMenu(boardHandler));
    boardMenu.add(new BoardListMenu(boardHandler));
    boardMenu.add(new BoardDetailMenu(boardHandler));
    boardMenu.add(new BoardUpdateMenu(boardHandler));
    boardMenu.add(new BoardDeleteMenu(boardHandler));

    MenuGroup memberMenu = new MenuGroup("회원");
    mainMenuGroup.add(memberMenu);

    memberMenu.add(new MemberAddMenu(memberHandler));
    memberMenu.add(new MemberListMenu(memberHandler));
    memberMenu.add(new MemberDetailMenu(memberHandler));
    memberMenu.add(new MemberUpdateMenu(memberHandler));
    memberMenu.add(new MemberDeleteMenu(memberHandler));

    MenuGroup projectMenu = new MenuGroup("프로젝트");
    mainMenuGroup.add(projectMenu);

    projectMenu.add(new ProjectAddMenu(projectHandler));
    projectMenu.add(new ProjectListMenu(projectHandler));
    projectMenu.add(new ProjectDetailMenu(projectHandler));
    projectMenu.add(new ProjectUpdateMenu(projectHandler));
    projectMenu.add(new ProjectDeleteMenu(projectHandler));

    MenuGroup taskMenu = new MenuGroup("작업");
    mainMenuGroup.add(taskMenu);

    taskMenu.add(new TaskAddMenu(taskHandler));
    taskMenu.add(new TaskListMenu(taskHandler));
    taskMenu.add(new TaskDetailMenu(taskHandler));
    taskMenu.add(new TaskUpdateMenu(taskHandler));
    taskMenu.add(new TaskDeleteMenu(taskHandler));

    return mainMenuGroup;
  }
}