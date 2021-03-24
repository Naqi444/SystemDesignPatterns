package iterator.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public void push(Product product){
    products.add(product);
  }

  public Product pop(){
    var lastIndex = products.size()-1;
    var lastProduct = products.get(lastIndex);
    products.remove(lastProduct);
    return lastProduct;
  }


  class ListIterator implements Iterator{

    private int index;
    private ProductCollection collection;

    public ListIterator(ProductCollection collection){
      this.collection = collection;
    }

    @Override
    public boolean hasNext() {
      return index< collection.products.size();
    }

    @Override
    public Product current() {
      return collection.products.get(index);
    }

    @Override
    public void next() {
      index++;
    }
  }
}
