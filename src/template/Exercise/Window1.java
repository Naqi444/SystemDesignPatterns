package template.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 12:25 AM
 */
public class Window1 extends Window{

    @Override
    protected void beforeAction() {
        System.out.println("Performing actions before closing Window 1");
    }

    @Override
    protected void afterAction() {
        System.out.println("Performing actions after closing Window 1");
    }
}
