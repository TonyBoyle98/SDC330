/**************************
 * Tony Boyle Jr
 * 11/26/2025
 * Assignment: SDC330 Performance Assessment - Abstraction
 *****************************/

public abstract class Game {
    private String name;  // Name of the game
    private int numPlayers; // Number of players

    // Constructor
    public Game(String name, int numPlayers) {
        this.name = name;
        this.numPlayers = numPlayers;
    }

    // Abstract method for starting the game
    public abstract String startGame();

    // Abstract method for starting a turn
    public abstract String startTurn();

    // Abstract method for ending a turn
    public abstract String endTurn();

    // toString method for displaying the game's details
    @Override
    public String toString() {
        return "Game: " + name + "\nNumber of Players: " + numPlayers;
    }
}