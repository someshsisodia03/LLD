package LLD.CacheLLD.factories;
import LLD.CacheLLD.DTOs.*;
import LLD.CacheLLD.Enums.*;
public class SLLFactory{

    public static SLL createSLL(PolicyType policyType){
        Node head = NodeFactory.createNode(policyType, -1, '*');
        return new SLL(head);
    }

}