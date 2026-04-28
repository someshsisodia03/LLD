package LLD.PubSubModel.Publishers;
import LLD.PubSubModel.Events.*;
import LLD.PubSubModel.Subscribers.*;
import java.util.*;
public class CricketData implements Publisher{
    public List<Subscriber>subscribers;
    public Event event;
    public CricketData(Event event) {
        this.event=event;
    }
    @Override
    public void notification() {
        for( Subscriber subscriber:subscribers){
            subscriber.update(this);
        }        
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    @Override
    public Event getEvent(){
        return event;
    }
}