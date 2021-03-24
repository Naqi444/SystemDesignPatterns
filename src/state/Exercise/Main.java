package state.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/24/2021 12:25 AM
 */
public class Main {

    public static void main(String [] args){
        var directionservice = new DirectionService();
        directionservice.setTravelMode(new Bicycling());
        directionservice.getDirection();
        directionservice.getEta();
    }
}
