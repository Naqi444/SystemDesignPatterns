package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 8:39 PM
 */
public class PointIconFactory {
    private Map<PointType,PointIcon> icons = new HashMap<>();
    public PointIcon getPointIcon(PointType type){
        if(icons.containsKey(type)){
            var icon = new PointIcon(type,null);
            icons.put(type,icon);
        }

        return icons.get(type);
    }
}
