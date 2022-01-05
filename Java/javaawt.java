

import java.awt.*;

public class javaawt extends Frame {
    javaawt() {
      Button b = new Button("click Here");
      b.setBounds(50,100,100,40);
      add(b);  
      Label l =new Label("Click right here");
      l.setBounds(20,80,80,30);
      add(l);
      TextField t =new TextField();
      t.setBounds(20,100,80,30);
      add(t);
      setTitle("this is the button");
      setLayout(new FlowLayout());
      setSize(600,600);
      setVisible(true);
    }
    public static void main(String[] args) 
    {
        javaawt at =new javaawt();
    }
}





