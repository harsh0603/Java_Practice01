import java.awt.*;
import java.awt.event.*;
import java.util.Date;


class Mykey extends Frame implements KeyListener{
    Label l1,l2,l3,l4;
    Mykey(){
        super("the key event");
        l1 =new  Label("");
        l2 =new  Label("");
        l3 =new  Label("");
        l4 =new  Label("");

        setLayout(null);

        l1.setBounds(40,40 , 100, 20);
        l2.setBounds(40,70 , 100, 20);
        l3.setBounds(40,100 , 100, 20);
        l4.setBounds(40, 130, 200, 30);




        add(l1);
        add(l2);
        add(l3);
        add(l4);

 
        addKeyListener(this);



    }
    
    public void keyTyped(KeyEvent e) {   //this is to show when the key is pressed but only for the key with ascii value(not shift,ctrl,etx);
        l2.setText("Key Typed");
        l4.setText(new Date(e.getWhen())+"");  //to show the key pressed time
    
    
    }
    
    public void keyPressed(KeyEvent e) {   //this is also for showing key Pressed but for all on the keyboard
        l1.setText("Key Pressed");

        l3.setText("");
        
    }
    
    public void keyReleased(KeyEvent e) {  //this is to show when the key is released
       l3.setText("Ky Released");
       l1.setText("");
       l2.setText("");
        
    }
}



public class key_event {
    public static void main(String[] args) {
        Mykey k = new Mykey();
        k.setSize(400,400);
        k.setVisible(true);
    }
}
