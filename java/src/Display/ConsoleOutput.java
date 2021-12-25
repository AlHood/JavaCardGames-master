package Display;


import CardGame.Hand;

import java.util.ArrayList;

public class ConsoleOutput implements Output{
    public ArrayList<String> getOutputList() {
        return outputList;
    }

    public void output(String display){
        System.out.println(display);
    }
}
