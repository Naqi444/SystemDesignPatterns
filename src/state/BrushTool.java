package state;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/23/2021 10:57 PM
 */
public class  BrushTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
