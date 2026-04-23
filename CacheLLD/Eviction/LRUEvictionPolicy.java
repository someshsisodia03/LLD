package LLD.CacheLLD.Eviction;
import LLD.CacheLLD.DTOs.*;
import LLD.CacheLLD.Enums.PolicyType;
import LLD.CacheLLD.factories.*;
import java.util.HashMap;

public class LRUEvictionPolicy implements PolicyEviction {
    private final int capacity;
    private int size;
    private HashMap<Integer, Node> cache;
    private DLL dll = DLLFactory.createDLL(PolicyType.LRU);
    public LRUEvictionPolicy(int capacity){
        this.capacity = capacity;
        this.size = 0;
        this.cache = new HashMap<>();
    }
    @Override
    public char get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            removeNode(node);
            addNode(node);
            return node.getValue();
        }
        else{
            throw new RuntimeException("Key not found");
        }
    }

    @Override
    public void put(int key, char value) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            node.setValue(value);
            removeNode(node);
            addNode(node);
        }
        else{
            if(size >= capacity){
                remove();
            }
            Node node = NodeFactory.createNode(PolicyType.LRU, key, value);
            addNode(node);
            cache.put(key, node);
            size++;
        }
    }
    private void removeNode(Node node){
        Node prev = node.getPrev();
        Node next = node.getNext();
        prev.setNext(next);
        next.setPrev(prev);
        node.setPrev(null);
        node.setNext(null);
    }
    private void addNode(Node node){
        // Insert before back sentinel (most recently used)
        Node back = dll.getBack();
        Node lastNode = back.getPrev();
        lastNode.setNext(node);
        node.setPrev(lastNode);
        node.setNext(back);
        back.setPrev(node);
    }
    @Override
    public Node remove(){
        // Evict from front (least recently used = just after front sentinel)
        Node front = dll.getFront();
        Node lruNode = front.getNext();
        removeNode(lruNode);
        cache.remove(lruNode.getKey());
        size--;
        return lruNode;
    }
    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public int getSize() {
        return size;
    }
    @Override
    public PolicyType getPolicyType() {
        return PolicyType.LRU;
    }
}
