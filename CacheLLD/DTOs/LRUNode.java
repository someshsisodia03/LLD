package LLD.CacheLLD.DTOs;
public class LRUNode implements Node {
    private final int key;
    private char value;
    private Node prev;
    private Node next;

    public LRUNode(int key, char value) {
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    @Override
    public int getKey() {
        return key;
    }
    
    @Override
    public char getValue() {
        return value;
    }

    @Override
    public void setValue(char value) {
        this.value = value;
    }
    @Override
    public Node getPrev() {
        return prev;
    }
    @Override
    public void setPrev(Node prev) {
        this.prev = prev;
    }
    
    @Override
    public Node getNext() {
        return next;
    }
    
    @Override
    public void setNext(Node next) {
        this.next = next;
    }
    
}