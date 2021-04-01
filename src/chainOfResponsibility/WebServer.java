package chainOfResponsibility;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 3:40 PM
 */
public class WebServer {

    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request){
        handler.handle(request);
    }
}
