// class Thread4 extends Thread{
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("the thread: "+ isAlive());
//         }
//         System.out.println("this is the end of the thread");
//     }
// }

// public class Alive_Join {
//     public static void main(String[] args) {
//         Thread4 t4 = new Thread4();
//         t4.start();
//         System.out.println("the Thread in main: " + t4.isAlive());
//     }
// }
















class Thread4 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("the thread: "+ isAlive());
        }
        System.out.println("this is the end of the thread");
    }
}

public class Alive_Join {
    public static void main(String[] args) {
        Thread4 t4 = new Thread4();
        t4.start();
        try{
            t4.join(); //this is defined in the try block
        }
        catch(Exception e){

        }
        System.out.println("the Thread in main: " + t4.isAlive());
    }
}
