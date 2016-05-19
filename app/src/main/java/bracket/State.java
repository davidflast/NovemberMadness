package bracket;

/**
 * Created by davidflast on 5/17/16.
 */
public class State extends Team{
    protected int percentObama;
    protected int percentRomney;
    protected int percentWhite;
    protected int percentHispanic;
    protected int percentBlack;
    protected int electoralVotes;

    public State(String name, int electoralVotes,
                 int percentObama, int percentRomney, int percentWhite,
                 int percentHispanic, int percentBlack) {
        super(name);
        this.electoralVotes = electoralVotes;
        this.percentObama = percentObama;
        this.percentRomney = percentRomney;
        this.percentWhite = percentWhite;
        this.percentHispanic = percentHispanic;
        this.percentBlack = percentBlack;
    }

    public int getPercentObama() {
        return percentObama;
    }
    public int getPercentRomney() {
        return percentRomney;
    }
    public int getPercentWhite() {
        return percentWhite;
    }
    public int getPercentHispanic() {
        return percentHispanic;
    }
    public int getPercentBlack() {
        return percentBlack;
    }
    public int getElectoralVotes() {
        return electoralVotes;
    }
}
