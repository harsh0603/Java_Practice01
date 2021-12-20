class bike{
    bike(){
        System.out.println("there are a lot of bikes on the road");
    }
    void Display(){
        System.out.println("It look like the bicycle");
    }
}
class cycle extends bike{

void Display(){
 System.out.println("the basic concept of the bike is like the cycle");   
}
}
    
public class prog15 {
public static void main(String[] args) {
    
    bike obj = new cycle();
obj.Display();
}

}
