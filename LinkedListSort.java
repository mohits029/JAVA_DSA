import java.util.LinkedList;
public class LinkedListSort {

   
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();

        ll.addLast(1);
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(0);
        ll.addLast(5);
        ll.sort(null);
        System.out.println(ll);
    }
}
