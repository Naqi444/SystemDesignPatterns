package template;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/24/2021 11:15 PM
 */
public class Main {
    public static void main(String[] args) {
        var task1 = new TransferMoneyTask();
        task1.execute();
        var task2 = new GenerateReport();
        task2.execute();
        task1.doexecute();
    }
}
