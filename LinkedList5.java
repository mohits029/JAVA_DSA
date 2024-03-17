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

    public int removeFirst(){
        if(head== null){
            return -1;
        }
        else if(head.next== null){
            int x=  head.data;
            head= null;
            tail= null;
            return x;

        }
        else{
            int x= head.data;
            head= head.next;
            return x;

        }
    }

    public int removeLast(){
        if(head== null){
            return -1;
        }
        else if(head.next== null){
            int x= head.data;
            head= tail= null;
            return x;

        }
        else{
            Node curr= head;
            
            while (curr.next.next!=null) {
                curr= curr.next;
            }
            int x= curr.next.data;
            tail= curr;
            curr.next= null;
            return x;
        }
    }

    public int iterative_search(Node curr, int key){
        if(curr== null){
            return -1;
        }

        while (curr!= null) {
            if(curr.data==key){
                return curr.data;
            }
            curr= curr.next;
        }
        return -1;
    }

    public void display(Node curr){
        while (curr!= null) {
            System.out.print(curr.data+" -> ");
            curr= curr.next;
        }
        System.out.println(curr);

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

        System.out.println("print Actual linked list: ");
        list1.display(head);

        // list1.removeFirst();
        // list1.removeFirst();
        list1.removeLast();
        list1.removeLast();

        System.out.println("print after deleting: ");
        list1.display(head);

        System.out.println(list1.iterative_search(head, 20));

        

    }
}
