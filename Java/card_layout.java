import java.awt.*;
import java.awt.event.*;


class Mycard extends Frame implements ItemListener{
    Checkbox c1,c2;
    Button b1,b2,b3;
    CardLayout cl;

    TextField t1,t2,t3;
    Panel p1,p2, cp,mainp;
    Mycard(){
        super("the card Layout");


        CheckboxGroup cg =new CheckboxGroup();

        c1 = new Checkbox("first",true,cg);
        c2 = new Checkbox("Second",false,cg);


        c1.addItemListener(this);
        c2.addItemListener(this);

        cp = new Panel();
        cp.add(c1);
        cp.add(c2);
        b1 =new Button("One");
        b2 =new Button("Two");
        b3 =new Button("Three");


        t1 = new TextField(20);
        t2= new TextField(20);
        t3 = new TextField(20);


        p1 = new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);


        p2 = new Panel();
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);



        mainp = new Panel();

        mainp.add("One",p1);
        mainp.add("Two",p2);


        cl = new CardLayout();
        mainp.setLayout(cl);


        
        add(cp,BorderLayout.NORTH);
        add(mainp,BorderLayout.CENTER);


     
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(c1.getState())
           cl.first(mainp);
           else cl.last(mainp);
        
    }

}


public class card_layout {
    
    public static void main(String[] args) {
        Mycard mg = new Mycard();
        mg.setSize(800,800);
        mg.setVisible(true);
    }
}
