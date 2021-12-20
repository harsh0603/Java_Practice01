interface GPS{
    void map();
    void places();

}

interface media{
    void play();
    void pause();
}

class phone implements media,GPS{
    public void map(){
        System.out.println("this is the map of india ");
    }
    public void places(){
        System.out.println("this is the capital of india");
    }

    public void play(){
        System.out.println("play the music");
    }
    public void pause(){
        System.out.println("pause the music");
    }
}

public class prog21 {
    public static void main(String[] args) {
        
        media obj = new phone();
        obj.play();
        obj.pause();
    }
    
}
