public class Recursion1 {
    public static int way_of_set_tiles(int n){
        if(n==0 || n==1){
            return 1;
        }
        
            int vertical_way= way_of_set_tiles(n-1);
            int horizontal_way= way_of_set_tiles(n-2);
            

            return vertical_way + horizontal_way;
        
    }
    public static void main(String[] args) {
        int n= 3;
        int x= way_of_set_tiles(n);
        System.out.println(x);
    }
}
