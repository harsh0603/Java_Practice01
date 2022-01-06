
// Use this class when want to use only one or two methods of the classes





// import java.awt.*;
// import java.awt.event.*;



// class Myadapt extends Frame implements ItemListener {
//     Label l;

//     Checkbox c;
//     Myadapt(){
//         super("Adapter Class");
//         c = new Checkbox("click to close with the checkBox");
//         l = new Label("close the window with X bitton");
//         setLayout(new FlowLayout());
//         add(l);
//         add(c);

//           addWindowListener(new MyWindow());
          
//           c.addItemListener(this);



//     }




//     class MyWindow extends WindowAdapter { 

//         public void windowClosing(WindowEvent we){   //this is method to close the window
          
//              System.exit(0);            
//         }  
//     }




//     public void itemStateChanged(ItemEvent e) {
//         if(c.getState())
//         System.exit(0);
        
//     }




// }

// public class adapter_class {
//     public static void main(String[] args) {
//         Myadapt ma = new Myadapt();
//         ma.setSize(600,600);
//         ma.setVisible(true);
//     }
// }












// now the same program with diffent approch





import java.awt.*;
import java.awt.event.*;



class Myadapt extends Frame implements ItemListener {
    Label l;

    Checkbox c;
    Myadapt(){
        super("Adapter Class");
        c = new Checkbox("click to close with the checkBox");
        l = new Label("close the window with X bitton");
        setLayout(new FlowLayout());
        add(l);
        add(c);

          addWindowListener(new WindowAdapter(){
              public void windowClosing(WindowEvent we)
              {   
          
            System.exit(0);               // Here the closing method is embeded while calling a anonmus object of the WindowAdapter class 
                                         //  ..through the constructor of it and the class is in the WindowListener class
       
            }});
          
          c.addItemListener(this);



    }




    




    public void itemStateChanged(ItemEvent e) {
        if(c.getState())
        System.exit(0);
        
    }




}

public class adapter_class {
    public static void main(String[] args) {
        Myadapt ma = new Myadapt();
        ma.setSize(600,600);
        ma.setVisible(true);
    }
}
