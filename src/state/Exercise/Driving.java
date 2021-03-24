package state.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/24/2021 12:14 AM
 */
public class Driving implements TravelMode {

    @Override
    public void getEta() {
        System.out.println("Calculating ETA (driving)");
    }

    @Override
    public void getDirection() {
        System.out.println("Calculating Direction (driving)");
    }
}
