import javax.sound.sampled.SourceDataLine;

class company{
    private int id = 42;
    private String name = "Harsh";

   public int getId(){
    
        return id;

    } 

    public String getName(){
           
           return name;
    }

}
public class prog9 {
public static void main(String[] args) {
    company obj = new company();
    System.out.println(obj.getId());
    System.out.println(obj.getName());
}
    

}
