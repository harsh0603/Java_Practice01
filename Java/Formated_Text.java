import java.text.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.NumberFormatter;


class MyText extends JFrame{
  MyText(){
    super("The Formated Text");
    JTextField tf = new JTextField(15);
    DateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
    JFormattedTextField ft = new JFormattedTextField(df);
    setLayout(new FlowLayout());
    ft.setColumns(15);
    ft.setValue(0);
    

    NumberFormat nf =  NumberFormat.getInstance();
    NumberFormatter nft = new NumberFormatter(nf);
    JFormattedTextField tf2 = new JFormattedTextField(nft);
    tf2.setColumns(15);
    nft.setAllowsInvalid(false);
    nft.setMaximum(100000);


    NumberFormat nf2 =  NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormatter nft2 = new NumberFormatter(nf2);
    nft.setMaximum(1000);
    JFormattedTextField tf3 = new JFormattedTextField(nft2);
    tf3.setColumns(15);
    tf3.setValue(0);
    add(tf);
    add(ft);
    add(tf2);
    add(tf3);
  }
}

public class Formated_Text {
  public static void main(String[] args) {
      MyText mt = new MyText();
      mt.setSize(500,500);
      mt.setVisible(true);
      mt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }  
}
