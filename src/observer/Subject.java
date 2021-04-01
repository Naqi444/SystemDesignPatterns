package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/26/2021 12:41 AM
 */

//Observable
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer obs){
        observers.add(obs);
    }

    public void removeObsesrver(Observer obs){
        observers.remove(obs);
    }

    public void notifyObserver(){
        for (Observer obs:observers){
            obs.update();
        }
    }
}
