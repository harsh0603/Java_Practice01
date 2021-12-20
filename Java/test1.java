import java.util.Scanner; 
 
 
 
class TimeLimitExceededException extends Exception{ 
public TimeLimitExceededException(String msg){ 
super(msg); 
} 
} 
 
public class test1 { 
 
 

public static void main(String[] args) { 
    // String clock;
    // Scanner sc = new Scanner(System.in); 
    // clock = sc.next(); 
    String clock = "Close";
try{ 
    
    if(clock == "Close"){
        throw new TimeLimitExceededException("The time limit is exceeded"); 
} 
}
catch(TimeLimitExceededException e){ 
System.out.println("Caught the exception");
System.out.println(e.getMessage()); 

} 

} 
}
