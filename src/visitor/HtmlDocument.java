package visitor;

import visitor.HtmlNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 5:35 AM
 */
public class HtmlDocument {

    private List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node) {
        nodes.add(node);
    }

    public void execute(Operation operation) {
        for (var node : nodes)
            node.execute(operation);
    }
}