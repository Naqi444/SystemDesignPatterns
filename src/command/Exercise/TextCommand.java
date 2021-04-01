package command.Exercise;

import command.Editor.UndoableCommand;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 9:37 PM
 */
public class TextCommand extends AbstractUndoableCommand {
    private String prevContent;

    public TextCommand(String text, VideoEditor videoEditor,History history) {
        super(videoEditor,history);
        this.prevContent  = text;
    }

    @Override
    public void undo() {
        videoEditor.removeText();
    }

    @Override
    public void doExecute() {
        videoEditor.setText(prevContent);
    }
}
