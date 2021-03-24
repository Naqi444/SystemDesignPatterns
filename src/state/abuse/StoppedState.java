package state.abuse;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/23/2021 11:36 PM
 */
public class StoppedState implements State {

    private Stopwatch stopwatch;
    public StoppedState(Stopwatch stopwatch){
        this.stopwatch = stopwatch;
    }

    @Override
    public void click() {
        stopwatch.setCurrentstate(new RunningState(stopwatch));
        System.out.println("Running");
    }
}
