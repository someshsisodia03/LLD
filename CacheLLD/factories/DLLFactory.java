package LLD.CacheLLD.factories;
import LLD.CacheLLD.DTOs.*;
import LLD.CacheLLD.Enums.*;

public class DLLFactory {
    
    public static DLL createDLL(PolicyType policyType){
        Node front = NodeFactory.createNode(policyType,-1,'-');
        Node back = NodeFactory.createNode(policyType,-1,'-');
        return new DLL(front, back);
    }

}