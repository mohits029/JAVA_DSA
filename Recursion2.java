public class Recursion2 {
    public static void main(String[] args) {
        String str= "apnnacollege";
        StringBuilder sb= new StringBuilder("");

        boolean flag= true;
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            flag=true;
            for(int j=0; j<sb.length(); j++){
                if(sb.charAt(j)==ch){
                    flag= false;
                    break;
                }
            }

            if(flag){
                sb.append(ch);
            }
        }

        System.out.println(sb);


    }
}
