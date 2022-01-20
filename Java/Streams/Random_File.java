
// Random Access File is use to write and read in one stream only




import java.io.RandomAccessFile;


public class Random_File {
    public static void main(String[] args)throws Exception {
        RandomAccessFile rmf = new RandomAccessFile("C:/Users/dell/Dropbox/PC/Desktop/new/RandomFile.txt","rw"); //here the rw is read and write
     
        System.out.println((char)rmf.read());
        System.out.println((char)rmf.read());
        System.out.println((char)rmf.read());
        rmf.write('j'); //write j in the file, ahead of the current pointer
        System.out.println((char)rmf.read());
        rmf.skipBytes(2); //Skip the pointer 2 byte ahead
        System.out.println((char)rmf.read());
        rmf.seek(4); //put pointer at 4 index byte from the start 
        System.out.println((char)rmf.read());
        System.out.println(rmf.getFilePointer()); //get the pointer number
        rmf.seek(rmf.getFilePointer()+2);
        System.out.println((char)rmf.read());

        rmf.close();
    
    }
}
