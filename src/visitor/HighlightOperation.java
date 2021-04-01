package visitor;

import visitor.Operation;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 5:25 AM
 */
public class HighlightOperation implements Operation
{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("highlight-heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("highlight anchor node");
    }
}
