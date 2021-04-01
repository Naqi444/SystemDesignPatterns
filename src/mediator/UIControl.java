package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/26/2021 10:27 PM
 */
public abstract class UIControl{
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler){
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandlers(){
        for (var eventHandler: eventHandlers)
            eventHandler.handle();
    }
}
