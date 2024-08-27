package Game;

public class Scoreboard {
    int humanScore;
    int computerScore;

    public Scoreboard() {
        this.humanScore = 0;
        this.computerScore = 0;
    }

    public int getHumanScore() {
        return humanScore;
    }

    public void setHumanScore(int humanScore) {
        this.humanScore = humanScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }
}
