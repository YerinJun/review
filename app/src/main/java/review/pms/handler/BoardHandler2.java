package review.pms.handler;

import java.sql.Date;
import review.pms.domain.Board;
import review.util.Prompt;

public class BoardHandler2 {
  static final int MAX_LENGTH = 10;
  static Board[] boards = new Board[MAX_LENGTH];
  static int size = 0;

  public static void add() {
    Board board = new Board();
    System.out.println("[게시글 등록2]");

    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("제목? ");
    board.content = Prompt.inputString("내용? ");
    board.writer = Prompt.inputString("작성자? ");
    board.registeredDate = new Date(System.currentTimeMillis());
    board.viewCount = 0;
    board.like = Prompt.inputInt("좋아요? ");


    boards[size++] = board;
    System.out.println("게시글을 등록하였습니다.");

  }

  public static void list() {
    System.out.println("[게시글 목록2]");
    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %d\n",
          boards[i].no,
          boards[i].title,
          boards[i].writer,
          boards[i].registeredDate,
          boards[i].viewCount,
          boards[i].like);
    }
  }
}