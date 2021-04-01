package chainOfResponsibility;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 3:54 PM
 */
public class Logger extends Handler {

    public Logger(Handler next) {
        super(next);
    }

    @Override
    boolean doHandle(HttpRequest request) {
        System.out.println("Log");
        return false;
    }
}
