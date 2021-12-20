
class school{
    private int roll;
    private String name;
    
    school(String Name,int Roll){
        name = Name;
        roll = Roll;
    }

    public void getName(String n_ame){
        name = n_ame;
    } 
    public String setName(){
        return name;
    }
    
    public void getId(int r_oll){
        roll = r_oll;
    }
    
    public int setId(){
       return roll ;
    }

}
public class prog10 {
    public static void main(String[] args) {
        
        school obj =new school("Sharma",17);
        // obj.getName("harsh");
        // obj.getId(14);
        System.out.println("the name is "+ obj.setName());
        System.out.println("the rollno is "+ obj.setId());

    }
}
