class Basic{
    protected void fun(){
        System.out.println("saurabh");
    } 
}

class Pro extends Basic{
    protected void fun(){
        super.fun();
        System.out.println("Jatin");
    }
}
public class Lavel {
    public static void main(String[] args) {
        Pro sachin= new Pro();
        sachin.fun();

        Basic mohit= new Basic();
        mohit.fun();
    }
}