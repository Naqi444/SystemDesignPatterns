package observer;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/26/2021 12:01 AM
 */
public class Chart implements Observer {

    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("This value is updated" + (dataSource.getValue()));
    }
}
