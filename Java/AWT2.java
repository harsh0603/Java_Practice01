import java.awt.*;

class MyFrame extends Frame{
    Label l;
    TextField t;
    Button b;
    public MyFrame(){
        super("MY App");
        setLayout(new FlowLayout());

        l = new Label("name");
        t = new TextField(20);
        b = new Button("ok");

        add(l);
        add(t);
        add(b);

    }
}

public class AWT2 {
    public static void main(String[] args) {
        MyFrame mt = new MyFrame();
        mt.setSize(400,400);
        mt.setVisible(true);

    }
}
