package template.Exercise;

public abstract class Window {

    public void close() {
        beforeAction();
        System.out.println("Removing the window from the screen");
        afterAction();
    }

    protected abstract void beforeAction();
    protected abstract void afterAction();
}
