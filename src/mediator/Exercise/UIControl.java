package mediator.Exercise;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    List<EventHandler> eventHandlerList = new ArrayList<>();

    public void addEventHandler(EventHandler eventHandler){
        eventHandlerList.add(eventHandler);
    }

    public void notifyEventHandlers(){
        for (var eventhandler: eventHandlerList){
            eventhandler.handle();
        }
    }
}
