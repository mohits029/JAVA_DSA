public class BacktrackSubset {
    public static void subsets(String str, String result, int idx){
        if(idx== str.length()){
            System.out.println(result);
            return;
        }
        else{
            subsets(str, result+str.charAt(idx), idx+1);
            subsets(str, result, idx+1);
            return;
        }
    }

    public static void main(String[] args) {
        String str= "abcdefghijklmnop";
        String result= "";
        subsets(str, result, 0);
    }
}
