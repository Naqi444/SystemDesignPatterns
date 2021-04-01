package strategy;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/24/2021 9:10 PM
 */
public class ImageStorage {

    public void store(String fileName, Compressor compressor, Filter filter) {
        //Compression like JPEG, PNG, ...
        //Filters like B&W, High Contrast ...
        compressor.compress(fileName);
        filter.filter(fileName);
    }

}
