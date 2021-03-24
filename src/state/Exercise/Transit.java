package state.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/24/2021 12:15 AM
 */
public class Transit implements TravelMode{
    @Override
    public void getEta() {
        System.out.println("Calculating ETA (transit)");
    }

    @Override
    public void getDirection() {
        System.out.println("Calculating Direction (transit)");
    }
}
