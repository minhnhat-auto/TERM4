
package labwk06;


public class LabWk06 {

    
    public static void main(String[] args) {
        LinkList l1 = new LinkList();
        l1.addFront(1, 9.9);
        l1.addFront(2, 8.9);
        l1.addFront(3, 7.9);
        l1.addFront(4, 6.9);
        
        System.out.println(l1.printItems());
        
        l1.addLast(1, 6.6);
        l1.addLast(3, 7.7);
        l1.addLast(2, 8.9);
        l1.addLast(4, 6.9);
        
        System.out.println(l1.printItems());
    }
    
    
}
