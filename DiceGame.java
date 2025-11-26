/**************************
 * Tony Boyle Jr
 * 11/26/2025
 * Assignment: SDC330 Performance Assessment - Abstraction
 * public abstract class 
 **************************/
public class DiceGame extends BoardGame {

    // Constructor
    public DiceGame(String name, int numPlayers, int maxMove) {
        super(name, numPlayers, maxMove);
    }

    // Implement the startGame method
    @Override
    public String startGame() {
        return "The dice game " + super.toString() + " is starting. Players will roll the dice!";
    }

    // Implement the startTurn method
    @Override
    public String startTurn() {
        return "It's player’s turn to roll the dice!";
    }
}