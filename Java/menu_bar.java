import java.awt.*;
import java.awt.event.*;




class MyFrame extends Frame{
    MenuBar mb;
    TextField t;
    Menu file,sub;
    MenuItem open,save,close,closeall;
    CheckboxMenuItem auto;

    MyFrame(){
        super("Menu Bar");
        open = new MenuItem("open");
        save = new MenuItem("save");
        close = new MenuItem("close");
        closeall = new MenuItem("closeall");
        auto = new CheckboxMenuItem("Auto Save");



        file = new Menu("File");
        sub = new Menu("sub");
        file.add(open);
        file.add(save);
        file.add(auto);
        file.add(sub);

        sub.add(close);
        sub.add(closeall);

        mb = new MenuBar();
        mb.add(file);
        setMenuBar(mb);

        t = new TextField(20);
        add(t);


        open.addActionListener((ActionEvent ae)-> t.setText("open"));
        save.addActionListener((ActionEvent ae)-> t.setText("save"));
        close.addActionListener((ActionEvent ae)-> t.setText("close"));
        closeall.addActionListener((ActionEvent ae)-> t.setText("closeall"));


        auto.addItemListener((ItemEvent ie)->{
            if(auto.getState()) t.setText("Auto On");
            else t.setText("Auto off");
        });




        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {   
        
          System.exit(0);                
                                       
     
          }});


    }

}


public class menu_bar {
public static void main(String[] args) {
    MyFrame mf = new MyFrame();
    mf.setSize(600,600);
    mf.setVisible(true);
}    
}
