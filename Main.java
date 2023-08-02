// The Main class that starts the program
public class Main {
    // The main method that is executed when the program starts
    public static void main(String[] args) {
        // Create a new Player instance called player1
        Player player1 = new Player("Initiator");

        // Create a new Player instance called player2
        Player player2 = new Player("Responder");

        // Have player1 send 10 messages to player2
        for (int i = 0; i < 10; i++) {
            player1.sendMessage("Hello " + i, player2);
        }
    }
}
