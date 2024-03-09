public class mergeprocedure {

    public static void mergeSort(int nums[], int si, int ei){
        if(si>=ei){
            return;
        }else{
            int mid= si+ (ei-si)/2;
            mergeSort(nums, si, mid);
            mergeSort(nums, mid+1, ei);
            merge(nums, si, ei, mid);
        }
    }

    public static void merge(int nums[], int si, int ei, int mid){
        int temp[]= new int[ei-si+1];
        int i= si;
        int j= mid+1;
        int x=0;

        while(i<= mid && j<= ei){
            if(nums[i]<nums[j]){
                temp[x++]= nums[i++];
            }
            else{
                temp[x++]= nums[j++];   
            }
        }

        while(i<= mid){
            temp[x++]= nums[i++];
        }
        while (j<= ei) {
            temp[x++]= nums[j++];
        }

        for(int a=0, b= si; a<temp.length; a++,b++){
            nums[b]= temp[a];
        }
    }
    public static void main(String[] args) {
        int nums[]= {7,11,1,4,6,2};
        mergeSort(nums, 0,nums.length-1);

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+"  ");
        }
    }
}
