package observer.Exercise;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer {
    private Stock stock;
    private List<Stock> stocks = new ArrayList<>();

    public StockListView(Stock stock) {
        this.stock = stock;
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }
    @Override
    public void update() {
       stocks.add(stock);
       System.out.println("stock added to stock list view");
    }
}
