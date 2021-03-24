package memento;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/23/2021 8:47 PM
 */
public class Main {
    public static void main(String[] args){
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");

        editor.restoreState(history.pop());
        editor.restoreState(history.pop());
        editor.restoreState(history.pop());

        System.out.println(editor.getContent());
    }

}
