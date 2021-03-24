package memento;

import java.util.Stack;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/23/2021 8:39 PM
 */
public class Editor {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createState(){
        var state = new EditorState(content);
        return state;
    }

    public void restoreState(EditorState state){
        content = state.getContent();
    }
}
