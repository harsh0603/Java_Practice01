import java.awt.*;
import java.awt.event.*;



class MyFrame extends Frame implements ItemListener{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg; //this is for the radio button
    public MyFrame(){
        super("Choice");
        cbg = new CheckboxGroup();
        l = new Label("                ");
        c1 =new Checkbox("Harsh",false,cbg);  //false mean that this will going to be deselected first default
        c2 =new Checkbox("Sharma",false,cbg); //false mean that this will going to be deselected first default
        c3 = new Checkbox("Vashisht",true,cbg); //true mean that this will going to be selected first default

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        setLayout(new FlowLayout());

        add(l);
        add(c1);
        add(c2);
        add(c3);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
      String st = "";
      if(c1.getState()){
          st = st+ " "+ c1.getLabel();
          
      }
      if(c2.getState()){
          st = st+ " "+ c2.getLabel();

      }
      if(c3.getState()){
          st = st+ " "+ c3.getLabel();

      }
      l.setText(st);
      if(st.isEmpty())
       l.setText("Nothing is selected");
    }

    
}


public class checkBoxawt {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
