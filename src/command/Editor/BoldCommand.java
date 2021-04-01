package command.Editor;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 2:25 AM
 */
public class BoldCommand implements UndoableCommand {
    private String prevContent;
    private HtmlDocument document;
    private History history;

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }


    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }
}
