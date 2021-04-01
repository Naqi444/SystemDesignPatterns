package visitor.Exercise;

public class FactSegment extends Segment {

    @Override
    public void execute(Operator operation) {
        operation.filter(this);
    }
}
