public class BacktrackingPremutation {
    public static void findPremutation(String str, String ans, int idx){
        if(ans.length()== str.length()){
            System.out.println(ans);
            return;
        }else{
            findPremutation(str, ans+str.charAt(idx), idx+1);
            
        }
    }
}
