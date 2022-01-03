import javax.swing.event.SwingPropertyChangeSupport;

class A{
    
   A(){
       System.out.println("this is the A class");
   }
}

class B extends A{
    B(){
        System.out.println("this is the class B");
    }
}

public class Instanceof {
  public static void main(String[] args) {
   B a1 =new B();
   B a2 = null;
   System.out.println("is a1 instance of A(): "+ (a1 instanceof A)); 
   System.out.println("is a1 instance of B(): "+ (a1 instanceof B)); 
   System.out.println("is a2 instance of any: "+ (a2 instanceof A)); 

}  
}
