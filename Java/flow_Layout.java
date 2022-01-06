import java.awt.*;
import java.awt.event.*;





// class Mylayout extends Frame{
//     Button b1,b2,b3,b4,b5,b6;

//     public Mylayout(){
//       super("flow&Border");
//       b1 =new Button("One");
//       b2 =new Button("Two");
//       b3 =new Button("Three");
//       b4 =new Button("Four");
//       b5 =new Button("Five");
//       b6 =new Button("Six");
    
//     FlowLayout f = new FlowLayout();

//     f.setAlignment(FlowLayout.RIGHT); //this is to set the alignement of the layout button
 
//     f.setHgap(100);  //this is gap in b/w the buttons horizontaly
//     setLayout(f);

//     add(b1);
//     add(b2);
//     add(b3);
//     add(b4);
//     add(b5);
//     add(b6);
    
    
    
    
//     }
// }








// this is the Border Layout which is the default layout








class Mylayout extends Frame{
    Button b1,b2,b3,b4,b5,b6;

    public Mylayout(){
      super("flow&Border");
      b1 =new Button("One");
      b2 =new Button("Two");
      b3 =new Button("Three");
      b4 =new Button("Four");
      b5 =new Button("Five");
      b6 =new Button("Six");
    
    


    add(b1,BorderLayout.NORTH);
    add(b2,BorderLayout.SOUTH);
    // add(b3,BorderLayout.EAST);
    add(b4,BorderLayout.WEST);
    add(b5,BorderLayout.CENTER);
   // add(b6);


    Panel p = new Panel();  //this is a panel which will appear in the east of the border Layout
    p.setLayout(new GridLayout(4,1)); //3 is the number of row and 1 is the number of colmn
    
    p.add(new Button("Monday"));
    p.add(new Button("Tuesday"));
    p.add(new Button("Wednesday"));
    p.add(new Button("Thusday"));
    

    add(p,BorderLayout.EAST);   //add the panel in the east
    
    }
}







public class flow_Layout {
    public static void main(String[] args) {
        Mylayout ch = new Mylayout();
        ch.setSize(800,800);
        ch.setVisible(true);
    }
}
