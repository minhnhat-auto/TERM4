package labwk06;

public class LinkList {

    private Node head;

    public LinkList() {
        head = null;

    }

    public void addFront(int stuID, double gpa) {

        Student student = new Student(stuID, gpa);
        Node node = new Node(student);
        node.next = head;
        head = node;
    }

    public void addLast(int stuID, double gpa) {
        Student student = new Student(stuID, gpa);
        Node node = new Node(student);
        Node current = head;
        while (current.next != null && current != null) {
            current = current.next;
        }
        current.next = node;

    }

    public String printItems() {
        Node currNode = head;
        String s = "";
        while (currNode != null) {
            s += currNode.data.toString() + "\n";
            currNode = currNode.next;
        }
        return s;
    }

    public boolean search(int stdId) {
        Node curr = head;
        while (curr != null && curr.data.getStudentID() != stdId) {
            curr = curr.next;
        }
        if (curr == null) {
            return false;
        }
        return true;
    }

    public void addInorderAsc(int stuID, double gpa) {
        Student student = new Student(stuID, gpa);
        Node node = new Node(student);
        
       // case 1 the list is empty
       //  case 2 the item goes at the beginning of the list (addFront)
       if(head==null ||head.data.getStudentID() >= stuID){
        node.next = head;
        head = node;
       
    }
       // case 3 item goes naywhere else in the list
        Node curr = head, prev = head;
        while (curr != null && curr.data.getStudentID() < stuID) {
            prev = curr;
            curr = curr.next;
        }
        node.next = prev.next;
        prev.next = node;
    }
    
    public boolean delete(int studID){
        if(head == null){
            // nothing to delete
            return false;
        }
        if(head.data.getStudentID() ==  studID){
            // delete the first item
            head=head.next;
            return true;
        }
        //the item to be delete is somewhere in the list or not there
        Node curr = head, prev = head;
        while (curr != null && curr.data.getStudentID() < studID) {
            prev = curr;
            curr = curr.next;
        }
        if(head != null){
            prev.next = curr.next;
            return true;
        }
        return false;
        
    }
}
