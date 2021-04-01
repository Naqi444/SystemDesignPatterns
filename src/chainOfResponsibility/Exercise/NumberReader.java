package chainOfResponsibility.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 5:45 PM
 */
public class NumberReader extends Handler {

    public NumberReader(Handler handler) {
        super(handler);
    }

    @Override
    public boolean doHandle(Data data) {
        if(data.getFileName().endsWith(".numbers")) {
            System.out.println("Reading numbers file");
            return true;
        }
        else
            return false;
    }
}
