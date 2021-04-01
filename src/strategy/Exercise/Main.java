package strategy.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/24/2021 10:21 PM
 */

public class Main {

    public static void main(String[] args) {
        var chatclient = new ChatClient();
        chatclient.send("How are you", new AES());
    }
}
