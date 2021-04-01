package decorator;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 5:04 PM
 */
public class CloudStream implements Stream{

    @Override
    public void write(String data) {
        System.out.println("Writing"+" " + data);
    }
}
