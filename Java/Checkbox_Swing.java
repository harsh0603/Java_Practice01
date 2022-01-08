import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyBox extends JFrame implements ActionListener{
    JCheckBox c1,c2;
    JTextField tf;
    JRadioButton r1,r2;

    MyBox(){
        super("THe check box");
        tf = new JTextField("Harsh sharma",20);
        tf.setBounds(10,20,100,80);

        c1 = new JCheckBox("Bold");
        c1.setMnemonic(KeyEvent.VK_B); //this is when we click alt+b the bold checkbox will get selected

        c2 = new JCheckBox("Italic");
        c2.setMnemonic(KeyEvent.VK_I);

        r1 = new JRadioButton("lower");
        r2 = new JRadioButton("upper");
        ButtonGroup bg = new ButtonGroup();  //this is for making the choice in b/w radio buttons
        bg.add(r1);
        bg.add(r2);

        c1.addActionListener(this);
        c2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);
        
        r1.setActionCommand("lower");
        r2.setActionCommand("upper");

        setLayout(new FlowLayout());
        add(c1);
        add(c2);
        add(r1);
        add(r2);
        add(tf);


    }

    
    public void actionPerformed(ActionEvent e) {
     
        switch(e.getActionCommand()){
            case "lower": tf.setText(tf.getText().toLowerCase()); //the action command for r1 is lower and for r2 is upper
                           break;
            case "upper": tf.setText(tf.getText().toUpperCase()); 
            break;
        }
        int b =0;int i =0;
        if(c1.isSelected())b = Font.BOLD;
        if(c2.isSelected())i = Font.ITALIC;

        Font f = new Font("this is font",b|i,15);  //this is the int value of the bold and Italic
        tf.setFont(f);
    }
}


public class Checkbox_Swing {
    public static void main(String[] args) {
        MyBox mb = new MyBox();
        mb.setSize(500,500);
        mb.setVisible(true);
        mb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
}
