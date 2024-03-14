public class LinkedList {
    
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    static Node head;
    static Node tail;


    public void addLast(int n){
        if(head==null){
            Node newNode= new Node(n);
            head= newNode;
            tail= newNode;
        }
        else{
            Node newNode= new Node(n);
            tail.next= newNode;
            tail= newNode;
        }
    }

    public void display(Node temp){
        while (temp!=null) {
            System.out.print(temp.data+"  ");
            temp= temp.next;
        }
    }


    public static void main(String[] args) {
        LinkedList list1= new LinkedList();
        list1.addLast(2);
        list1.addLast(4);
        list1.addLast(6);
        list1.addLast(7);

        list1.display(list1.head);
    }
}
