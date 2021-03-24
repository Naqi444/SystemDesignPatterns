package state.abuse;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/23/2021 11:23 PM
 */
public class Stopwatch {

    private State currentstate = new StoppedState(this);


    public void click(){
        currentstate.click();
    }

    public State getCurrentstate() {
        return currentstate;
    }

    public void setCurrentstate(State currentstate) {
        this.currentstate = currentstate;
    }
}
