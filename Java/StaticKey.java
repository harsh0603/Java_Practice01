
public class StaticKey {
       public void simple(){
          System.out.println("this is a simple method ");
       }   
        static public void add(int a,int b){
        int t1 =a;
        int t2 = b;
        System.out.println("the result is: "+(t1+t2));
    }
    static{
        
        System.out.println("this is the static block...."); 
        //this is executed before the main method
    }
    public static void main(String[] args) {
        StaticKey key = new StaticKey();
        key.simple();
        add(4,9);   //no need to make a instance of the class


    }
}
