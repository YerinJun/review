package assignments;

import java.util.Scanner;

public class RPSGame {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final int MAX_LENGTH = 100;
    String[] user = new String[MAX_LENGTH];
    String[] computer = new String[MAX_LENGTH];
    int[] random = new int[MAX_LENGTH];

    System.out.print("Please choose rock, paper or scissors. ");

    for (int i = 0; i < MAX_LENGTH; i++) {
      user[i] = keyboard.nextLine();
      if (user[i].equalsIgnoreCase("rock") || user[i].equalsIgnoreCase("paper") 
          || user[i].equalsIgnoreCase("scissors")) {
        System.out.println("User: " + user[i]);

        random[i] = (int)(Math.random()*3);
        if (random[i] == 0) {
          computer[i] = "Rock";
        } else if (random[i] == 1) {
          computer[i] = "Paper";
        } else {
          computer[i] = "Scissors";
        }

        System.out.println("Computer: " + computer[i]);
        if (user[i].equalsIgnoreCase("Rock")) {
          if (computer[i].equalsIgnoreCase("Rock")) {
            System.out.println("Tied!");
          } else if (computer[i].equalsIgnoreCase("paper")) {
            System.out.println("You lost!");
          } else {
            System.out.println("You won!");
          }
        } else if (user[i].equalsIgnoreCase("paper")) {
          if (computer[i].equalsIgnoreCase("paper")) {
            System.out.println("Tied!");
          } else if (computer[i].equalsIgnoreCase("scissors")) {
            System.out.println("You lost!");
          } else {
            System.out.println("You won!");
          }
        } else if (user[i].equalsIgnoreCase("scissors")) {
          if (computer[i].equalsIgnoreCase("scissors")) {
            System.out.println("Tied!");
          } else if (computer[i].equalsIgnoreCase("rock")) {
            System.out.println("You lost!");
          } else {
            System.out.println("You won!");
          }
        } 
        System.out.print("Play again? (Y/N)");
        String input = keyboard.nextLine();
        if (input.equalsIgnoreCase("n") || input.length() == 0) {
          System.out.println("Goodbye!");
          break;
        } else {
          System.out.print("Please choose rock, paper or scissors. ");
        }

      } else {
        System.out.print("Please choose rock, paper or scissors. ");
      }
    }
    keyboard.close();
  }
}
