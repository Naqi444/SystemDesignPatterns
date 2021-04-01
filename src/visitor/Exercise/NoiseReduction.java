package visitor.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 4:39 AM
 */
public class NoiseReduction implements Operator {
    @Override
    public void filter(FactSegment factSegment) {
        System.out.println("Noise reducing the fact segment");
    }

    @Override
    public void filter(FormatSegment formatSegment) {
        System.out.println("Noise reducing the format segment");
    }
}
