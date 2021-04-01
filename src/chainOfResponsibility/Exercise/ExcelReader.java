package chainOfResponsibility.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 5:43 PM
 */
public class ExcelReader extends Handler {
    public ExcelReader(Handler handler) {
        super(handler);
    }

    @Override
    public boolean doHandle(Data data) {
        if(data.getFileName().endsWith(".xls")) {
            System.out.println("Reading excel file");
            return true;
        }
        return false;
    }
}
