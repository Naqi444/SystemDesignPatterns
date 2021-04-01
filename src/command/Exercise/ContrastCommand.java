package command.Exercise;

import command.Editor.UndoableCommand;

import javax.swing.undo.AbstractUndoableEdit;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 9:39 PM
 */
public class ContrastCommand extends AbstractUndoableCommand {
    private float prevContrast;
    private float contrast;

    public ContrastCommand(float contrast, VideoEditor videoEditor, History history) {
        super(videoEditor,history);
        prevContrast = videoEditor.getContrast();
        this.contrast = contrast;
    }

    @Override
    public void doExecute() {
        videoEditor.setContrast(contrast);
    }

    @Override
    public void undo() {
        videoEditor.setContrast(prevContrast);
    }
}
