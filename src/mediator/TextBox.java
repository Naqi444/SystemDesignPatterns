package mediator;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/26/2021 10:29 PM
 */
public class TextBox extends UIControl {
    private String content;



    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    }
}
