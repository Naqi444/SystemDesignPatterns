package proxy;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 10:33 PM
 */
public class Main {
    public static void main(String[] args) {
        var libray = new Library();
        String[] fileNames = {"a","b","c"};
        for (var fileName:fileNames)
            libray.add(new LoggingEbookProxy(fileName));
        libray.openEbook("a");
    }
}
