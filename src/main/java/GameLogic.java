import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    GameDialogs gameDialogs;
    Player player;
    Computer computer;
    Random random;
    Scanner scanner;

    public GameLogic(){
                this.gameDialogs=new GameDialogs();
                this.player =new Player();
                this.computer =new Computer();
                this.random=new Random();
                this.scanner=new Scanner(System.in);
    }

    boolean end = false;
    int playerPoints ;
    int computerPoints;
    private int numberOfRound;
    private int round=1;
    public int getNumberOfRound() {
        return numberOfRound;
    }
    int getRound() {
        return round;
    }

    public void userNameSetter() {
        System.out.println("Welcome in Rock-Paper-Scissors Game");
        System.out.println("Enter your name and press ENTER");
        player.setUserName (scanner.next());
        System.out.println("Good luck " + player.getUserName() + "!");
    }
    public void setNumberOfRound() {
        System.out.println("Enter amount of rounds required to win:");
        Scanner scannedNumberOfRound = new Scanner(System.in);
        numberOfRound = scannedNumberOfRound.nextInt();
    }
    public void quitGame() {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Quit game? y/n");
        String yesOrNo = scanner.next();
        if (yesOrNo.equals("y")) {
            end = true;
            System.out.println(player.getUserName() + " Thank you for playing, You win " + playerPoints + " times.");
            System.exit(0);
        } else {
            end = false;
            round=1;
            playerPoints =0;
            computerPoints=0;
            gameDurationSetter();
        }
    }
    public void gameDurationSetter(){
        userNameSetter();
        setNumberOfRound();
        gameDialogs.setGameMode();
        gameDialogs.gameInstruction(player, this);
        int mode = gameDialogs.getGameMode();
        if (mode==1){
            normalGameDuration();
        } else {
            extendedGameDuration();
        }
    }
    public  void normalGameDuration() {

        while (!end) {
            gameDialogs.gameIntro(this);
            String pMove = player.getPlayerMove();
            String cMove = computer.getComputerMove();
            if (pMove.equals("ROCK") && cMove.equals("PAPER")) {
                System.out.println("You: ROCK, Computer: PAPER, point for Computer! ");
                computerPoints++;
                round++;
            } else if (pMove.equals("PAPER") && cMove.equals("SCISSORS")) {
                System.out.println("You: PAPER, Computer: SCISSORS, point for Computer! ");
                computerPoints++;
                round++;
            } else if (pMove.equals("SCISSORS") && cMove.equals("ROCK")) {
                System.out.println("You: SCISSORS, Computer: ROCK, point for Computer! ");
                computerPoints++;
                round++;
            } else if (pMove.equals("ROCK") && cMove.equals("SCISSORS")) {
                System.out.println("You: ROCK, Computer: SCISSORS, point for You");
                playerPoints++;
                round++;
            } else if (pMove.equals("PAPER") && cMove.equals("ROCK")) {
                System.out.println("You: PAPER, Computer: ROCK, point for You");
                playerPoints++;
                round++;
            } else if (pMove.equals("SCISSORS") && cMove.equals("PAPER")) {
                System.out.println("You: SCISSORS, Computer: PAPER, point for You");
                playerPoints++;
                round++;
            } else if(pMove.equals(cMove)) {
                System.out.println("DRAW! " + pMove + " : " + cMove);
                round++;
            } else if (pMove.equals("X")){
                quitGame();
            } else if(pMove.equals("N")){
                gameDurationSetter();
            } else if (pMove.equals("R")){
                gameDialogs.gameInstruction(player, this);
            }

            score();

           checkTotalWinner();
        }
    }
    public  void extendedGameDuration(){

        while (!end) {
            gameDialogs.extendedGameIntro(this);
            String plMove = player.getExtendedPlayerMove();
            String cMove = computer.getExtendedComputerMove();
            if (plMove.equals("ROCK") && cMove.equals("PAPER")) {
                System.out.println("You: ROCK, Computer: PAPER, point for Computer! ");
                computerPoints++;
                round++;
            } else if (plMove.equals("PAPER") && cMove.equals("SCISSORS")) {
                System.out.println("You: PAPER, Computer: SCISSORS, point for Computer! ");
                computerPoints++;
                round++;
            } else if (plMove.equals("SCISSORS") && cMove.equals("ROCK")) {
                System.out.println("You: SCISSORS, Computer: ROCK, point for Computer! ");
                computerPoints++;
                round++;
            } else if (plMove.equals("ROCK") && cMove.equals("SCISSORS")) {
                System.out.println("You: ROCK, Computer: SCISSORS, point for You");
                playerPoints++;
                round++;
            } else if (plMove.equals("PAPER") && cMove.equals("ROCK")) {
                System.out.println("You: PAPER, Computer: ROCK, point for You");
                playerPoints++;
                round++;
            } else if (plMove.equals("SCISSORS") && cMove.equals("PAPER")) {
                System.out.println("You: SCISSORS, Computer: PAPER, point for You");
                playerPoints++;
                round++;
            } else if (plMove.equals("LIZARD") && cMove.equals("PAPER")) {
                System.out.println("You: LIZARD, Computer: PAPER, point for You");
                playerPoints++;
                round++;
            } else if (plMove.equals("LIZARD") && cMove.equals("ROCK")){
                System.out.println("You: LIZARD, Computer: ROCK, point for Computer!");
                computerPoints++;
                round++;
            } else if (plMove.equals("LIZARD") && cMove.equals("SCISSORS")){
                System.out.println("You: LIZARD, Computer: SCISSORS, point for Computer!");
                computerPoints++;
                round++;
            } else if (plMove.equals("LIZARD") && cMove.equals("SPOCK")) {
                System.out.println("You: LIZARD, Computer: SPOCK, point for You");
                playerPoints++;
                round++;
            } else if (plMove.equals("SPOCK") && cMove.equals("PAPER")) {
                System.out.println("You: SPOCK, Computer: PAPER, point for Computer!");
                computerPoints++;
                round++;
            } else if (plMove.equals("SPOCK") && cMove.equals("ROCK")) {
                System.out.println("You: SPOCK, Computer: ROCK, point for You");
                playerPoints++;
                round++;
            } else if (plMove.equals("SPOCK") && cMove.equals("SCISSORS")) {
                System.out.println("You: SPOCK, Computer: SCISSORS, point for You");
                playerPoints++;
                round++;
            } else if (plMove.equals("SPOCK") && cMove.equals("LIZARD")) {
                System.out.println("You: SPOCK, Computer: LIZARD, point for Computer!");
                computerPoints++;
                round++;
            } else if (plMove.equals(cMove)) {
                System.out.println("DRAW! " + plMove + " : " + cMove);
                round++;
            } else if (plMove.equals("X")){
                quitGame();
            } else if(plMove.equals("N")){
                gameDurationSetter();
            } else if (plMove.equals("R")) {
                gameDialogs.gameInstruction(player, this);
            }

            score();
            checkTotalWinner();
        }
    }

    public void score() {
        System.out.println("Score: ");
        System.out.println(player.getUserName()+": "+playerPoints+", Computer: "+computerPoints);
    }
    public void checkTotalWinner(){
        if (playerPoints == numberOfRound) {
            System.out.println("Total games: "+(round-1));
            System.out.println(player.getUserName() + " is a WINNER!");
            end = true;
            quitGame();
        } else if (computerPoints == numberOfRound) {
            System.out.println("Total games: "+(round-1));
            System.out.println("Computer is a WINNER! ");
            end = true;
            quitGame();
        } else {
            end = false;
        }
    }

}