package chainOfResponsibility;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 3:53 PM
 */
public class Compressor extends Handler
{
    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compress");
        return false;
    }

}
