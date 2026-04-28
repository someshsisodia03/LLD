package LLD.PubSubModel.Publishers;
import LLD.PubSubModel.Events.*;
import LLD.PubSubModel.Subscribers.*;

public interface Publisher{
    void notification();
    void subscribe(Subscriber subscriber);
    void unSubscribe(Subscriber subscriber);
    Event getEvent();
}