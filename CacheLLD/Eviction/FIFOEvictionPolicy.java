package LLD.CacheLLD.Eviction;
import LLD.CacheLLD.DTOs.*;
import LLD.CacheLLD.Enums.*;
import LLD.CacheLLD.factories.*;
import java.util.HashMap;
public class FIFOEvictionPolicy implements PolicyEviction{
    private int sze=0;
    private final int capacity;
    private SLL sll = SLLFactory.createSLL(PolicyType.FIFO);
    private HashMap<Integer, Character> cache = new HashMap<>();
    public FIFOEvictionPolicy(int capacity){
        this.capacity = capacity;
    }
    @Override
    public char get(int key) {
        if(cache.containsKey(key)){
            return cache.get(key);
        }
        else{
            throw new RuntimeException("Key not found");
        }
    }
    @Override
    public void put(int key, char value) {
        if(cache.containsKey(key)){
            cache.put(key, value);
        }
        else{
            if(sze==capacity) remove();
            Node newNode = NodeFactory.createNode(PolicyType.FIFO,key, value);
            add(newNode);
            cache.put(key, value);
            sze++;
        }
    }
    private void add(Node node){
        Node tail = sll.getTail();
        tail.setNext(node);
        node.setNext(null);
        sll.setTail(node);
    }
    @Override
    public Node remove(){
        if (sll.getHead().getNext() == null) return null;
        Node removedNode = sll.getHead().getNext();
        sll.getHead().setNext(removedNode.getNext());
        if(removedNode.getNext() == null) {
            sll.setTail(sll.getHead());
        }
        cache.remove(removedNode.getKey());
        sze--;
        return removedNode;
    }
    @Override
    public PolicyType getPolicyType() {
        return PolicyType.FIFO;
    }
    @Override
    public int getSize() {
        return sze;
    }
    @Override
    public int getCapacity() {
        return capacity;
    }

}