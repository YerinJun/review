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
}