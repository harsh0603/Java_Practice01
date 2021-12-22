import java.applet.*;
import java.awt.*;

public class AppletParam extends Applet {
    String str = null;
    public void init(){
        str = getParameter("name");
    }
    public void paint(Graphics g){
        g.drawString(str,100,100);
    }
}
