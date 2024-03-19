public class Listx {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("hello123@Mohit1145");
        StringBuilder sb2= new StringBuilder("");
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) >= 65 && sb.charAt(i)<= 90 || sb.charAt(i) >= 97 && sb.charAt(i)<=122){
                sb2.append(sb.charAt(i));
            }
            else{
                sb2.append("#");
            }
        }
        System.out.println(sb2);
    }

}
