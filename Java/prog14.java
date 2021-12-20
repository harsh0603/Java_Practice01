// Method Overriding 

class vehicle{
    public void type(){
        System.out.println("there is three type vehicle");
    }
}

class bike extends vehicle{
    @Override
    public void type(){
        System.out.println("there is two type of bike");
    }
}
public class prog14 {
    public static void main(String[] args) {
        vehicle a = new vehicle();
        a.type();
        bike b = new bike();
        b.type();
    }
}
