import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node prev;
    static Node head;
    static Node tail;

    public Node(int x){
        this.data= x;
        this.next= null;
        this.prev= null;
    }
    
}

class Stack2 {

    public int push(int x){
        Node newNode= new Node(x);

        if(Node.head== null){
            Node.head= newNode;
            Node.tail= newNode;
            
        }else{
            Node.tail.next= newNode;
            newNode.prev= Node.tail;
            Node.tail= newNode; 
        }

        return 1;
    }

    public int pop(){
        // Node temp= Node.head;
        if(Node.tail==null){
            return -1;
        }
        else{
            int x= Node.tail.data;
            Node.tail= Node.tail.prev;
            return x;
        }
    }

    public int peak(){

        return Node.tail.data;
    }

    public void display(){
        Node temp = Node.head;
        while (temp!= null) {
            System.out.print("-> "+temp.data+" ");
            temp= temp.next;
        }
        System.out.println();

    }
}

public class Stack_LinkedList {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        Stack2 n1= new Stack2();

        boolean r= true;
        while (r) { 
            System.out.println("""
                    press 1 for push:
                    press 2 for pop:
                    press 3 for peak:
                    press 4 for display:
                    press 5 for exit:
                    """);
            int option= scan.nextInt();
            switch (option) {
                case 1:
                System.out.print("Enter element: ");
                    int e= scan.nextInt();
                    System.out.println(n1.push(e));
                    break;

                case 2:
                    System.out.println(n1.pop());
                    break;

                case 3:
                    System.out.println(n1.peak());
                    break;


                case 4:
                    n1.display();
                    break;

                case 5:
                    r= false;
                    break;
            
                default:
                    System.out.println("Your key is not valid!!");
                    break;
            }
        }
        
    }
}
