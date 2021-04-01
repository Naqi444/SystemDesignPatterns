package command.Editor;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 2:19 AM
 */
public class HtmlDocument {

    private String content;

    public void makeBold(){
        content = "<b>"+content+"</b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
