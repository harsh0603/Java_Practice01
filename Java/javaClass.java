import java.util.Scanner;

class harsh{
    int id;
    String name;
    public void Display(){

        System.out.println(name+" has the id: "+id);
    }
    
    //This is a comment
    
}
class javaClass {
    
    
    public static void main(String[] args) {
        harsh obj = new harsh();
        obj.id = 42;
        obj.name = "sharma";
        obj.Display();

    }
}
