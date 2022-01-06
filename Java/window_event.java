import java.awt.*;
import java.awt.event.*;


class Mywindow extends Frame implements WindowListener{
    Label l;
    Mywindow(){
        super("Windows Event");
        l = new Label("     ");

        setLayout(new FlowLayout());
        l.setBounds(30, 50, 200, 50);
        add(l);
        addWindowListener(this);
    }
  
    public void windowOpened(WindowEvent e) {
       l.setText("Window Opened");
        
    }
    
    public void windowClosing(WindowEvent e) {
        l.setText("Window Closing");
        System.exit(0);
    }
    
    public void windowClosed(WindowEvent e) {
        l.setText("Window Closed");
        
    }
    
    public void windowIconified(WindowEvent e) {
        
        l.setText("Window Iconified");
    }
    
    public void windowDeiconified(WindowEvent e) {
        
        l.setText("Window Deiconified");
    }
   
    public void windowActivated(WindowEvent e) {
        
        l.setText("Window Activated");
    }
    
    public void windowDeactivated(WindowEvent e) {
        
        l.setText("Window Deactivated");
    }
}


public class window_event {
public static void main(String[] args) {
    Mywindow mw = new Mywindow();
    mw.setSize(400,400);
    mw.setVisible(true);
}    
}
