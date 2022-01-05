
import java.awt.*;
import java.awt.event.*;


class MyFame extends Frame implements ActionListener{
    Label l;
    Button b;
    int count =0;

    public MyFame(){
        super("Button Action");
        l =new Label("  "+count);
        b = new Button("click to increase");
        b.addActionListener(this); //here this is because the action method is in the same class

        setLayout(new FlowLayout());
        add(l);
        add(b);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("   "+count);

        
    }
    
}

public class ButtonDemo_awt {
    public static void main(String[] args) {
        MyFame f = new MyFame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}