package command.fx;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 1:00 AM
 */
public class Button {
    private String label;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click(){
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
