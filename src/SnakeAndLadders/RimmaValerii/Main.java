package SnakeAndLadders.RimmaValerii;

import java.util.Scanner;

public class Main {
 public static int numberOfPlayers;
 public static int[] board = new int[101];
 public static int[] positions;

 public static void main(String[] args) {
  System.out.println("\nWelcome to Ladder and Snake!"+"\nCreated by Valerii and Rimma.");
  positions = new int[numberOfPlayers];
  board[1] = 38;
  board[4] = 14;
  board[9] = 31;
  board[21] = 42;
  board[28] = 84;
  board[36] = 44;
  board[51] = 67;
  board[71] = 91;
  board[80] = 100;

  board[16] = 6;
  board[48] = 30;
  board[62] = 19;
  board[64] = 60;
  board[86] = 24;
  board[93] = 68;
  board[97] = 76;
  board[98] = 78;

  Scanner myObj = new Scanner(System.in);
  System.out.println("\nEnter number of players for your game - The " + "number must be between 2 and 4 inclusively: ");
  numberOfPlayers = myObj.nextInt();

  int attempts = 1;
  while (!(numberOfPlayers >= 2 && numberOfPlayers <= 4)) {
   System.out.println("Bad Attempt " + attempts++ + " Enter number of players for your game - " +
           "The number must be between 2 and 4 inclusively: ");
   numberOfPlayers = myObj.nextInt();
   if (attempts == 4)  break;
  }
  if (!(numberOfPlayers >= 2 && numberOfPlayers <= 4))
   System.out.println("Bad Attempt 4! You have exhausted all your chances. The program will terminate! ");
  else {
   positions = new int[numberOfPlayers];
   DataCollection.play();
  }
 }
}



