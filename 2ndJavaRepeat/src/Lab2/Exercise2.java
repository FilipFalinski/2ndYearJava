package Lab2;

import javax.swing.*;

public class Exercise2 {

    public static void main(String[] args) {
        String answer;
        char result;
        int computerWins = 0, playerWins = 0, draws = 0, numOfGames = 0;

        answer = JOptionPane.showInputDialog("Would you like to play a game of roll the dice? (yes or no)");
        ;


        while (answer.equals("yes")) {
            result = rollTheDice();

            numOfGames++;

            if (result == 'c')
                computerWins++;
            else if (result == 'p')
                playerWins++;
            else
                draws++;

            JOptionPane.showMessageDialog(null, "Games played: " + numOfGames + "\nComputer Wins: " + computerWins + "\nPlayer Wins: " +
                    playerWins + "\nDraws: " + draws, "Game Info", JOptionPane.INFORMATION_MESSAGE);

            answer = JOptionPane.showInputDialog("Would you like to play another game? (yes or no)");
        }
        JOptionPane.showMessageDialog(null, "Thanks for playing the game!", "Farewell", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static char rollTheDice()
    {
        int computerRoll,playerRoll;

        computerRoll = (int)(Math.random()*11) + 2;
        JOptionPane.showMessageDialog(null,"The computer roll generated the value " + computerRoll + "  \n .... now hit return to see the player roll",
                "Computer Roll",JOptionPane.INFORMATION_MESSAGE);

        playerRoll = (int)(Math.random()*11) + 2;
        JOptionPane.showMessageDialog(null,"The player roll generated the value " + playerRoll,"Player Roll",JOptionPane.INFORMATION_MESSAGE);

        if(computerRoll>playerRoll)
            return 'c';
        else if(playerRoll>computerRoll)
            return 'p';
        else
            return 'd';
    }
}
