import java.util.Random;

public class Computer {

    String computerMove;
    Random random = new Random();
    public String getComputerMove() {
        int cMove = random.nextInt(3) + 1;
        if (cMove == 1) {
            computerMove = "ROCK";
        } else if (cMove == 2) {
            computerMove = "PAPER";
        } else {
            computerMove = "SCISSORS";
        }
        return computerMove;
    }

    public String getExtendedComputerMove() {
        int cMove = random.nextInt(5) + 1;
        if (cMove == 1) {
            computerMove = "ROCK";
        } else if (cMove == 2) {
            computerMove = "PAPER";
        } else if (cMove==3){
            computerMove = "SCISSORS";
        } else if (cMove==4){
            computerMove = "LIZARD";
        } else {
            computerMove = "SPOCK";
        }
        return computerMove;
    }
}
