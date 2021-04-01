package bridge;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 10:09 PM
 */
public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn(){
        device.turnOn();
    }
    public void turnOff(){
        device.turnOff();
    }
}
