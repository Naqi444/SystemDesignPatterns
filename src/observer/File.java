package observer;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/26/2021 12:30 AM
 */
public class File implements Observer {
    @Override
    public void update() {
        System.out.println("File updated");;
    }
}
