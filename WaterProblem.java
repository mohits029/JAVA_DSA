import java.util.ArrayList;
public class WaterProblem {
    public static void main(String[] args) {
        ArrayList<Integer> height= new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int max_water= Integer.MIN_VALUE;

        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int l= Math.min(height.get(i), height.get(j));
                int w= j-i;
                int water_Level= l*w;
                max_water= water_Level>max_water ? water_Level :max_water;
            }
        }
        System.out.println(max_water);
        
    }
}
