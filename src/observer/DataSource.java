package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/26/2021 12:00 AM
 */
public class DataSource extends Subject {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        notifyObserver();
    }
}
