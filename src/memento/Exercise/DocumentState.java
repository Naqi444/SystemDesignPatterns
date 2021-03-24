package memento.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/23/2021 10:03 PM
 */
public class DocumentState {
    private final String content;
    private final String fontName;
    private final int fontSize;

    public DocumentState(String content,String fontName,int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }


    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }
}
