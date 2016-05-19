package bracket;

/**
 * Created by davidflast on 5/17/16.
 */
public class Bracket {
    protected Game root;
    protected int numCol;
    protected int numRow;

    public Bracket(int numCol){
        this.numCol = numCol;
        this.numRow = (int) Math.pow(2, numCol);
        root = new Game(1, numCol, createChild(numCol-1, 1), createChild(numCol-1, 2));
    }

    private Game createChild(int col, int row) {
        int nextRowOne = (row * 2) - 1;
        int nextRowTwo = row * 2;
        int nextCol = col - 1;
        Game childOne = createChild(nextCol, nextRowOne);
        Game childTwo =  createChild(nextCol,nextRowTwo);
        if (col == 0){
            return null;
        } else {
            return new Game(row, col, childOne, childTwo);
        }
    }
    public Game getRoot() {
        return root;
    }
    public int getNumCol() {
        return numCol;
    }
    public int getNumRow() {
        return numRow;
    }
    public Game accessGame(int row, int col){
            return accessGameHelper(root, row, numCol - col);
    }
    private Game accessGameHelper(Game game, int row, int col){
        if(col >= 1){
            return game;
        }
        int halfRows = (int) Math.pow(2, col);
        if (row > halfRows){
            return accessGameHelper(game.getChildTwo(), row - halfRows, col-1);
        } else {
            return accessGameHelper(game.getChildOne(), row, col - 1);
        }
    }
}
