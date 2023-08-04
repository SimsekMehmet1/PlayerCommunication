# PlayerCommunication
A basic Java console application that simulates a simple mesaage exchane between two players. I demonstarates the concept of interfaces in Java and how classes can implement interfaces to provide certain functionality.

The program revolves around the Messagable interface and the Player class that implements this interface

Messagable is an interface that declares two methods that any class implementing this interface must provide

sendMessafe() is a method that is meant to send a message from one Messageable object to another. The method takes the message and the reciever as inputs.

The Player class implements the Messageable interface abd must provide an implementation for both methods declared in the interface.

Each player object has a name and a message count which tracks the number of messages the player has received.

In the sendMessage method the player prints the sent message to the console, sends the message to the receiver, and then receives a reply from the receiver.

in the receiveMessage method, the player prints the received message to the console, increments its message count and creates a reply message that includes the received message and the current message count.

The Main class is the driver class for the prgram. It creates two Player objects player1 and player2 and simulates a message exchanges between them.
