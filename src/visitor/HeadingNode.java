package visitor;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 5:27 AM
 */
public class HeadingNode implements  HtmlNode{

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
