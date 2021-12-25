package Display;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListInput implements Input{
    ArrayList<String> inputList = new ArrayList<>(Arrays.asList("TestPlayerName", "twist", "stick", "twist", "stick", "play", "end"));
    Integer counter = 0;

    public String getString(){
        String listnext = inputList.get(counter);
        counter += 1;

        return listnext;
    }

    public int getInteger(){
        return 2;
    }
}