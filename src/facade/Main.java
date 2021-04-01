package facade;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 7:25 PM
 */
public class Main {

    public static void main(String[] args) {
        var notificationSerive= new NotificationService();
        notificationSerive.send("Hello World","target");

    }
}
