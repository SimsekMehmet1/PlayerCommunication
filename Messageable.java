// An interface that specifies what methods a class should implement if it wants to send and receive messages.
public interface Messageable {
    // Method to send a message. It needs the message and the receiver as input.
    void sendMessage(String message, Messageable receiver);

    // Method to receive a message. It needs the incoming message as input.
    // It returns a reply message.
    String receiveMessage(String message);
}
