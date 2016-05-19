package bracket;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
    public void saveState(String filename, Context c){
        try{
            FileOutputStream fos = c.openFileOutput(filename, Context.MODE_PRIVATE);
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(this);
            os.close();
            fos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public State loadState(String filename, Context c){
        State state = null;
        try{
            FileInputStream fis = c.openFileInput(filename);
            ObjectInputStream is = new ObjectInputStream(fis);
            state = (State) is.readObject();
            is.close();
            fis.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return state;
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
