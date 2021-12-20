import javax.swing.event.SwingPropertyChangeSupport;

class Animal{
  
    int amount;
    String sound;

    void animal(int num,String say){
       amount = num;
       sound = say;
    }

    public void display(){
        System.out.println("the amount of the animal is: "+amount+" with sound "+sound);
    }

}

class frog extends Animal{
    int jet = 15;
    char name = 'h';
    public void print(){
        System.out.println("the first word is "+name+" number "+jet);
    }
}

public class prog11 {
public static void main(String[] args) {
    frog obj  = new frog();
    obj.animal(12,"myoo");
   obj.display();
   obj.print();
}    
}
