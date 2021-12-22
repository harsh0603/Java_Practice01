class Thread3 extends Thread{
    public void run(){
        for(int i = 0;i<5;i++){
            try{
                if(i==2) sleep(3000);
            }
            catch(Exception e){

            }
            System.out.println("A: "+i);
        }
    }
}

public class SleepThread {
    public static void main(String[] args) {
        Thread3 t3 = new Thread3();
          t3.start();

    }
}
