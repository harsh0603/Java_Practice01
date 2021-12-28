class MyThr extends Thread{
    public MyThr(String name){
        super(name);

    }
    public void run(){
        for(int i =0;i<100;i++){

            System.out.println("the name of thread is: "+this.getName());
        }
    }
}

public class threadPriority {
    public static void main(String[] args) {
        MyThr th1 = new MyThr("harsh");
        MyThr th2 = new MyThr("sharma");
        MyThr th3 = new MyThr("vinika");
        MyThr th4 = new MyThr("vashisht");
        th1.setPriority(10);
        th2.setPriority(1);
        th3.setPriority(1);
        th4.setPriority(1);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}
