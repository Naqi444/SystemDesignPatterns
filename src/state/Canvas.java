package state;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/23/2021 10:27 PM
 */
public class Canvas {

    private Tool currentTool;

    public void mouseDown(){
        currentTool.mouseDown();
    }

    public void mouseUp(){
        currentTool.mouseUp();
    }

    public Tool getCurrentTool(){
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool){
        this.currentTool = currentTool;
    }
}
