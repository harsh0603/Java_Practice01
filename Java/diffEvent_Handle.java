






// This is the normal way














// import java.awt.*;
// import java.awt.event.*;


// class MyFrame extends Frame implements ActionListener{
//     int count = 0;
//     TextField t;
//     Button b;

//     MyFrame(){
//         super("Event Handle");
//         b =new Button("click to increase");
//         t = new TextField("0",10);

//         setLayout(new FlowLayout());
//         add(t);
//         add(b);
//         b.addActionListener(this);
//         addWindowListener(new MyWindow());
//     }
//     public void actionPerformed(ActionEvent ae){
//         count++;
//         t.setText(String.valueOf(count));

//     }
//         class MyWindow extends WindowAdapter { 

//         public void windowClosing(WindowEvent we){             
//              System.exit(0);            
//         }  
//     }
// }


// public class diffEvent_Handle {
//     public static void main(String[] args) {
//         MyFrame mf = new MyFrame();
//         mf.setSize(400,400);
//         mf.setVisible(true);
//     }
// }














// This is using the lambda Expression










import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame {
    int count = 0;
    TextField t;
    Button b;

    MyFrame(){
        super("Event Handle");
        b =new Button("click to increase");
        t = new TextField("0",10);

        setLayout(new FlowLayout());
        add(t);
        add(b);
        b.addActionListener((ActionEvent ae)->{  //this is the expression of the lambda 
            count++;
            t.setText(String.valueOf(count));
    
        });







        
        addWindowListener(new MyWindow());
    }




        class MyWindow extends WindowAdapter { 

        public void windowClosing(WindowEvent we){             
             System.exit(0);            
        }  
    }
}


public class diffEvent_Handle {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(400,400);
        mf.setVisible(true);
    }
}
