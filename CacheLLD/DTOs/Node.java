package LLD.CacheLLD.DTOs;
public interface Node {
    int getKey();
    char getValue();
    void setValue(char value);
    Node getNext();
    void setNext(Node next);
    Node getPrev();
    void setPrev(Node prev);
}
