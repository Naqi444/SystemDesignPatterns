package observer;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/26/2021 12:00 AM
 */
public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var spreadSheet = new Spreadsheet(dataSource);
        var chart = new Chart(dataSource);
        dataSource.addObserver(spreadSheet);
        dataSource.addObserver(chart);
        dataSource.setValue("Test1");
        dataSource.notifyObserver();
        dataSource.setValue("Test2");
        dataSource.notifyObserver();
    }
}
