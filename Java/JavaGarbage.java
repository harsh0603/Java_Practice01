
public class JavaGarbage {
    public void finalize(){
      System.out.println("there is garbage invoking after this message");
    }
   public static void main(String[] args) {
       JavaGarbage a1 = new JavaGarbage();
       a1 =null;
       System.gc(); //this is the method for invoking the garbage 
   } 
}





