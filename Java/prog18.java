

interface student{
    int num = 14;
    void count(int total);
    void subject(int type);
    default void greet(){
        System.out.println("Good morning....");
    }

}
interface teacher{
    void number(int Class);
    private void marks(){
        System.out.println("Good works...");
    }
    void name(String Name);
    default void theSay(){
        marks();
    }
}


class principle{
    void talks(){
        System.out.println("Welcome to all student and the teacher");
    }
} 

class school extends principle implements student,teacher{
    public void count(int total){
        System.out.println("there are total in thousands: "+total);
    }
    public void subject(int type){
        System.out.println("there are total subjects in the class is: "+type);
    }
   
    public void number(int Class){

        System.out.println("there are total: "+Class+" Class");
    }
    public void name(String Name){
        System.out.println("there are total: "+Name+" names");
    }

}
public class prog18 {
    public static void main(String[] args) {
        school obj =new school();
        obj.talks();
        obj.greet();
        obj.count(obj.num);
        obj.subject(12);
        obj.theSay();
        obj.number(85);
        obj.name("52");


    }
}
