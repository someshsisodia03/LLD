package LLD.CacheLLD.DTOs;
public class DLL {
    private Node front;
    private Node back;
    public DLL(Node front, Node back){
        this.front=front;
        this.back=back;
        front.setNext(back);
        back.setPrev(front);
    }
    public Node getFront(){
        return this.front;
    }
    public Node getBack(){
        return this.back;
    }
    
}