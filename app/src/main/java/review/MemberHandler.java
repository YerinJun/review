package review;

import java.sql.Date;

public class MemberHandler {
  static final int MAX_LENGTH = 10;

  static Member[] members = new Member[MAX_LENGTH];
  static int size = 0;

  static void add() {
    Member member = new Member();

    System.out.println("[회원 등록]");
    member.no = Prompt.inputInt("번호? ");
    member.name = Prompt.inputString("이름? ");
    member.email =  Prompt.inputString("이메일? ");
    member.pw = Prompt.inputString("암호? ");
    member.photo = Prompt.inputString("사진? ");
    member.tel = Prompt.inputString("전화? ");
    member.registeredDate = new Date(System.currentTimeMillis());

    members[size++] = member;
  }

  static void list() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < size; i++) {
      System.out.printf("%d, %s, %s, %s, %tY-%5$tm-%5$td\n",
          members[i].no,
          members[i].name,
          members[i].email,
          members[i].tel,
          members[i].registeredDate);
    }
  }
}
