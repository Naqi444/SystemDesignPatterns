package flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 8:15 PM
 */
public class PointService {
    private PointIconFactory iconFactory;

    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
    }

    public List<Point> getPoints(){
        List<Point> points = new ArrayList<>();
        var point = new Point(1,2,iconFactory.getPointIcon(PointType.CAFE));
        points.add(point);
        return points;
    }
}
