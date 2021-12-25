package Display;

//A hypothetical alternative Output method. Able to be activated by uncommenting line 31 in CardGame.java in
//the CardGame package. When CardGame uses GooseOutput instead of Consoleoutput, all outputs are appended
//with "HONK".

import java.util.ArrayList;

public class GooseOutput implements Output{
    public ArrayList<String> getOutputList() {
        return outputList;
    }
    public void output(String display){
        System.out.println(display + ", HONK");
    }
}
