package proxy.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/31/2021 1:25 AM
 */
public class Product {
    private int id;
    private String name;

    public Product(int id) {
        this.id = id;
    }

    int getId(){
        return id;
    };

    String getName(){
        return name;
    };

    void setName(String name){
        this.name = name;
    }
}
