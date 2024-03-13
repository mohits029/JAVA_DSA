import java.util.ArrayList;
public class TargetSum {
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
        height.sort(null);

        System.out.println(height);
        int target= 7;
        int sp=0;
        int ep= height.size()-1;


        while (sp < ep) {
            int temp= height.get(sp) + height.get(ep);

            if(temp== target){
                System.out.print(height.get(sp) +" + "+ height.get(ep)+" = "+temp);
                break;
            }

            else if(temp > height.get(ep)){
                ep--;
            }else{
                sp++;
            }
        }
    }
}
