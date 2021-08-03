package review.pms.handler;

import java.sql.Date;
import review.pms.domain.Board;
import review.util.Prompt;

public class BoardHandler {
  static final int MAX_LENGTH = 5;
  Board[] boards = new Board[MAX_LENGTH];
  int size = 0;

  public void add() {
    Board board = new Board();
    System.out.println("[세 게시글]");

    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("제목? ");
    board.content = Prompt.inputString("내용? ");
    board.writer = Prompt.inputString("작성자? ");
    board.registeredDate = new Date(System.currentTimeMillis());
    board.viewCount = 0;
    board.like = Prompt.inputInt("좋아요? ");

    this.boards[this.size++] = board;
    System.out.println("게시글을 등록하였습니다.");
  }

  public void list() {
    System.out.println("[게시글 목록]");
    for (int i = 0; i < this.size; i++) {
      System.out.printf("%d, %s, %s, %s, %d, %d\n",
          this.boards[i].no,
          this.boards[i].title,
          this.boards[i].writer,
          this.boards[i].registeredDate,
          this.boards[i].viewCount,
          this.boards[i].like);
    }
  }

  public void detail() {
    System.out.println("[게시글 상세보기]");
    int no = Prompt.inputInt("번호? ");

    Board board = null;

    for (int i = 0; i < this.size; i++) {
      if (this.boards[i].no == no) {
        board = this.boards[i];
        break;
      }
    }

    if (board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    System.out.printf("제목: %s\n", board.title);
    System.out.printf("내용: %s\n", board.content);
    System.out.printf("작성자: %s\n", board.writer);
    System.out.printf("등록일: %s\n", board.registeredDate);
    System.out.printf("조회수: %d\n", board.viewCount);
  }

  public void update() {
    System.out.println("[게시글 변경]");
    int no = Prompt.inputInt("번호? ");

    Board board = null;

    for (int i = 0; i < this.size; i++) {
      if (this.boards[i].no == no) {
        board = this.boards[i];
        break;
      }
    }

    if (board == null) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    String title = Prompt.inputString(String.format("제목(%s)?", board.title));
    String content = Prompt.inputString(String.format("내용(%s)?", board.content));

    String input = Prompt.inputString("정말 변경하시겠습니까? (y/N)");
    if (input.equalsIgnoreCase("n") || input.length() == 0) {
      System.out.println("게시글 변경을 취소하였습니다.");
      return;
    }

    board.title = title;
    board.content = content;
    System.out.println("게시글을 변경하였습니다.");
  }

  public void delete() {
    System.out.println("[게시글 삭제]");
    int no = Prompt.inputInt("번호? ");

    int boardIndex = -1;

    for (int i = 0; i < this.size; i++) {
      if (this.boards[i].no == no) {
        boardIndex = i;
        break;
      }
    }

    if (boardIndex == -1) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    String input = Prompt.inputString("정말 삭제하시겠습니까? (y/N)");
    if (input.equalsIgnoreCase("n") || input.length() == 0) {
      System.out.println("게시글 삭제를 취소하였습니다.");
      return;
    }

    for (int i = boardIndex + 1; i < this.size; i++) {
      boards[i - 1] = boards[i];
    }
    this.boards[--this.size] = null;

    System.out.println("게시글을 삭제하였습니다.");
  }
}