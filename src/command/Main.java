package command;

import command.fx.Button;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 12:59 AM
 */
public class Main {
    public static void main(String[] args) {
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();

    }
}
