import java.awt.*;
import java.awt.event.*;


class Myscroll extends Frame implements AdjustmentListener{
    Scrollbar red,blue,green;
    TextField tf;

    public Myscroll(){
        super("Scroll it !!!");
        red = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255); //here the bar oritintation is horizontal, default value,min. value,max. value
        green = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        tf = new TextField(20);

        tf.setBounds(50,50,300,50);  //diemension of the bars and field
        red.setBounds(50, 150, 300, 30);
        green.setBounds(50, 200, 300, 30);
        blue.setBounds(50, 250, 300, 30);

        setLayout(null);

        add(tf);
        add(red);
        add(green);
        add(blue);

        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
        //this is a class in the super class Adjust color which 
        //...show the color according to the value of the scrollbar
    }
}



public class scrollbar {
    public static void main(String[] args) {
        Myscroll ch = new Myscroll();
        ch.setSize(800,800);
        ch.setVisible(true);
    }
}
