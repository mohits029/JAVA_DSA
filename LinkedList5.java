public class LinkedList5 {
    
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    static Node head;
    static Node tail;

    public void addLast(int n){
        if(head== null){
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


    public void addFirst(int n){
        Node newNode= new Node(n);
        
        if(head== null){
            head= newNode;
            tail= newNode;
            
        }else{
            newNode.next= head;
            head= newNode;
        }
    }

    public void addinIndex(int data, int indx){
        Node newNode= new Node(data);
        
        if(head== null){
            head= newNode;
            tail= newNode;
        }

        else if(indx==0){
            newNode.next= head;
            head= newNode;
        }

        else{
            int i=0;
            Node curr= head;

            while (i<indx) {
                if(i==indx-1){
                    Node temp= curr.next;
                    curr.next= newNode;
                    newNode.next= temp;
                }
                curr= curr.next;
                i++;
            }
        }
    }

    public void display(Node curr){
        while (curr!= null) {
            System.out.print(curr.data+" -> ");
            curr= curr.next;
        }
    }

    public static void main(String[] args) {
        LinkedList5 list1= new LinkedList5();
        list1.addLast(10);
        list1.addLast(20);
        list1.addLast(30);
        list1.addLast(40);

        list1.addFirst(500);
        list1.addFirst(600);        
        list1.addinIndex(400, 3);


        list1.display(list1.head);

    }
}
