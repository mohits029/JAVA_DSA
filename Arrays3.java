import java.util.ArrayList;
import java.util.Collections;
public class Arrays3 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(13);
        list.add(4);
        list.add(15);
        list.add(6);

        Collections.sort(list, Collections.reverseOrder());
        for (int i : list){
            System.out.print(i+"  ");
        }
    }
}
