import java.util.Scanner;

class TimeLimitException extends Exception{
    void TimeLimitExceededException(String st){
         System.out.println(st);
    }
}

public class say {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        String clock = sc.next(); 
        // try{ 
        // checkTime(clock); 
        // } 
        // catch(Exception e){ 
        // System.out.println(e.getMessage()); 
        // } 
         
        } 
         
        public static void checkTime(String clock) throws TimeLimitException
        { 
        if(clock == "Close"){ 
         try {
            throw new TimeLimitExceededException("The time limit is exceeded");
        } catch (TimeLimitExceededException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        } 
        else{ 
        System.out.println("Entry is granted"); 
        } 
        } 
        
}
