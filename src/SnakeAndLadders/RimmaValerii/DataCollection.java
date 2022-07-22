
package SnakeAndLadders.RimmaValerii;

import java.util.Random;

public class DataCollection {

    public static int flipDice() {
        Random rand = new Random();
        int n = rand.nextInt(6) + 1;
        return n;
    }

    public static void play() {
        System.out.println("Game is Played by " + Main.numberOfPlayers+" players");
        int player = 0;
        do {
            if (player < Main.numberOfPlayers) ;
            else player = 0;
            int dice = flipDice();
            System.out.println("Player " + (player + 1) + " got a dice value of " + dice);
            if (Main.positions[player] + dice < 100)
                Main.positions[player] = Main.positions[player] + dice;
            else
                Main.positions[player] = 100 - (dice - (100 - Main.positions[player]));
            if (Main.board[Main.positions[player]] != 0) {
                System.out.println("Player " + (player + 1) + " went to square " + Main.positions[player] +
                        " and then to square " + Main.board[Main.positions[player]]);
                Main.positions[player] = Main.board[Main.positions[player]];
            }
            else
                System.out.println(" now in square " + Main.positions[player]);
        } while (Main.positions[player++] != 100);
        System.out.println("Congratulation! Player " + (player) + " has won!!!!!!");
    }
}
