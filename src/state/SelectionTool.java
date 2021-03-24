package state;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/23/2021 10:56 PM
 */
public class SelectionTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("dashed rectangle");
    }
}
