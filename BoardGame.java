/**************************
 * Tony Boyle Jr
 * 11/26/2025
 * Assignment: SDC330 Performance Assessment - Abstraction
 * public abstract class 
 **************************/
 public abstract class BoardGame extends Game {
    private int maxMove;  // Maximum move value a player can make

    // Constructor
    public BoardGame(String name, int numPlayers, int maxMove) {
        super(name, numPlayers);
        this.maxMove = maxMove;
    }

    // Implement the endTurn method
    @Override
    public String endTurn() {
        return "The turn has ended. Players have completed their moves, and the maximum move value was " + maxMove + ".";
    }

    // toString method for BoardGame details
    @Override
    public String toString() {
        return super.toString() + "\nMax Move: " + maxMove;
    }
}