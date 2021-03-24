package memento;

import java.util.Stack;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/23/2021 9:12 PM
 */
public class History {
    private Stack<EditorState> states = new Stack<>();

    public void push(EditorState state) {
        states.push(state);
    }

    public EditorState pop() {
        return states.pop();
    }
}

