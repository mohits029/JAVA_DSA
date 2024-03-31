import java.util.Scanner;

class Stack1{
    int size;
    int top=-1;
    int stack[];
    public Stack1(int n){
        this.size= n;
        stack= new int[size];
    }

    public int push(int x){
        if(top < stack.length-1){
            top++;
            stack[top]= x;
            return 1;
        }else{

            return -1;
        }
    }

    public int pop(){
        if(top < 0){
            return -1;
        }else{
            int temp= stack[top];
            stack[top]= 0;
            top--;
            return temp;
        }
    }

    public int peak(){
        return stack[top];
    }

    public void display(){
        System.out.println("***********STACK*************");
        for(int i= stack.length -1; i>=0; i--){
            System.out.println(stack[i]);
        }
        System.out.println("****************************");
    }

}


class Stack_Array{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter size of Stack: ");
        int n= scan.nextInt();
        Stack1 s1= new Stack1(n);


        boolean r= true;
        while (r) { 
            System.out.println("""
                    press 1 for push:
                    press 2 for pop:
                    press 3 for peak:
                    press 4 for display:
                    press 5 for exit:
                    """);
            int option= scan.nextInt();
            switch (option) {
                case 1:
                System.out.print("Enter element: ");
                    int e= scan.nextInt();
                    System.out.println(s1.push(e));
                    break;

                case 2:
                    System.out.println(s1.pop());
                    break;

                case 3:
                    System.out.println(s1.peak());
                    break;


                case 4:
                    s1.display();
                    break;

                case 5:
                    r= false;
                    break;
            
                default:
                    System.out.println("Your key is not valid!!");
                    break;
            }
        }
        
    }
}
