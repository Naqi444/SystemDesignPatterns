package proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 10:30 PM
 */
public class Library {
    private Map<String,Ebook> ebooks = new HashMap<>();

    public void add(Ebook ebook){
        ebooks.put(ebook.getFileName(),ebook);
    }

    public void openEbook(String fileName){
        ebooks.get(fileName).show();
    }
}
