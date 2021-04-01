package chainOfResponsibility.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 5:25 PM
 */
public class Main {
    public static void main(String[] args) {
        var excelReader = new ExcelReader(null);
        var numberReader = new NumberReader(excelReader);
        var dataReader = new DataReader(numberReader);
        dataReader.handle(new Data("Test.numbers"));
        dataReader.handle(new Data("data.xls"));
        dataReader.handle(new Data("data.numbers"));
        dataReader.handle(new Data("data.qbw"));
        dataReader.handle(new Data("data.xls"));
    }
}
