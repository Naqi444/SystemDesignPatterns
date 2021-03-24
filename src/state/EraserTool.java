package state;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/23/2021 11:05 PM
 */
public class EraserTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Select Eraser");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erase Something");
    }
}
