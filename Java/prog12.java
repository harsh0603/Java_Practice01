class Base1{
    Base1(){
        System.out.println("the constructor of the base class");
    }
    Base1(int a){
        System.out.println("the constructor with the value of the Base1"+a);
    }
}

class Derived extends Base1{
    Derived(){
        System.out.println("the constructor of the derived class");
    }
          
    Derived(int a,int b){
        super(a);
        System.out.println("the constructor with the value"+b);
    }
}

public class prog12 {
     public static void main(String[] args) {
         Derived obj = new Derived(4,8);
     }
}
