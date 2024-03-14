package LinkedList1;

public class MyClass2 {

    public static void display2(Node temp){
        if (temp== null){
            return;
        }else{
            display2(temp.next);
            System.out.print(temp.data+"  ");
            return;
        }
    }
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
        display2(head);
    }
}
