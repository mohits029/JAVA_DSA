import java.util.ArrayList;
public class Arrays4 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> main_list= new ArrayList<>();

        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(2);
        list1.add(4);

        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(5);
        list2.add(10);

        main_list.add(list1);
        main_list.add(list2);

        for(int i=0; i< main_list.size(); i++){
            System.out.println(main_list.get(i));
        }
    }
}
