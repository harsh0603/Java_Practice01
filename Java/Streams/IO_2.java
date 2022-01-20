
import java.io.FileInputStream;
import java.io.FileReader;



public class IO_2{
    public static void main(String[] args)  
    {
    
        try(FileInputStream fis = new FileInputStream("C:/Users/dell/Dropbox/PC/Desktop/new/Test.txt")){   

                 byte b[] = new byte[fis.available()];   //this available method will check the length  
                 fis.read(b);
                 String str = new String(b);
                 System.out.println(str);

        }catch(Exception e){}
    }
}















// public class IO_2{
//     public static void main(String[] args)  throws Exception
//     {
    
//         try( FileReader fr = new FileReader("C:/Users/dell/Dropbox/PC/Desktop/new/Test.txt")){  

//               int x;
//               while((x=fr.read())!=-1){ //this mean the loop will work till the compiler hit no character

//                 System.out.print((char)x); //this is convert the interger ASCII value into the char again
//               }

//         }
//     }
// }


