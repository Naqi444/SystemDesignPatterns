package bridge;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 10:10 PM
 */
public class Main {
    public static void main(String[] args) {
        var remoteControl = new AdvancedRemoteControl(new SonyTV());
        remoteControl.turnOn();

    }
}
