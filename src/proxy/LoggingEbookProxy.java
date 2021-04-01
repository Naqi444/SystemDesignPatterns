package proxy;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/31/2021 1:11 AM
 */
public class LoggingEbookProxy implements Ebook {
    private String fileName;
    private RealEbook ebook;

    public LoggingEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(ebook==null)
            ebook = new RealEbook(fileName);
        System.out.println("Logging");
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
