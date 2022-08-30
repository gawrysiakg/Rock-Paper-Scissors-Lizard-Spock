import java.util.Scanner;

public class Player {
    private String userName;
    String playerMove;
    Scanner s = new Scanner(System.in);
    public Player() { }

    public String getUserName() {
        return userName;
    }

    public String setUserName(String userName) {
        this.userName = userName;
        return userName;
    }

    public String getPlayerMove() {
        String pMove = s.nextLine().toUpperCase();
        switch (pMove) {
            case "1" -> playerMove = "ROCK";
            case "2" -> playerMove = "PAPER";
            case "3" -> playerMove = "SCISSORS";
            case "X" -> playerMove = "X";
            case "N" -> playerMove = "N";
            case "R" -> playerMove = "R";
        }
        return playerMove;
    }


    public String getExtendedPlayerMove() {
        String plMove = s.nextLine().toUpperCase();
        switch (plMove) {
            case "1" -> playerMove = "ROCK";
            case "2" -> playerMove = "PAPER";
            case "3" -> playerMove = "SCISSORS";
            case "4" -> playerMove = "LIZARD";
            case "5" -> playerMove = "SPOCK";
            case "X" -> playerMove = "X";
            case "N" -> playerMove = "N";
            case "R" -> playerMove = "R";
        }
        return playerMove;
    }
}
