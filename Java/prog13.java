// this keyword


class Student{
    int roll;
    String name;
    Student(int roll,String name){
       this.roll = roll;
       this.name= name;
    }
    void display(){System.out.println("the roll no "+roll+" and the name "+name);}

}


public class prog13 {
    public static void main(String[] args) {
        Student a = new Student(42,"harsh");
        a.display();
    }
}
