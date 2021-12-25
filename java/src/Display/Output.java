//Please note that in this Output interface are some attributes and methods only used by the testing process
//Which I am very unhappy about but uncertain how to fix.

package Display;
import java.util.ArrayList;

public interface Output {
    public ArrayList<String> outputList = null;
    public void output(String display);
    public ArrayList<String> getOutputList();


}
