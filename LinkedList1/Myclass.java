package LinkedList1;

public class Myclass {
    public static void main(String[] args) {
        Node head= new Node(10);
        Node p2= new Node(20);
        Node p3= new Node(30);
        Node p4= new Node(40);
        Node tail= new Node(50);
        head.next= p2;
        p2.next= p3;
        p3.next= p4;
        p4.next= tail;
        // Node newNode1= new Node(30, newNode);
        // Node newNode2= new Node(40, newNode1);
        
        Node curr= head;
        while (curr!= null) {
            System.out.print(curr.data+" ");
            curr= curr.next;
        }
    }
}
