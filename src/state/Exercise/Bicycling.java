package state.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/24/2021 12:12 AM
 */
public class Bicycling implements TravelMode {
    @Override
    public void getEta() {
        System.out.println("Calculating ETA (bicycling)");
    }

    @Override
    public void getDirection() {
        System.out.println("Calculating Direction (bicycling)");
    }
}
