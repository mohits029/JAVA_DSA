
import java. util.LinkedList;
public class ArrayList1 {
    public static void main(String[] args) {
      LinkedList<Integer> height= new LinkedList<>();
      
        height.add(6);
        height.add(5);
        height.add(5);
        
        height.push(12);
        height.push(13);
        System.out.println(height);

        height.pop();
        System.out.println(height);


        // int max_val= Integer.MIN_VALUE;

        // for(int i=0; i<height.size(); i++){
        //     if(max_val< height.get(i)){
        //         max_val= height.get(i);
        //     }
        // }
        // System.out.println("highest = "+max_val);


    
    }
}
