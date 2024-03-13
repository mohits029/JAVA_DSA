import java.util.ArrayList;
public class Arrays {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);

        int max_val= Integer.MIN_VALUE;

        for(int i=0; i< list.size(); i++){
            if(max_val < list.get(i)){
                max_val= list.get(i);
            }
        }

        System.out.println(max_val);
    }
}
