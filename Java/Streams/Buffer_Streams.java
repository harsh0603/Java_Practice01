import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;





// public class Buffer_Streams {
//     public static void main(String[] args)throws Exception {
//         FileInputStream fis = new FileInputStream("C:/Users/dell/Dropbox/PC/Desktop/new/Test3.txt");
//         BufferedInputStream bis = new BufferedInputStream(fis); //here now the buffer stream will connect to the file input stream

//         int x;
//         while((x=bis.read())!=-1){
//             System.out.print((char)x);
//         } System.out.println();
    
//         System.out.println("File Stream can use mark "+ fis.markSupported());
//         System.out.println("Buffer Stream can use mark "+ bis.markSupported());
//     fis.close();
//     bis.close();
//     }


// }










// The demonstration of the use of the buffer Stream








// public class Buffer_Streams {
//     public static void main(String[] args)throws Exception {
//         FileInputStream fis = new FileInputStream("C:/Users/dell/Dropbox/PC/Desktop/new/Test3.txt");
//         BufferedInputStream bis = new BufferedInputStream(fis); //here now the buffer stream will connect to the file input stream

//         System.out.print((char)bis.read());   //H
//         System.out.print((char)bis.read());   //a
//         System.out.print((char)bis.read());   //r
//         bis.mark(2); //2 is the limit of the letter to be use ahead of mark as the influence of mark
//         System.out.print((char)bis.read());   //s
//         bis.reset();   //this is a method use to reset the stream's control to the mark again
//         System.out.print((char)bis.read());   //s
//         System.out.print((char)bis.read());   //H
//         System.out.print((char)bis.read());   //*
//     fis.close();
//     bis.close();
//     }


// }











// BufferReader






public class Buffer_Streams {
    public static void main(String[] args)throws Exception {
        FileReader fis = new FileReader("C:/Users/dell/Dropbox/PC/Desktop/new/Test3.txt");
        BufferedReader bis = new BufferedReader(fis); //here now the buffer stream will connect to the file input stream

    
        System.out.println("String form: "+ bis.readLine()); //this is a method use to read the file in the form of String 
        
    fis.close();
    bis.close();
    }




}