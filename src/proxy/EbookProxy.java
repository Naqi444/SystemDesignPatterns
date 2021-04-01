package proxy;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/31/2021 12:57 AM
 */
public class EbookProxy implements Ebook{
    private String fileName;
    private RealEbook ebook;

    public EbookProxy(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void show() {
        //Checking if the book has to be loaded or not
        if(ebook == null)
            ebook = new RealEbook(fileName);
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
