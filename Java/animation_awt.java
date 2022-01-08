

// We use the Threading in the animation in awt

// Use the Runnable interface in the my class

// use the sleep method to slow the animation

// the animationis done using the cordinates of the x and y value 

















import java.awt.*;



class MyFrame extends Frame implements Runnable{
   
    int x,y,tx,ty;
    MyFrame(){
        x = 100;
        y = 100;
        tx = ty=1;
      
        setLayout(null);
       

        Thread t = new Thread(this);
        t.start();
        repaint();
        try{
            Thread.sleep(5);
        }catch(Exception e){}
    }

    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(x,y,50,50);


    }


    public void run(){

        while(true){
            x+=tx;
            y+=ty;

            if(x<0||x>450)
            tx=tx*(-1);
            if(y<20||y>350)
            ty=ty*(-1);
        }
    }
}




public class animation_awt {
    public static void main(String[] args) {

        
        MyFrame mp = new MyFrame();
        mp.setSize(500,500);
        mp.setVisible(true);
    }
}
