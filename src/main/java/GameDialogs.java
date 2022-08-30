import java.util.Scanner;

public class GameDialogs {
    private int gameMode;
    public int getGameMode() {
        return gameMode;
    }
    public void setGameMode() {
            System.out.println("Standard game - press 1, extended version - press 2");
            Scanner modeScanner = new Scanner(System.in);
            int mode = modeScanner.nextInt();
            if (mode == 1) {
                this.gameMode = 1;
            } else  {
                this.gameMode = 2;
            }
    }
        public void gameInstruction (Player player, GameLogic gameLogic) {
            if (gameMode == 1) {
                System.out.println("Hello " + player.getUserName() + ". Rules of the game: ");
                System.out.println("Press [1] to choose Rock \nPress [2] to choose Paper\nPress [3] to choose Scissors");
                System.out.println("Press [X] to end the game\nPress [N] to start a new game\nPress [R] to display rules");
                System.out.println("Scissors cuts paper, paper covers rock and rock crushes scissors.");
                System.out.println("Player who win " + gameLogic.getNumberOfRound() + " rounds is a WINNER!");
                System.out.println("Good luck!");
            } else {
                System.out.println("Hello " + player.getUserName() + ". Rules of the game: ");
                System.out.println("Press [1] to choose Rock \nPress [2] to choose Paper\nPress [3] to choose Scissors");
                System.out.println("Press [4] to choose Lizard \nPress [5] to choose Spock\n");
                System.out.println("Press [X] to end the game\nPress [N] to start a new game\nPress [R] to display rules");
                System.out.println("Scissors cuts paper, paper covers rock and rock crushes scissors.");
                System.out.println("Stone crushes lizard, lizard poisons spock, spock breaks scissors, scissors hurts lizard.");
                System.out.println("Lizard eats paper, paper proves spock error, spock crumbles rock");
                System.out.println("Player who win " + gameLogic.getNumberOfRound() + " rounds is a WINNER!");
                System.out.println("Good luck!");
            }
        }
    public void gameIntro(GameLogic gameLogic){
        System.out.println("\nGame " + gameLogic.getRound());
        System.out.println("Press [1] to choose Rock; Press [2] to choose Paper; Press [3] to choose Scissors;");
        System.out.println("Press [X] to end the game; Press [N] to start a new game; Press [R] to display rules;");
        System.out.println("Confirm by pressing Enter!");
    }
    public void extendedGameIntro(GameLogic gameLogic){
        System.out.println("\nGame " + gameLogic.getRound());
        System.out.println("Press [1] to choose Rock; Press [2] to choose Paper; Press [3] to choose Scissors;");
        System.out.println("Press [4] to choose Lizard; Press [5] to choose Spock\n");
        System.out.println("Press [X] to end the game; Press [N] to start a new game; Press [R] to display rules;");
        System.out.println("Confirm by pressing Enter!");
    }

}
