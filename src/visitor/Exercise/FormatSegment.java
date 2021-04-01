package visitor.Exercise;

public class FormatSegment extends Segment {
    @Override
    public void execute(Operator filter) {
        filter.filter(this);
    }
}
