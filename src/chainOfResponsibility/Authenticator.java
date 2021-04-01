package chainOfResponsibility;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 3:42 PM
 */
public class Authenticator extends Handler{

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        var isValid = (request.getUsername().equals("admin") &&
                request.getPassword().equals("1234"));
        System.out.println("Authenticating");
        return !isValid;
    }
}
