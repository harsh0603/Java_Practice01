import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;







// Normal Definition of the piped Streams----->





// public class Piped_Streams {
//     public static void main(String[] args) throws IOException{
//         PipedInputStream pis = new PipedInputStream();
//         PipedOutputStream pos = new PipedOutputStream();
//         try{
//             pis.connect(pos);
//             pos.write(71);
//             System.out.println("Using read()on Input Stream: "+pis.read());
//             pos.write(44);
//             System.out.println("Using read()on Input Stream: "+pis.read());
//             pos.write(74);
//             System.out.println("Using read()on Input Stream: "+pis.read());
//             pos.write(55);
//             System.out.println("Using read()on Input Stream: "+pis.read());

//         }catch(Exception e){}
//         pos.close();
//         pis.close();
//     }
// }









// Piped Streams using threads----->


class Producer extends Thread{
    OutputStream os;
    public Producer(OutputStream o){
        os=o;
    }
    public void run(){
        int count = 1;
        while(count<=200){
           try{
            os.write(count);
            os.flush();
            System.out.println("Producer: "+count);
            System.out.flush();
            Thread.sleep(10);  
            count++;
           }catch(Exception e){}
        }
    }
}





class Consumer extends Thread{
    InputStream is;
    public Consumer(InputStream s){
        is=s;
    }
    public void run(){
        int x;
        while(true){
           try{
            x = is.read();
            
            
            System.out.println("Consumer: "+x);
            System.out.flush(); //this will flush the output on the terminal 
           }catch(Exception e){}
        }
    }
}



public class Piped_Streams {
    public static void main(String[] args) throws Exception{
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
       pos.connect(pis);
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);
       
        p.start();
        c.start();

        // pis.close();
        // pos.close();
    }
}
