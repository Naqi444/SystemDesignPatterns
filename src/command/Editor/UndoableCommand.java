package command.Editor;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 2:22 AM
 */
public interface UndoableCommand extends Command{
    void unexecute();
}
