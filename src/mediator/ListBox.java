package mediator;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/26/2021 10:28 PM
 */
public class ListBox extends UIControl{

    private String selection;

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        notifyEventHandlers();
    }
}
