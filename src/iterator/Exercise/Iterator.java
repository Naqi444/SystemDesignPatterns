package iterator.Exercise;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/24/2021 3:23 AM
 */
public interface Iterator {
    boolean hasNext();
    Product current();
    void next();
}
