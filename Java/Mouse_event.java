import java.awt.*;
import java.awt.event.*;






class Mymouse extends Frame implements MouseListener,MouseMotionListener{
    Label l1,l2;
    Mymouse(){
        super("Mouse Event");
        l1 = new Label();
        setLayout(null);
        l2 = new Label();

        l1.setBounds(40,70,200,20);
        l2.setBounds(40,90,200,20);
        add(l1);
        add(l2);




        addMouseListener(this);
        addMouseMotionListener(this);


    }
   
    public void mouseDragged(java.awt.event.MouseEvent e) {
        l1.setText("Mouse Dragged");
        
    }
   
    public void mouseMoved(java.awt.event.MouseEvent e) {
        l1.setText("Mouse Moved");
        l2.setText("("+e.getX()+","+e.getY()+")");
        
    }
   
    public void mouseClicked(java.awt.event.MouseEvent e) {
       
        l1.setText("Mouse Clicked");
    }
    
    public void mousePressed(java.awt.event.MouseEvent e) {
        l1.setText("Mouse Pressed");
    }
    
    public void mouseReleased(java.awt.event.MouseEvent e) {
        l1.setText("Mouse Released");
    }
 
    public void mouseEntered(java.awt.event.MouseEvent e) {
       
        l1.setText("Mouse Entered");
    }
  
    public void mouseExited(java.awt.event.MouseEvent e) {
     
        l1.setText("Mouse Exit");
    }
}

public class Mouse_event {
    public static void main(String[] args) {
        Mymouse m2 = new Mymouse();
        m2.setSize(800,800);
        m2.setVisible(true);
    }
}
