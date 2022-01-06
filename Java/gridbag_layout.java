
// import java.awt.*;
// import java.awt.event.*;





// class Mygrid extends Frame{
//     Button b1,b2,b3,b4,b5,b6;

//     public Mygrid(){
//       super("gridbag");
//       b1 =new Button("One");
//       b2 =new Button("Two");
//       b3 =new Button("Three");
//       b4 =new Button("Four");
//       b5 =new Button("Five");
//       b6 =new Button("Six");
    
//     setLayout(new GridLayout(3,3));

//     add(b1);
//     add(b2);
//     add(b3);
//     add(b4);
//     add(b5);
//     add(b6);
    
    
    
    
//     }
// }


// public class gridbag_layout {
//     public static void main(String[] args) {
//         Mygrid mg = new Mygrid();
//         mg.setSize(800,800);
//         mg.setVisible(true);
//     }
// }








// gridBag layout-------------->














import java.awt.*;






class Mygrid extends Frame{
    Button b1,b2,b3,b4,b5,b6;

    public Mygrid(){
      super("gridbag");
      b1 =new Button("One");
      b2 =new Button("Two");
      b3 =new Button("Three");
      b4 =new Button("Four");
      b5 =new Button("Five");
      b6 =new Button("Six");
    
      GridBagLayout g = new GridBagLayout();
       GridBagConstraints gbc = new GridBagConstraints(); //thsi is the constraint class of 
                                                          //the x and y
    
      setLayout(g);


      gbc.gridx = 1;  //constraint asign to the button
      gbc.gridy = 1;
    add(b1, gbc);

    
    gbc.gridx = 1;
    gbc.gridy = 3;
    add(b2,gbc);

    
    gbc.gridx = 2;
    gbc.gridy = 2;

    add(b3,gbc);

    
    gbc.gridx = 2;
    gbc.gridy = 4;
    add(b4,gbc);

    
    gbc.gridx = 3;
    gbc.gridy = 1;
    add(b5,gbc);

    
    gbc.gridx = 4;
    gbc.gridy = 3;
    add(b6,gbc);
    
    
    
    
    }
}


public class gridbag_layout {
    public static void main(String[] args) {
        Mygrid mg = new Mygrid();
        mg.setSize(800,800);
        mg.setVisible(true);
    }
}
