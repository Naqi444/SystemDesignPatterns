package command.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 10:53 PM
 */
public class Main {
    public static void main(String [] args) {
        var videoEditor = new VideoEditor();
        var history = new History();

        var TextCommand = new TextCommand("Video Title", videoEditor, history);
        TextCommand.execute();
        System.out.println("TEXT: " + videoEditor);

        var setContrast = new ContrastCommand(1, videoEditor, history);
        setContrast.execute();
        System.out.println("CONTRAST: " + videoEditor);

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);
    }
}
