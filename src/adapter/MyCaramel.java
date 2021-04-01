package adapter;

import adapter.avaFilters.Caramel;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 2:26 PM
 */
public class MyCaramel implements Filter{

    private Caramel caramel;

    public MyCaramel(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
