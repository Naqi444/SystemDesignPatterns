package adapter;

import adapter.avaFilters.Caramel;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 2:04 PM
 */
public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new Vivid());
        imageView.apply(new MyCaramel(new Caramel()));
    }
}

