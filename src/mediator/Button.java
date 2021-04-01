package mediator;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/26/2021 10:30 PM
 */
public class Button extends UIControl {
    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyEventHandlers();
    }
}
