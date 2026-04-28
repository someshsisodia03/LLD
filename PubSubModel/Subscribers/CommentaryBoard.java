package LLD.PubSubModel.Subscribers;
import LLD.PubSubModel.Publishers.*;
import java.util.*;

public class CommentaryBoard implements Subscriber{
    List<Publisher>publishers;
    public CommentaryBoard(List<Publisher>p){
        this.publishers=p;
        for(Publisher publisher:publishers){
            publisher.subscribe(this);
        }
    }
    @Override
    public void update(Publisher p){
        p.getEvent().getCommentaryData();
    }
    public void unPublish(){
        for(Publisher publisher:publishers){
            publisher.unSubscribe(this);
        }
    }
}