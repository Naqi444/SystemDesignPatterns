package bridge;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 10:07 PM
 */
public class SonyTV implements Device{

    @Override
    public void turnOn() {
        System.out.println("SonyL turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sony: setChannel");
    }
}
