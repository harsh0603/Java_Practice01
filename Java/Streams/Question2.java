import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;


public class Question2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fr = new FileInputStream("C:/Users/dell/Dropbox/PC/Desktop/new/Test.txt");
        FileInputStream fir = new FileInputStream("C:/Users/dell/Dropbox/PC/Desktop/new/Test2.txt");
        System.out.println("Taking input in the sequence for the both files ....");
        SequenceInputStream sq = new SequenceInputStream(fr,fir); //this class will read the both of the files in a sequence...
        FileOutputStream fo = new FileOutputStream("C:/Users/dell/Dropbox/PC/Desktop/new/Final.txt");
        int j;
        System.out.println("writing the sequence in the final file.......");
        while((j=sq.read())!=-1){
            fo.write(j);
        }

        fir.close();
        fr.close();
        fo.close();
        sq.close();
    }
}
