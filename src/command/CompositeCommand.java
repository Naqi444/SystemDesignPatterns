package command;

import command.fx.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 1:56 AM
 */
public class CompositeCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public void add(Command command){
        commands.add(command);
    }
    @Override
    public void execute() {
        for (var command:commands)
            command.execute();
    }
}
