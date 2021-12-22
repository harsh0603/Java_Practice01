import java.applet.*;
import java.awt.*;

import javafx.scene.image.Image;


public class Image_Applet extends Applet {

    java.awt.Image img1;
    public void init(){
        img1  = getImage(getDocumentBase(), "Harsh.jpg");
    }
    public void paint(Graphics g){
        g.drawImage(img1,100 , 100, this);
    }
}
