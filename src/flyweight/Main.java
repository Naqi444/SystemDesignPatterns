package flyweight;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 8:17 PM
 */
public class Main {
    public static void main(String[] args) {
        var service = new PointService(new PointIconFactory());
        for (var point: service.getPoints())
            point.draw();
    }
}
