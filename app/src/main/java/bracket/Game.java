package bracket;

/**
 * Created by davidflast on 5/17/16.
 */
public class Game {
    protected int row;
    protected int col;
    protected Game childOne;
    protected Game childTwo;
    protected Team teamOne;
    protected Team teamTwo;
    public Team winner;

    public Game(int row, int col, Game childOne, Game childTwo) {
        this.row = row;
        this.col = col;
        this.childOne = childOne;
        this.childTwo = childTwo;
    }

    public void setTeamOne(Team teamOne) {
        this.teamOne = teamOne;
    }
    public void setTeamTwo(Team teamTwo) {
        this.teamTwo = teamTwo;
    }
    public void setWinner(Team winner) {
        this.winner = winner;
    }
    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
    public Game getChildOne() {
        return childOne;
    }
    public Game getChildTwo() {
        return childTwo;
    }
    public Team getTeamOne() {
        return teamOne;
    }
    public Team getTeamTwo() {
        return teamTwo;
    }
    public Team getWinner() {
        return winner;
    }
}
