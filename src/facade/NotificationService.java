package facade;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 7:40 PM
 */
public class NotificationService {
    public void send(String message , String target) {
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appID", "key");
        server.send(authToken, new Message(message),target);
        connection.disconnect();
    }
}
