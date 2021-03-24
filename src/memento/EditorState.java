package memento;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/23/2021 9:12 PM
 */
public class EditorState {
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
