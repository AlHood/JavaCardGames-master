package BlackJack;
import BlackJack.*;
import Display.*;
import CardGame.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BlackJackTest {
//    @org.junit.jupiter.api.Test
BlackJack testblackJack = new BlackJack();

    @BeforeEach
            void setup() {
        BlackJack testblackJack = new BlackJack();
    }

    @Test
    void generateHelp() {
        //Test of generateHelp() from a neutral state
        ListOutput listOutput = new ListOutput();
        testblackJack.setUserOutput(listOutput);

        testblackJack.userOutput.output(testblackJack.generateHelp());

        ArrayList<String> referenceOutput = new ArrayList<String>(Arrays.asList("Please select one of the following options\nTwist\nStick\nPlay New Game\nEnd\n"));

        assertEquals(referenceOutput, testblackJack.userOutput.getOutputList()) ;
    }

@Test
    void getPlayerActions() {
        //test of function - inputList ensures that Twist will be input, so function should return a TWIST enum
    ListOutput listOutput = new ListOutput();
    testblackJack.setUserOutput(listOutput);
    ListInput listInput = new ListInput();
    testblackJack.setUserInput(listInput);

    testblackJack.initiate();
    assertEquals(BlackJackActions.TWIST, testblackJack.getPlayerAction(testblackJack.players.get(0)));
}

@Test
    void determineWinner(){
        //By placing a non-random set of cards in one of the initiated players hands,
        //We  can test some basic, overall functionality of the determineWinner method
    ListInput listInput = new ListInput();
    testblackJack.setUserInput(listInput);
    testblackJack.initiate();
    Hand testHand = new Hand();
    Card testCard = new Card("SA");
    Card testCard2 = new Card("DK");
    testHand.add(testCard);
    testHand.add(testCard2);

    testblackJack.players.get(0).setHand(testHand);

    //With cards played in Player 0s hand, blackjacks implementation of the determineWinner method
    //should always return their player object
    assertEquals(testblackJack.players.get(0), testblackJack.determineWinner(testblackJack.players));

    }


}