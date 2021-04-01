package flyweight;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 8:37 PM
 */
public class PointIcon {
    private final PointType type;
    private final byte[] icon;

    public PointIcon(PointType type, byte[] icon) {
        this.type = type;
        this.icon = icon;
    }

    public PointType getType() {
        return type;
    }
}
