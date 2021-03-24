package state.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/24/2021 12:16 AM
 */
public class Walking implements TravelMode {
    @Override
    public void getEta() {
        System.out.println("Calculating ETA (walking)");
    }

    @Override
    public void getDirection() {
        System.out.println("Calculating Direction (walking)");
    }
}
