package bridge;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 10:11 PM
 */
public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int number){
        device.setChannel(number);
    }
}
