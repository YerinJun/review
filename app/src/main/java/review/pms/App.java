package review.pms;

import review.pms.handler.BoardHandler;
import review.pms.handler.MemberHandler;
import review.pms.handler.ProjectHandler;
import review.pms.handler.TaskHandler;
import review.pms.menu.Menu;
import review.pms.menu.MenuGroup;
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

    boardMenu.add(new Menu("등록") {
      @Override
      public void execute() {
        boardHandler.add();
      }});
    boardMenu.add(new Menu("목록") {
      @Override
      public void execute() {
        boardHandler.list();
      }});
    boardMenu.add(new Menu("상세보기") {
      @Override
      public void execute() {
        boardHandler.detail();
      }});
    boardMenu.add(new Menu("변경") {
      @Override
      public void execute() {
        boardHandler.update();
      }});
    boardMenu.add(new Menu("삭제") {
      @Override
      public void execute() {
        boardHandler.delete();
      }});

    MenuGroup memberMenu = new MenuGroup("회원");
    mainMenuGroup.add(memberMenu);

    memberMenu.add(new Menu("등록") {
      @Override
      public void execute() {
        memberHandler.add();
      }});
    memberMenu.add(new Menu("목록") {
      @Override
      public void execute() {
        memberHandler.list();
      }});
    memberMenu.add(new Menu("상세보기") {
      @Override
      public void execute() {
        memberHandler.detail();
      }});
    memberMenu.add(new Menu("변경") {
      @Override
      public void execute() {
        memberHandler.update();
      }});
    memberMenu.add(new Menu("삭제") {
      @Override
      public void execute() {
        memberHandler.delete();
      }});

    MenuGroup projectMenu = new MenuGroup("프로젝트");
    mainMenuGroup.add(projectMenu);

    projectMenu.add(new Menu("등록") {
      @Override
      public void execute() {
        projectHandler.add();
      }});
    projectMenu.add(new Menu("목록") {
      @Override
      public void execute() {
        projectHandler.list();
      }});
    projectMenu.add(new Menu("상세보기") {
      @Override
      public void execute() {
        projectHandler.detail();
      }});
    projectMenu.add(new Menu("변경") {
      @Override
      public void execute() {
        projectHandler.update();
      }});
    projectMenu.add(new Menu("삭제") {
      @Override
      public void execute() {
        projectHandler.delete();
      }});

    MenuGroup taskMenu = new MenuGroup("작업");
    mainMenuGroup.add(taskMenu);

    taskMenu.add(new Menu("등록") {
      @Override
      public void execute() {
        taskHandler.add();
      }});
    taskMenu.add(new Menu("목록") {
      @Override
      public void execute() {
        taskHandler.list();
      }});
    taskMenu.add(new Menu("상세보기") {
      @Override
      public void execute() {
        taskHandler.detail();
      }});
    taskMenu.add(new Menu("변경") {
      @Override
      public void execute() {
        taskHandler.delete();
      }});
    taskMenu.add(new Menu("삭제") {
      @Override
      public void execute() {
        taskHandler.delete();
      }});

    return mainMenuGroup;
  }
}