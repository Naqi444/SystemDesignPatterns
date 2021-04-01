package observer.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/26/2021 1:34 AM
 */
public class Main {
    public static void main(String[] args) {
        var stock = new Stock("P",23);
        var stocklist = new StockListView(stock);
        stock.addObserver(stocklist);
        var statusbar = new StatusBar(stock);
        stock.addObserver(statusbar);
        stock.setPrice(34.0f);
    }
}
