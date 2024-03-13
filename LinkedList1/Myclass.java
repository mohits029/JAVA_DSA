package LinkedList1;

public class Myclass {
    public static void main(String[] args) {
        Node p1= new Node(10);
        Node p2= new Node(20);
        Node p3= new Node(30);
        Node p4= new Node(40);
        Node p5= new Node(50);
        p1.next= p2;
        p2.next= p3;
        p3.next= p4;
        p4.next= p5;

        Node head= p1;
        Node tail= p5;
        // Node newNode1= new Node(30, newNode);
        // Node newNode2= new Node(40, newNode1);
        
        Node x= new Node(11);
        x.next= p1;
        head= x;

        Node z= new Node(22);
        p5.next= z;
        tail= z;

        Node mi= new Node(55);
        p2.next= mi;
        mi.next= p3;

        Node curr= head;
        while (curr!=null) {
            System.out.println(curr.data);
            curr= curr.next; 
        }

    }
}
