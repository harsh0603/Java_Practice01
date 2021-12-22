
class MyThread_Runnable1 implements Runnable{
    public void run(){
        for(int i = 0;i<50;i++){

            System.out.println("this is Runnable 111");
        }
    }
}

class MyThread_Runnable2 implements Runnable{
    public void run(){
        for(int i = 0;i<50;i++){

            System.out.println("this is Runnable 222");
        }
    }
}
public class prog23 {
    public static void main(String[] args) {
        MyThread_Runnable1 t1  = new MyThread_Runnable1();
        Thread th1 = new Thread(t1);
        MyThread_Runnable2 t2 = new MyThread_Runnable2();
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }
}
