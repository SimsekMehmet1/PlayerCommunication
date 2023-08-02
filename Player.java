// A Player class that implements the Messageable interface, meaning it can send and receive messages.
public class Player implements Messageable {
    // The name of the player
    private String name;

    // A counter to keep track of how many messages this player has sent
    private int messageCount;

    // Constructor to initialise a new Player. It needs a name as input.
    public Player(String name) {
        this.name = name;
        this.messageCount = 0;
    }

    // Implementation of the sendMessage method from the Messageable interface.
    // It prints a message to the console, sends the message to the receiver,
    // and then receives a reply from the receiver.
    @Override
    public void sendMessage(String message, Messageable receiver) {
        // Print the message
        System.out.println(this.name + " sends message: " + message);

        // Send the message and receive a reply
        String reply = receiver.receiveMessage(message);

        // Receive the reply message
        this.receiveMessage(reply);
    }

    // Implementation of the receiveMessage method from the Messageable interface.
    // It prints a message to the console, increases the message count,
    // and returns a reply message that includes the received message and the current message count.
    @Override
    public String receiveMessage(String message) {
        // Print the message
        System.out.println(this.name + " received message: " + message);

        // Increase the message count
        this.messageCount++;

        // Construct a reply message
        String reply = message + " " + this.messageCount;

        // Return the reply message
        return reply;
    }
}
