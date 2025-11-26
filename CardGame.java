/**************************
 * Tony Boyle Jr
 * 11/26/2025
 * Assignment: SDC330 Performance Assessment - Abstraction
 * Concrete implementation of a Card Game, inheriting from Game and implementing 
 * the abstract methods for start, turn, and end
 *****************************/

public class CardGame extends Game {
    private int numCards;  // Number of cards dealt to each player

    // Constructor
    public CardGame(String name, int numPlayers, int numCards) {
        super(name, numPlayers);
        this.numCards = numCards;
    }

    // Implement the startGame method
    @Override
    public String startGame() {
        return "The card game " + super.toString() + " is starting with " + numCards + " cards dealt to each player.";
    }

    // Implement the startTurn method
    @Override
    public String startTurn() {
        return "The turn has started. Players are ready to play their cards.";
    }

    // Implement the endTurn method
    @Override
    public String endTurn() {
        return "The turn has ended. Players have finished their moves.";
    }

    // toString method for CardGame details
    @Override
    public String toString() {
        return super.toString() + "\nCards per player: " + numCards;
    }
}