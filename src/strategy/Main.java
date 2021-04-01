package strategy;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/24/2021 9:10 PM
 */
public class Main {

    public static void main(String [] args){
        var imageStorage = new ImageStorage();
        imageStorage.store("First Image",new JpegCompressor(),new BWFilter());
    }
}
