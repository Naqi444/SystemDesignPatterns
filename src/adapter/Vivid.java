package adapter;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 2:01 PM
 */
public class Vivid implements Filter {

    @Override
    public void apply(Image image) {
        System.out.println("Applying Vivid Filter");
    }
}
