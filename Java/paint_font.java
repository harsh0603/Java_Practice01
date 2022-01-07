// import java.awt.*;
// import java.awt.event.*;


// class MyFrame extends Frame {
//     int x =0, y=0;
//     MyFrame(){
//         super("The Paint and Font");
//         addMouseMotionListener(new MouseAdapter(){
//             public void mouseMoved(MouseEvent me){
//                 x = me.getX();
//                 y = me.getY();
//                 repaint();  //this is a method of frame to call the paint class
//             }
//         });



//         addWindowListener(new WindowAdapter(){
//             public void windowClosing(WindowEvent we)
//             {   
        
//           System.exit(0);                
                                       
     
//           }});
//     }


//     public void paint(Graphics g){
//         g.setColor(Color.red);
//         g.fillOval(x,y,50,50);
//     }



    

// }








// this is for font









import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame {
    int x =0, y=0;
    MyFrame(){
        super("The Paint and Font");
        addMouseMotionListener(new MouseAdapter(){
            public void mouseMoved(MouseEvent me){
                x = me.getX();
                y = me.getY();
                repaint();  //this is a method of frame to call the paint class
            }
        });



        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {   
        
          System.exit(0);                
                                       
     
          }});
    }


    public void paint(Graphics g){
        g.setColor(Color.red);
        g.setFont(new Font("Harsh Sharma",Font.BOLD,50));
        g.drawString("Hello", x, y);
    }



    

}










public class paint_font {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(400,400);
        mf.setVisible(true);
    }
}
