package visitor;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 5:39 AM
 */
public class Main {
    public static void main(String[] args) {
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new HighlightOperation());
    }
}
