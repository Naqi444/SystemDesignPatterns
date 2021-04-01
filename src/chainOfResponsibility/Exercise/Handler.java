package chainOfResponsibility.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 5:28 PM
 */
public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(Data data){
        if(doHandle(data))
            return;
        if(next!=null)
            next.handle(data);
    }
    public abstract boolean doHandle(Data data);
}
