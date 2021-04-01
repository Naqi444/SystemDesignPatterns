package adapter;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/30/2021 2:02 PM
 */
public class ImageView {
    private Image image;

    public ImageView(Image image) {
        this.image = image;
    }

    public void apply(Filter filter){
        filter.apply(image);
    }
}
