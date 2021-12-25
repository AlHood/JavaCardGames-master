package Display;

import java.util.ArrayList;

public class ListOutput implements Output{
    public ArrayList<String> getOutputList() {
        return outputList;
    }

    public ArrayList<String> outputList;

    public ListOutput(){
        this.outputList = new ArrayList<String>();
    }

    public void output(String display){
         outputList.add(display);            }


}
