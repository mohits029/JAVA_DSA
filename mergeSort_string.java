public class mergeSort_string {
    public static void sortThisString(String names[], int si, int ei){
        if(si>= ei){
            return;
        }else{
            int mid= si+ (ei-si)/2;
            sortThisString(names, si, mid);
            sortThisString(names, mid+1, ei);
            sort_str(names, si, ei, mid);
        }
    }


    public static void sort_str(String names[], int si, int ei, int mid){
        String temp[]= new String[ei-si+1];
        int i= si;
        int j= mid+1;
        int x=0;

        while(i<= mid && j<=ei){
            int ch= names[i].compareTo(names[j]);
            if(ch<0){
                temp[x++]= names[i++];
            }
            else{
                temp[x++]= names[j++];
            }
        }

        while (i<= mid) {
            temp[x++]= names[i++];
        }

        while (j<= ei) {
            temp[x++]= names[j++];
        }

        for(int a=0, b=si; i<temp.length; a++,a++){
            names[b]=temp[a];
        }
    }
    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury"};
        sortThisString(arr, 0, arr.length-1);


        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        
    }
}
