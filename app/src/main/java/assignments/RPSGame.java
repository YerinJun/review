package assignments;

import java.util.Scanner;

public class RPSGame {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Rock Paper Scissors?! ");
    String user = keyboard.nextLine();
    keyboard.close();

    if (user.equalsIgnoreCase("rock") || user.equalsIgnoreCase("paper") 
        || user.equalsIgnoreCase("scissors")) {
      System.out.println("User: " + user);
    } else {
      System.out.print("Please, choose Rock, Paper, Scissors. ");
      return;
    }

    int random = (int)(Math.random()*3);
    String computer;
    if (random == 0) {
      computer = "Rock";
    } else if (random == 1) {
      computer = "Paper";
    } else {
      computer = "Scissors";
    }

    System.out.println("Computer: " + computer);

    if (user.equalsIgnoreCase("Rock")) {
      if (computer.equalsIgnoreCase("Rock")) {
        System.out.print("Tied.");
      } else if (computer.equalsIgnoreCase("paper")) {
        System.out.print("You lost.");
      } else {
        System.out.print("You won.");
      }
    }
    if (user.equalsIgnoreCase("paper")) {
      if (computer.equalsIgnoreCase("paper")) {
        System.out.print("Tied.");
      } else if (computer.equalsIgnoreCase("scissors")) {
        System.out.print("You lost.");
      } else {
        System.out.print("You won");
      }
    }
    if (user.equalsIgnoreCase("scissors")) {
      if (computer.equalsIgnoreCase("scissors")) {
        System.out.print("Tied.");
      } else if (computer.equalsIgnoreCase("rock")) {
        System.out.print("You lost.");
      } else {
        System.out.print("You won");
      }
    }
  }
}
