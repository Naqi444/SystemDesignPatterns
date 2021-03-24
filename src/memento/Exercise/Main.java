package memento.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/23/2021 10:13 PM
 */
public class Main {
    public static  void main(String [] args){
        var document = new Document();
        var history = new History();

        document.setContent("A");
        document.setFontName("Arial");
        document.setFontSize(2);
        history.push(document.createDocumentState());

        document.setContent("B");
        document.setFontName("Times New Roman");
        document.setFontSize(4);
        history.push(document.createDocumentState());

        //Ctrl+Z
        document.restoreDocumentState(history.pop());
        document.restoreDocumentState(history.pop());

        System.out.println(document);
    }
}
