package composite;

import command.Exercise.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 12:35 PM
 */
public class Group implements Component {
    private List<Component> components = new ArrayList<>();

    public void add(Component component){
        components.add(component);
    }

    @Override
    public void render() {
        for (var component : components)
            component.render();
    }

    @Override
    public void move() {
        for(var component : components)
            component.move();
    }
}
