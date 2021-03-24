package state.abuse;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/23/2021 11:37 PM
 */
public class RunningState implements State {

    private Stopwatch stopwatch;
    public RunningState(Stopwatch stopwatch){
        this.stopwatch = stopwatch;
    }
    @Override
    public void click() {
        stopwatch.setCurrentstate(new StoppedState(stopwatch));
        System.out.println("Stopped");
    }
}
