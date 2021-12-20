abstract class base{
    public base(){
        System.out.println("this is the base class constructor");
    }
    abstract void display(int a,String sc);
}
class derived extends base{

    public void display(int a,String st){
        System.out.println("this is the method which is implemented from the base class");
    }
}
public class prog16 {
    public static void main(String[] args) {
        
        base obj = new derived(); 
        obj.display(4,"harsh");
    }
}
