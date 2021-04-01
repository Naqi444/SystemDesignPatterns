package observer.Exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/26/2021 1:21 AM
 */
public abstract class Subject {
    List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer obs){
        observers.add(obs);
    }
    public void removeObserver(Observer obs){
        observers.remove(obs);
    }

    public void notifyObservers(){
        for(var obs:observers){
            obs.update();
        }
    }
}
