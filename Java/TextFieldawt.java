import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends Frame
{
    Label l1;
    Label l2;
    TextField tf;
    public MyFrame2(){
        super("write in the field");
        l1 = new Label("No text is entered");
        l2 = new Label("click enter key to change");
        tf = new TextField(20);
        tf.setEchoChar('*'); //this is save the visibility of the enterd text
        Handler h= new Handler(); //have made the object of the inner class
        tf.addTextListener(h);
        tf.addActionListener(h);


        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);

    }
    class Handler implements TextListener,ActionListener{     //this is a inner class

        public void textValueChanged(TextEvent te){   //this is method for setting the entered text in l1
            l1.setText(tf.getText());
        }
    
        public void actionPerformed(ActionEvent ae){   //this is method for setting the entered text in l2
            l2.setText(tf.getText());
        }
    
    }
}




public class TextFieldawt {
    public static void main(String[] args) {
        MyFrame2 f2 = new MyFrame2();
        f2.setSize(400,400);
        f2.setVisible(true);
    }
}
