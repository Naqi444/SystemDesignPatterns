package command.Editor;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 2:32 AM
 */
public class UndoCommand implements Command {
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if(history.size()>0)
            history.pop().unexecute();

    }
}
