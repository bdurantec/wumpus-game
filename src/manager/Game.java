package manager;

import cli.CommandLine;
import kernel.Check;
import kernel.Kernel;

public class Game {

    public static Kernel kernel;
    public CommandLine cli;

    public boolean gamingOn;
    public boolean winGame;

    public void newGame() {
        cli = new CommandLine();
        kernel = new Kernel();
        gamingOn = true;
        winGame = false;
        startGame();
    }

    private void startGame() {
        controller();
        if (winGame) {
            cli.setText("\n\n ******************** VITÓRIA ******************** ");
        } else {
            cli.setText("\n\n ******************** DERROTA ******************** ");
        }
    }

    private void controller() {
        while (gamingOn) {
            cli.setAction(cli.getCommand());
        }
        cli.closeScanner();
    }

    private void checkEndGame(Boolean winner) {
        if (winner) {
            gamingOn = false;
            winGame = true;
        } else {
            gamingOn = false;
            winGame = false;
        }
    }
}