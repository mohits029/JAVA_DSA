public class RemoveDuplicateString {

    public static void duplicate_remove(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx== str.length()){
            return;
        }
        char ch= str.charAt(idx);
        if(map[ch-'a']== false){
            newStr.append(ch);
            map[ch-'a']= true;
        }
        duplicate_remove(str, idx+1, newStr, map);
        return;
    }
    public static void main(String[] args) {
        String str= "apannacoollege";
        StringBuilder newString= new StringBuilder();
        System.out.println(newString);
        boolean map[]= new boolean[26];
        duplicate_remove(str, 0, newString, map); 

        System.out.println(newString);
    }
}
