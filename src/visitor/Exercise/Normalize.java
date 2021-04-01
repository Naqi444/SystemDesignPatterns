package visitor.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 4:40 AM
 */
public class Normalize implements Operator{

    @Override
    public void filter(FactSegment segment) {
        System.out.println("Normalizing the fact segment");
    }

    @Override
    public void filter(FormatSegment segment) {
        System.out.println("Normalizing the Format Segment");
    }
}
