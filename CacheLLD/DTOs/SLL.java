package LLD.CacheLLD.DTOs;
public class SLL {
    private Node head;
    private Node tail;
    public SLL(Node head){
        this.head=head;
        this.tail=head;
    }
    public Node getHead(){
        return head;
    }
    public Node getTail(){
        return tail;
    }
    public void setTail(Node tail) {
        this.tail = tail;
    }
}