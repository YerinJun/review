package assignments;

import java.util.Scanner;

public class Grade {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final int MAX_LENGTH = 5;
    String[] name = new String[MAX_LENGTH];
    int[] kr = new int[MAX_LENGTH];
    int[] eng = new int[MAX_LENGTH];
    int[] math = new int[MAX_LENGTH];
    int[] sum = new int[MAX_LENGTH];
    float[] avg = new float[MAX_LENGTH];

    int size = 0;
    for (int i = 0; i < MAX_LENGTH; i++) {
      System.out.print("이름? ");
      name[i] = keyboard.nextLine();
      System.out.print("국어성적? ");
      kr[i] = Integer.parseInt(keyboard.nextLine());
      System.out.print("영어성적? ");
      eng[i] = Integer.parseInt(keyboard.nextLine());
      System.out.print("수학성적? ");
      math[i] = Integer.parseInt(keyboard.nextLine());
      sum[i] = kr[i] + eng[i] + math[i];
      avg[i] = sum[i]/3;
      size += 1;

      System.out.print("계속 입력하시겠습니까? (y/N)");
      String input = keyboard.nextLine();
      if (input.equalsIgnoreCase("n") || input.length() == 0) {
        System.out.println("입력을 종료합니다.");
        break;
      }
    }
    keyboard.close();

    System.out.println("-----------------------------------------");
    for (int i = 0; i < size; i++) {
      System.out.printf("%s %d %d %d %d %.1f\n",
          name[i], kr[i], eng[i], math[i], sum[i], avg[i]);
    }
  }
}