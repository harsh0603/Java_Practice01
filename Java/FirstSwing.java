
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener{
JLabel l;
JButton b;
int count =0;

MyFrame(){
    super("Swing demo");
    setLayout(new FlowLayout());
    l = new JLabel("Clicked "+count+" Demo");
 
    b = new JButton("Clicked");
    add(l);
    add(b);
    add(new JButton("Cancel"));

    b.addActionListener(this);

    getRootPane().setDefaultButton(b); //this class pane is in the frame class
    b.setIcon(new ImageIcon("E:\\verified.png")); //this is to add the image in the button
}


public void actionPerformed(ActionEvent e){
    count++;
    l.setText("Clicked "+count+" Demo");
}
}

public class FirstSwing {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this close the app automatically
    }
}
