import java.util.ArrayList;
public class Arrays2 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);

        int temp= list.get(1);
        list.set(1, list.get(0));
        list.set(0, temp);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
