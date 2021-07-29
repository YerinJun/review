package review;

import java.util.Scanner;

public class App3 {
  public static void main(String[] args) {
    System.out.printf("[%s]\n", "작업");

    Scanner keyboard = new Scanner(System.in);



    int size = 0;
    for (int i = 0; i < MAX_LENGTH; i++) {


      size++;
      System.out.print("계속 입력하시겠습니까? (y/N) ");
      String input = keyboard.nextLine();
      if (input.equalsIgnoreCase("n") || input.length() == 0)
        break;
    }
    keyboard.close();

    System.out.println("-----------------------");


  }
}