public class Backtrack {
    public static void backtracking(int arr[], int i, int val){
        if(i== arr.length){
            printArray(arr);
            return;
        }
        else{
            arr[i]= val;
            backtracking(arr, i+1, val+1);
            arr[i]= arr[i]-2;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] =new int[5];
        backtracking(arr, 0, 1);
        printArray(arr);
    }
}
