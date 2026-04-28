package LLD.PubSubModel.Subscribers;
import LLD.PubSubModel.Publishers.*;
import java.util.*;

public class HighlightsBoard implements Subscriber{
    List<Publisher>publishers;
    public HighlightsBoard(List<Publisher>p){
        this.publishers=p;
        for(Publisher publisher:publishers){
            publisher.subscribe(this);
        }
    }
    @Override
    public void update(Publisher p){
        p.getEvent().getHighlightsData();
    }
    public void unPublish(){
        for(Publisher publisher:publishers){
            publisher.unSubscribe(this);
        }
    }
}