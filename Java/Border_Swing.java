import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

class MyBorder extends JFrame{
    JLabel l;
    JPanel p;
    JTextField tf;
    JButton b;
   
    MyBorder(){
        super("this is the border on the panel");
        l = new JLabel("Name");
        tf = new JTextField(20);
        b = new JButton("ok");
        p = new JPanel();


        p.add(l);
        p.add(tf);
        p.add(b);

        setLayout(new FlowLayout());
        add(p);

        Border br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Login", TitledBorder.CENTER, TitledBorder.RIGHT);
        p.setBorder(br);
       
    }
   
}

public class Border_Swing {
    public static void main(String[] args) {
        MyBorder mb = new MyBorder();
        mb.setSize(800,800);
        mb.setVisible(true);
        mb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
