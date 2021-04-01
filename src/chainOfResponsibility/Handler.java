package chainOfResponsibility;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 4:26 PM
 */
public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request){

        if(doHandle(request))
            return;

        if (next!=null)
            next.handle(request);

    }

    abstract boolean doHandle(HttpRequest request);
}
