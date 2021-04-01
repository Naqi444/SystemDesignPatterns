package proxy;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 10:27 PM
 */
public class RealEbook implements Ebook {
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load(){
        System.out.println("Loading the ebook"+fileName);
    }

    @Override
    public void show(){
        System.out.println("Showing the ebook" + fileName);
    }

    @Override
    public String getFileName(){
        return fileName;
    }
}
