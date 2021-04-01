package visitor;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/28/2021 5:23 AM
 */
public interface Operation {
    void apply(HeadingNode heading);
    void apply(AnchorNode anchor);
}
