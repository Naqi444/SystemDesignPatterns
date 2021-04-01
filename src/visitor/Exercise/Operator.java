package visitor.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 4:35 AM
 */
public interface Operator {
    //Overloaded operators
    void filter(FactSegment factSegment);
    void filter(FormatSegment formatSegment);
}
