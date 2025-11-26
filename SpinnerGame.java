/**************************
 * Tony Boyle Jr
 * 11/26/2025
 * Assignment: SDC330 Performance Assessment - Abstraction
 * public abstract class 
 **************************/
public class SpinnerGame extends BoardGame {

    // Constructor
    public SpinnerGame(String name, int numPlayers, int maxMove) {
        super(name, numPlayers, maxMove);
    }

    // Implement the startGame method
    @Override
    public String startGame() {
        return "The spinner game " + super.toString() + " is starting. Players are ready to spin!";
    }

    // Implement the startTurn method
    @Override
    public String startTurn() {
        return "It's player’s turn to spin the spinner!";
    }
}