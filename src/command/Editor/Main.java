package command.Editor;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 2:29 AM
 */
public class Main {
    public static void main(String[] args) {
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document,history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
