package bracket;

/**
 * Created by davidflast on 5/17/16.
 */
public class State extends Team{
    double population;
    double percentTrump;
    public State(String name, double population){
        super(name);
        this.population = population;
    }
    public double getScore(){
        return this.percentTrump;
    }



}
