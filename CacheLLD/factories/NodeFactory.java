package LLD.CacheLLD.factories;
import LLD.CacheLLD.DTOs.*;
import LLD.CacheLLD.Enums.*;
public class NodeFactory {
    public static Node createNode(PolicyType policyType, int key, char value){
        switch(policyType){
            case FIFO:
                return new FIFONode(key, value);
            case LRU:
                return new LRUNode(key, value);
            default:
                throw new IllegalArgumentException("Invalid policy type");
        }
    }
}