package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/24/2021 12:36 AM
 */
public class BrowseHistory {
    private String[] urls = new String[10];
    private  int count;

    public void push(String url){
        urls[count++]=url;
    }

    public String pop(){
        return urls[--count];
    }

    public String[] getUrls(){
        return urls;
    }

    public Iterator createIterator(){
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator{

        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history){

            this.history = history;
        }
        @Override
        public boolean hasNext() {
            return (index<history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
