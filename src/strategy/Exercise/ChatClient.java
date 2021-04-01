package strategy.Exercise;

public class ChatClient {
    public void send(String message, Encryption encryption) {
        encryption.encrypt(message);
    }
}
