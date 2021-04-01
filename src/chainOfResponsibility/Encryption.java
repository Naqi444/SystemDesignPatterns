package chainOfResponsibility;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 5:17 PM
 */
public class Encryption extends Handler {

    public Encryption(Handler next) {
        super(next);
    }

    @Override
    boolean doHandle(HttpRequest request) {
        System.out.println("Encrypting");
        return false;
    }
}
