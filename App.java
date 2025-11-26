/**************************
 * Tony Boyle Jr
 * 11/26/2025
 * Assignment: SDC330 Performance Assessment - Abstraction
 *****************************/

public class App {
    public static void main(String[] args) {
        // Print header
        System.out.println("Your Name - Week 3 Abstraction Performance Assessment");
        
        // Create instances of each concrete class
        CardGame cardGame = new CardGame("Poker", 4, 5);
        DiceGame diceGame = new DiceGame("Yahtzee", 2, 6);
        SpinnerGame spinnerGame = new SpinnerGame("Spin the Wheel", 3, 10);

        // Print game information
        System.out.println("\nCard Game Information:");
        System.out.println(cardGame.startGame());
        System.out.println(cardGame.startTurn());
        System.out.println(cardGame.endTurn());
        System.out.println(cardGame.toString());

        System.out.println("\nDice Game Information:");
        System.out.println(diceGame.startGame());
        System.out.println(diceGame.startTurn());
        System.out.println(diceGame.endTurn());
        System.out.println(diceGame.toString());

        System.out.println("\nSpinner Game Information:");
        System.out.println(spinnerGame.startGame());
        System.out.println(spinnerGame.startTurn());
        System.out.println(spinnerGame.endTurn());
        System.out.println(spinnerGame.toString());
    }
}