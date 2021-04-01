package chainOfResponsibility;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 4:46 PM
 */
public class Main {
    public static void main(String[] args) {

        //Define the concrete handlers by giving the next handler which they will point to.
        var compressor = new Compressor(null);
        var encrypt = new Encryption(compressor);
        var logger = new Logger(encrypt);
        var authenticator = new Authenticator(logger);


        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin","1234"));
    }
}
