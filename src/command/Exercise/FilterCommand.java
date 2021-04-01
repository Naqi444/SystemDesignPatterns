package command.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 11:54 PM
 */
public class FilterCommand extends AbstractUndoableCommand{
    public FilterCommand(VideoEditor videoEditor, History history) {
        super(videoEditor, history);
    }

    @Override
    protected void doExecute() {

    }

    @Override
    public void undo() {

    }
}
