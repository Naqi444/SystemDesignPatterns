package chainOfResponsibility.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 5:46 PM
 */
public class QuickBook extends Handler {

    public QuickBook(Handler handler) {
        super(handler);
    }

    @Override
    public boolean  doHandle(Data data) {
        if(data.getFileName().endsWith(".qbw")) {
            System.out.println("Reading quickbook file");
            return true;
        }
        return false;
    }
}
