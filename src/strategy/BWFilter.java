package strategy;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/24/2021 9:56 PM
 */
public class BWFilter implements Filter {

    @Override
    public void filter(String filter) {
        System.out.println("Applying B&W filter");
    }
}
