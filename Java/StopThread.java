class Thread1 extends Thread{
    public void run(){
        for(int i =0;i<5;i++){
            if(i/2==1){
                System.out.println("this is the stop for thread1 class");
                stop();
            }
            System.out.println("this is the term for first : "+i);
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        for(int i =0;i<5;i++){
            if(i/4==1){
                System.out.println("this is the stop for thread2 class");
                stop();
            }
            System.out.println("this is the term for second: "+i);
        }
    }
}

public class StopThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();

    }
}
