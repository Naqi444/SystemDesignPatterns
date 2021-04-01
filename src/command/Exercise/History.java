package command.Exercise;


import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 9:30 PM
 */
public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand command){
        commands.add(command);
    }

    public UndoableCommand pop(){
        return commands.pop();
    }

    public int size(){
        return commands.size();
    }
}
