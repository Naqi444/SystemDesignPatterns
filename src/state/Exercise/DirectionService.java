package state.Exercise;

public class DirectionService {
    private TravelMode travelMode;

    public void getEta() {
        travelMode.getEta();
    }

    public void getDirection() {
        travelMode.getDirection();
    }

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }
}
