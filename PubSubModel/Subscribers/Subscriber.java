package LLD.PubSubModel.Subscribers;
import LLD.PubSubModel.Publishers.*;
public interface Subscriber {
    void update(Publisher p);
}