package command.Editor;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 2:22 AM
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
