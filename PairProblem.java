public class PairProblem {
    public static int pair(int n){
        if(n==1 || n==2){
            return n;
        }
        else{
            int single= pair(n-1);
            int couple= single*pair(n-2);

            return single+couple;
        }
    }
    public static void main(String[] args) {
        int logs= 3;
        System.out.println(pair(logs));

    }
}
