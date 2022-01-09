
import java.io.*;



public class IO_1 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:/Users/dell/Dropbox/PC/Desktop/new/Test.txt");  //this is make the input in the file
            String str = "Learn Java Programming";
            // fos.write(str.getBytes());
            fos.write(str.getBytes(), 6, str.length()-6); //it will write from the 6th index to the end
            fos.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}