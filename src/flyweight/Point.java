package flyweight;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 8:11 PM
 */
public class Point {
    private int x;
    private int y;
    private PointIcon icon;

    public Point(int x, int y, PointIcon icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }

    public void draw(){
        System.out.printf("%s at (%d,%d)",icon.getType(),x,y);
    }

}
