package LLD.CacheLLD.Services;
import LLD.CacheLLD.DTOs.*;
import LLD.CacheLLD.Enums.*;
import LLD.CacheLLD.Eviction.*;
import LLD.CacheLLD.factories.*;

public class CacheManager{
    int capacity;
    PolicyEviction policy;
    public CacheManager(int capacity,String str_policy){
        this.capacity = capacity;
        policy = PolicyFactory.createPolicy(capacity,str_policy);
    }
    public void put(int key, char value){
        policy.put(key,value);
    }
    public char get(int key){
        return policy.get(key);
    }
    public void switchPolicy(String str_policy){
        if(PolicyType.valueOf(str_policy)==policy.getPolicyType()) return;
        PolicyEviction newPolicy = PolicyFactory.createPolicy(capacity,str_policy);
        while(policy.getSize()>0){
            Node removedNode = policy.remove();
            newPolicy.put(removedNode.getKey(), removedNode.getValue());
        }
        this.policy = newPolicy;
        
    }
}