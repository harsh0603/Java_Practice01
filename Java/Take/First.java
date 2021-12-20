
class using{
    int x = 14;
   protected String st = "Harsh";
   private double ft = 4.1;
   public char ch = 'g';
   void meth(){
    System.out.println(x);
    System.out.println(st);
    System.out.println(ft);
    System.out.println(ch);
   }
}  

class used extends using{
    void make(){
        System.out.println(x);
        System.out.println(st);
        // System.out.println(ft);
        System.out.println(st);
    }
}
public class First {
    public static void main(String[] args) {
        System.out.println("this is the first class");
        used obj = new used();
        obj.meth();
        obj.make();
    }
}
