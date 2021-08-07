package review.pms.menu;

import review.pms.handler.ProjectHandler;

// Composite 패턴에서 Leaf 역할을 할 메뉴 항목을 정의한다.
public class ProjectUpdateMenu extends Menu {

  ProjectHandler projectHandler;

  public ProjectUpdateMenu(ProjectHandler projectHandler) {
    super("변경");
    this.projectHandler = projectHandler;
  }

  @Override
  public void execute() {
    projectHandler.update();
  }
}
