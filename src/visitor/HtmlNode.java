package visitor;

import visitor.Operation;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 5:28 AM
 */
public  interface HtmlNode {
     void execute(Operation operation);
}
