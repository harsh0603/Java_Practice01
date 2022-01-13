// This is for the syschronized methods




// class A{
//     synchronized void addnew(int i){
//         Thread t = Thread.currentThread();
//         for(int n=0;n<=5;n++){
//            System.out.println(t.getName()+"-"+(i*n));
//         }
//     }
// }

// class MyThread  extends Thread{
// A a = new A();
// public void run(){
//     a.addnew(100);
// }    
// }

// public class Synchronized1 {
//     public static void main(String[] args) {
//         MyThread mt = new MyThread();
//         Thread t1 = new Thread(mt);
//         Thread t2 = new Thread(mt);
//         t1.setName("First");
//         t2.setName("Second");
       
//         t1.start();
//         t2.start();
//     }
// }







// This is Syschronized for block






class A extends Thread{
    void addnew(int i){
      synchronized(this){

          for(int n=0;n<=5;n++){
             System.out.println(this.getName()+"-"+(i*n));
          }
      }
    }
}

class MyThread  extends Thread{
A a = new A();
MyThread(A a){
    this.a = a;
}
public void run(){
    a.addnew(100);
}    
}

public class Synchronized1 {
    public static void main(String[] args) {
        A a1 = new A();
        MyThread mt = new MyThread(a1);
        MyThread mg = new MyThread(a1);
        
        mt.setName("First");
        mg.setName("Second");
       
        mt.start();
        mg.start();
    }
}