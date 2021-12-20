interface company{
   default void policy(){
      System.out.println("Company policies");
    }
    default void permissions(){
        System.out.println("this the permission for the company");
    }
}

interface employee extends company{
  @Override
   default void permissions() {
       System.out.println("this is the permission for the employee");
   } 

}

class organisation implements company,employee{
public void permissions(){
    System.out.println("this is the permission of the class");
}
}
public class prog20 {
    public static void main(String[] args) {
        organisation obj = new organisation();
        obj.permissions();
        obj.policy();
    }
}
