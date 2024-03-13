import java.util.ArrayList;
public class WaterProblem2 {
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

        int sp= 0;
        int ep= height.size()-1;
        int max_water=0;

        while (sp < ep) {
            int ht= Math.min(height.get(sp),height.get(ep));
            int wt= ep-sp;
            max_water= Math.max(max_water, ht*wt);

            if(sp<ep){
                sp++;
            }else{
                ep--;
            }
        }
        System.out.println(max_water);
    }
}
