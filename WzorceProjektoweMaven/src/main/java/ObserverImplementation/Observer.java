package ObserverImplementation;

import java.util.ArrayList;
import java.util.List;

public abstract class Observer {

    List<Observable> subscribers;

    public Observer() {
        subscribers = new ArrayList<Observable>();
    }

    public void subscribe(Observable subscriber) {
        subscribers.add(subscriber);
    }

    public void sendToAll() {
        for (Observable subscriber : this.subscribers) {
            subscriber.readNewspaper(getName());
        }
    }
    protected abstract String getName();
}
