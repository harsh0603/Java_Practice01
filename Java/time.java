import java.util.Scanner;



class TimeLimitExceededException extends Exception{
    public TimeLimitExceededException(String msg){
    //  System.out.println(msg);
        super(msg);
    }
}

public class time {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        String clock = "Close";
        // clock = sc.next();
        try{
            if(clock == "Close")
                throw new TimeLimitExceededException("The time limit is exceeded");
       
       }
       catch(TimeLimitExceededException a){
        System.out.println("Exception Caught");  
        System.out.println(a.getMessage());

       }
    
    }

}
