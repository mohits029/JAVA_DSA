package LinkedList1;

public class MyClass3 {
    
    public static void search(Node temp, int a){
        if (temp== null){

            return;
        }
        else if(temp.data==a){
            System.out.println("found");
            System.out.println(temp);
            return;
        }
        else{
            search(temp.next, a);
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

        int a=20;
        Node head= p1;
        Node tail= p5;
        search(head,a);
    }
}
