package review;

import java.util.Scanner;

public class App2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);


    System.out.println("[프로젝트]");
    for (int i = 0; i < MAX_LENGTH; i++) {

      System.out.print("계속 입력하시겠습니까? (y/N)");
      String input = keyboard.nextLine();
      if (input.equalsIgpnoreCase("n") || input.length() == 0)
        break;
    }

    keyboard.close();
    System.out.println("-----------------------------------------");


  }
}