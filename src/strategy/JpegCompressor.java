package strategy;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/24/2021 9:52 PM
 */
public class JpegCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println("Applying Jpeg Compressor");
    }
}
