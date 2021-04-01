package command.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 9:32 PM
 */
public class UndoCommand implements Command {
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size() > 0)
            history.pop().undo();
    }
}
