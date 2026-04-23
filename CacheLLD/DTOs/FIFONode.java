package LLD.CacheLLD.DTOs;
public class FIFONode implements Node {
    private final int key;
    private char value;
    private Node next;

    public FIFONode(int key, char value) {
        this.key = key;
        this.value = value;
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
    public Node getNext() {
        return next;
    }
    
    @Override
    public void setNext(Node next) {
        this.next = next;
    }
    @Override
    public Node getPrev() {
        return null;
    }
    @Override
    public void setPrev(Node prev) {
        // Do nothing as FIFO does not require a previous pointer
    }
    
}