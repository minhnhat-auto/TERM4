
package binarysearchtree;

public class MyQueue {
    private LinkedNode head,tail;
    
    public MyQueue(){
        head=tail=null;
    }
    
    public void enQueue(BNode item){
        LinkedNode newNode = new LinkedNode(item);
        if (head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;      
    }
    
    public BNode deQueue(){
        if (head== null) return null;
        BNode temp = head.data;
        head=head.next;
        return temp;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    
}
