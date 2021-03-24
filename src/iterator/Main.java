package iterator;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/24/2021 12:36 AM
 */
public class Main {
    public static void main(String [] args){
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()){
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
