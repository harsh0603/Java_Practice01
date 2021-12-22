class MyThread extends Thread{
    public void run(){
       int i = 0;
        while(i<50){
            System.out.println("this is one: ***");
            System.out.println("this is two: $$$");
        i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<50){
            System.out.println("this is thrid: ###");
            System.out.println("this is fourth: !!!");
        i++;
        }
    }
}
public class prog22 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
