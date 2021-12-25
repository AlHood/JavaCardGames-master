package Display;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements Input{
    private Scanner userInput = new Scanner(System.in);

    public String getString(){
        return userInput.nextLine();
    }

    public int getInteger(){
        int result;
        result = -1;
        do {
            try {
                result = Integer.parseInt(getString());
            } catch (NumberFormatException exception) {
                // Display.Output expected NumberFormatException.
                System.out.println("Please enter a integer");
            }
        } while (result < 0);

        return result;
    }
}