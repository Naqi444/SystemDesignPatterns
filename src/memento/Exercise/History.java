package memento.Exercise;

import java.util.Stack;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/23/2021 10:10 PM
 */
public class History {
    private Stack<DocumentState> states = new Stack<>();

    public void push(DocumentState state){
        states.push(state);
    }

    public DocumentState pop(){
        return states.pop();
    }


}
