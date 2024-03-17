import java.util.LinkedList;
public class List1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();

        ll.addLast(12);
        ll.addLast(14);
        ll.addLast(16);
        ll.addLast(18);
        ll.remove();
        ll.remove();

        System.out.println(ll);
    }
    
}
