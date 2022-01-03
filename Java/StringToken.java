import java.util.*;

public class StringToken {
    public static void main(String[] args) {
        
        StringTokenizer name = new StringTokenizer("This is Harsh Side"," ");
        
        System.out.println("there is total: "+name.countTokens()+ " Tokens");
        
        while(name.hasMoreTokens()){  //this method will see if there is more token
          System.out.println(name.nextToken());
        }


        StringTokenizer st = new StringTokenizer("THis,is,harsh");
        System.out.println(st.nextToken(","));

        

    }
}
