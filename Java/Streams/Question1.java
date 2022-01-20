import java.io.*;

// public class Question1 {
//     public static void main(String[] args) throws Exception {
        

//         String st;
//         try(FileInputStream fr = new FileInputStream("C:/Users/dell/Dropbox/PC/Desktop/new/Test.txt")){
           
//             byte b[] = new byte[fr.available()]; 
            
//             System.out.println("Reading from the test file....... ");
//             fr.read(b);
//              st = new String(b);
//             st = st.toLowerCase();
            
           
//         }


//         try(FileOutputStream fwr = new FileOutputStream("C:/Users/dell/Dropbox/PC/Desktop/new/Test2.txt")){

//             String s = new String();
//             s = st;
//             System.out.println("go check the test2 file for the lower case");
//             fwr.write(s.getBytes());
//         }
//     }
// }






// optimal solution------->



public class Question1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fr = new FileInputStream("C:/Users/dell/Dropbox/PC/Desktop/new/Test.txt");
        FileOutputStream fwr = new FileOutputStream("C:/Users/dell/Dropbox/PC/Desktop/new/Test2.txt");


        int b;
        while((b= fr.read())!=-1){
            if(b>=65 && b<=90) fwr.write(b+32);
            else 
            fwr.write(b);
        }

        fr.close();
        fwr.close();
        
  
    }
}