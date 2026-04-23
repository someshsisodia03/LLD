package LLD.CacheLLD.factories;
import LLD.CacheLLD.Eviction.*;
public class PolicyFactory{
        public static PolicyEviction createPolicy(int n,String str_policy){
            if(str_policy.equals("LRU")){
                return new LRUEvictionPolicy(n);
            }
            else if(str_policy.equals("FIFO")){
                return new FIFOEvictionPolicy(n);
            }
            else{
                return null;
            }
        }
}