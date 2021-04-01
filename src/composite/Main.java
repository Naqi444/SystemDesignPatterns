package composite;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 12:40 PM
 */
public class Main {
    public static void main(String[] args) {
        var group1 = new Group();
        group1.add(new Shape());
        group1.add(new Shape());

        var group2 = new Group();
        group2.add(new Shape());
        group2.add(new Shape());

        var group = new Group();
        group.add(group1);
        group.add(group2);

        group.render();
    }
}
