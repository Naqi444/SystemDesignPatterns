package state;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/23/2021 10:27 PM
 */
public class Main {
    public static void main(String [] args){
        var canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }

}
