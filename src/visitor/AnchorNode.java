package visitor;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 5:28 AM
 */
public class AnchorNode implements HtmlNode{
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
