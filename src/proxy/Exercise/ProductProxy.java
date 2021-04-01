package proxy.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/31/2021 1:24 AM
 */
public class ProductProxy extends Product {
    private DbContext context;

    public ProductProxy(int id, DbContext context) {
        super(id);
        this.context = context;
    }


    @Override
    public void setName(String name) {
        super.setName(name);
        context.markAsChanged(this);
    }
}
