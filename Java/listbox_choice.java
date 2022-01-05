import java.awt.*;
import java.awt.event.*;

class Mychoice extends Frame implements ItemListener,ActionListener{

    List l;
    Choice c;
    TextArea tf;

    public Mychoice(){
        super("List and the choice");
        l = new List(4,true); //here the 4 is the item shown default (true)
        c = new Choice();
        tf = new TextArea(20,30); //20 is the lines and 30 is the words limit per line

        l.add("Monday");  //list item
        l.add("Tuesday");  //list item
        l.add("Wednesday"); //list item
        l.add("Thursday"); //list item
        l.add("Friday");   //list item
        l.add("Saturday");      //.
        l.add("Sunday");        //.
        
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");
        c.add("6");
        setLayout(new FlowLayout());
    
        add(l);
        add(c);
        add(tf);
    
        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);
       
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
       if(e.getSource()==l){   //here the getSouce method will give us the selected item
           
           tf.setText("The week day: "+l.getSelectedItem()); //
       }else{
     
           tf.setText("the date is: "+c.getSelectedItem());
       }

    }
    @Override
    public void actionPerformed(ActionEvent e) {
       String list[] = l.getSelectedItems();
       String txt = "";

       for(String x:list){
     
        txt +=x+"\n"; 
       }
       tf.setText("the week day: "+txt);
    }


}


public class listbox_choice {
    public static void main(String[] args) {
        Mychoice ch = new Mychoice();
        ch.setSize(800,800);
        ch.setVisible(true);
    }
}
