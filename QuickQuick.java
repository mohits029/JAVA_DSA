public class QuickQuick {

    public static void quickSort(int arr[], int si, int ei){

        if(si>= ei){
            return;
        }
        else{
            int p_indx= pivot(arr, si, ei);
            quickSort(arr, si, p_indx-1);
            quickSort(arr, p_indx+1, ei);
        }
    }


    public static int pivot(int arr[], int si, int ei){
        int pivot_idx= si;
        for(int i= si+1; i<=ei; i++){

            if(arr[i]< arr[pivot_idx]){
                int temp= arr[i];
                int j=i;
                while(j > pivot_idx){
                    arr[j]= arr[j-1];
                    j--;
                }
                arr[j]= temp;
                pivot_idx= j+1;
            }
        }

        return pivot_idx;
    }

    public static void main(String[] args) {
        int arr[]= {4,9,2,1,-7,8,0};
        quickSort(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
