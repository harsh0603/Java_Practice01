import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;




// These are for the input streams for the byte Array





// public class Byte_Array_Streams {
//     public static void main(String[] args) throws Exception {
//         byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
//         ByteArrayInputStream bis = new ByteArrayInputStream(b);
//         int x;
//         while ((x = bis.read()) != -1) {
//             System.out.print((char) x);
//         }
//         bis.close();

//     }
// }














// public class Byte_Array_Streams {
//     public static void main(String[] args) throws Exception {
//         byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
//         ByteArrayInputStream bis = new ByteArrayInputStream(b);
      
//         String str = new String(bis.readAllBytes());
//         System.out.print(str);
//         bis.close();

//     }
// }










// These are for the output streams for the byte array











// public class Byte_Array_Streams {
//     public static void main(String[] args) throws Exception {
       
//         ByteArrayOutputStream bis = new ByteArrayOutputStream(20); //hewre the 20 is the size of the byte array
//         bis.write('H');
//         bis.write('a');
//         bis.write('r');
//         bis.write('s');
//         bis.write('H');
//         bis.write('*');
//         byte b[] = bis.toByteArray();
        
//         for(byte x:b){
//             System.out.print((char)x);
//         }
//         bis.close();

//     }
// }











// Writing  the byte array stream in the file 




// public class Byte_Array_Streams {
//     public static void main(String[] args) throws Exception {
       
//         ByteArrayOutputStream bis = new ByteArrayOutputStream(20); //hewre the 20 is the size of the byte array
//         bis.write('H');
//         bis.write('a');
//         bis.write('r');
//         bis.write('s'); 
//         bis.write('H');
//         bis.write('*');
//         bis.writeTo(new FileOutputStream("C:/Users/dell/Dropbox/PC/Desktop/new/Test3.txt")); //Here the writeTo is a function use to write in the file

//         bis.close();

//     }
// }


