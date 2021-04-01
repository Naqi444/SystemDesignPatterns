package command.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 10:08 PM
 */
public interface UndoableCommand extends Command{
    void undo();
}
